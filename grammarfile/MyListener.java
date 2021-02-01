package grammarfile;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import errorfiles.ErrorRepository;
import grammarfile.MainParser.Function_callingContext;
import grammarfile.MainParser.Function_declaration_parametersContext;
import grammarfile.MainParser.Function_paremeters_valueContext;
import model.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

import com.udojava.evalex.Expression;

public class MyListener extends MainBaseListener {

    public CommonTokenStream tokens;
    public Expression EvalEx;
    public ErrorRepository errorRepo;
    public String currentFunction = "";
    public int currentNode = 0;
    public boolean isConstant = false;
    HashMap<String, FuncClass> funcTable = SymbolTableManager.getInstance().getFuncTable();

    public MyListener(MainParser parser) {
        this.tokens = (CommonTokenStream) parser.getTokenStream();
        this.errorRepo = new ErrorRepository();
    }

    public String convertExpression(List<Token> listtoken, HashMap<String, VarClass> varTable) {
        String expression = "";

        for (int x = 0; x < listtoken.size(); x++) {
            if (listtoken.get(x).getType() == 51) {
                if (varTable.containsKey(listtoken.get(x).getText())) {
                    if(varTable.get(listtoken.get(x).getText()).getType().equals("String")){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", listtoken.get(x).getText(), listtoken.get(x).getLine());
                    }
                    else{
                        if (!varTable.get(listtoken.get(x).getText()).getValue().isEmpty())
                            expression += varTable.get(listtoken.get(x).getText()).getValue();
                        else {
                            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                                    listtoken.get(x).getLine());
                            return "null";
                        }
                    }
                } else {
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                            listtoken.get(x).getLine());
                    return "null";
                }
            }
            else {
                expression += listtoken.get(x).getText();
            }
        }

        return expression;
    }

    public String convertLogical(List<Token> listtoken, HashMap<String, VarClass> varTable) {
        String expression = "";

        for (int x = 0; x < listtoken.size(); x++) {
            if (listtoken.get(x).getType() == 51) {
                if (listtoken.get(x).getText().equals("T")) {
                    expression += "1";
                } else if (listtoken.get(x).getText().equals("F")) {
                    expression += "0";
                } else {
                    if (varTable.containsKey(listtoken.get(x).getText())) {
                        if(varTable.get(listtoken.get(x).getText()).getType().equals("String")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", listtoken.get(x).getText(), listtoken.get(x).getLine());
                        }
                        else{
                            if (!varTable.get(listtoken.get(x).getText()).getValue().isEmpty())
                                expression += varTable.get(listtoken.get(x).getText()).getValue();
                            else {
                                errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                                        listtoken.get(x).getLine());
                                return "null";
                            }
                        }
                    } else {
                        errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                                listtoken.get(x).getLine());
                        return "null";
                    }
                }
            } else {
                if (listtoken.get(x).getType() == 38)
                    expression += "not";
                else
                    expression += listtoken.get(x).getText();
            }
        }

        return expression;
    }

    @Override public void enterAny_declaration(MainParser.Any_declarationContext ctx) { 
        if(ctx.CONSTANT() != null){
            isConstant = true;
        }
    }

    @Override public void exitAny_declaration(MainParser.Any_declarationContext ctx) { 
        isConstant = false;
    }

    @Override
    public void enterInt_declaration(MainParser.Int_declarationContext ctx) {
        String expr = "";
        if (ctx.expression() != null) {
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        } else if (ctx.INT_NUMBER() != null) {
            expr = ctx.INT_NUMBER().getText();
        } else if(ctx.function_calling() != null) {
            if(funcTable.containsKey(ctx.function_calling().LABEL().getText())){
                if(funcTable.get(ctx.function_calling().LABEL().getText()).getType().equals("int")){
                    expr = "0";
                }
                else{
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.function_calling().LABEL().getText(), ctx.getStart().getLine());
                }
            }
        }


        if (!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())
                && !funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().getText())){
            
            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                if (!expr.equals("null")) {
                    String type = ctx.INT_DEC().getText();
                    String varname = ctx.LABEL().getText();
    
                    if (!expr.equals("")) {
                        if (!expr.contains(".")) {
                            EvalEx = new Expression(expr);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarTable().put(varname,
                                    new VarClass(type, varname, value, currentFunction, currentNode, isConstant));
                        } else
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().getText(), ctx.getStart().getLine());
                    } else {
                        funcTable.get(currentFunction).getVarTable().put(varname,
                                new VarClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterFloat_declaration(MainParser.Float_declarationContext ctx) {
        String expr = "";

        if (ctx.expression() != null) {
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        } else if (ctx.FLOAT_NUMBER() != null) {
            expr = ctx.FLOAT_NUMBER().getText().replace("f", "");
        } else if(ctx.function_calling() != null) {
            if(funcTable.containsKey(ctx.function_calling().LABEL().getText())){
                if(funcTable.get(ctx.function_calling().LABEL().getText()).getType().equals("float")){
                    expr = "0";
                }
                else{
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.function_calling().LABEL().getText(), ctx.getStart().getLine());
                }
            }
        }

        if (!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())
                && !funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                if (!expr.equals("null")) {
                    String type = ctx.FLOAT_DEC().getText();
                    String varname = ctx.LABEL().getText();
    
                    if (!expr.equals("")) {
                        EvalEx = new Expression(expr);
                        BigDecimal result = EvalEx.eval();
    
                        String value = result.intValue() + "";
    
                        funcTable.get(currentFunction).getVarTable().put(varname,
                                new VarClass(type, varname, value, currentFunction, currentNode, isConstant));
                    } else {
                        funcTable.get(currentFunction).getVarTable().put(varname,
                                new VarClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterString_declaration(MainParser.String_declarationContext ctx) {
        String expr = "";

        if (ctx.STRING_TYPE() != null) {
            expr = ctx.STRING_TYPE().getText();
        } else if(ctx.function_calling() != null) {
            if(funcTable.containsKey(ctx.function_calling().LABEL().getText())){
                if(funcTable.get(ctx.function_calling().LABEL().getText()).getType().equals("String")){
                    expr = "0";
                }
                else{
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.function_calling().LABEL().getText(), ctx.getStart().getLine());
                }
            }
        }

        if (!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())
                && !funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                String type = ctx.STRING_DEC().getText();
                String varname = ctx.LABEL().getText();

                if (!expr.equals("")) {
                    expr = expr.replace("\"", "");
                    funcTable.get(currentFunction).getVarTable().put(varname,
                            new VarClass(type, varname, expr, currentFunction, currentNode, isConstant));
                } else {
                    funcTable.get(currentFunction).getVarTable().put(varname,
                            new VarClass(type, varname, currentFunction, currentNode));
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterBoolean_declaration(MainParser.Boolean_declarationContext ctx) {
        String expr = "";

        if (ctx.comparison_statement() != null) {
            Token first = ctx.comparison_statement().start;
            Token last = ctx.comparison_statement().stop;
            expr = convertLogical(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        } else if(ctx.function_calling() != null) {
            if(funcTable.containsKey(ctx.function_calling().LABEL().getText())){
                if(funcTable.get(ctx.function_calling().LABEL().getText()).getType().equals("bool")){
                    expr = "0";
                }
                else{
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.function_calling().LABEL().getText(), ctx.getStart().getLine());
                }
            }
        }

        if (!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().get(0).getText())
                && !funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().get(0).getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().get(0).getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                if (!expr.equals("null")) {
                    String type = ctx.BOOLEAN_DEC().getText();
                    String varname = ctx.LABEL().get(0).getText();
    
                    if (!expr.equals("")) {
                        EvalEx = new Expression(expr);
                        BigDecimal result = EvalEx.eval();
    
                        String value = result.intValue() + "";
    
                        funcTable.get(currentFunction).getVarTable().put(varname,
                                new VarClass(type, varname, value, currentFunction, currentNode, isConstant));
                    } else {
                        funcTable.get(currentFunction).getVarTable().put(varname,
                                new VarClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterInt_arr_declaration(MainParser.Int_arr_declarationContext ctx) {
        String size = "";

        if (ctx.expression() != null) {
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        }

        if (!funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().get(0).getText())
                && !funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().get(0).getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().get(0).getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                if (!size.equals("null")) {
                    String type = ctx.INT_DEC().get(0).getText();
                    String varname = ctx.LABEL().get(0).getText();
    
                    if (!size.equals("")) {
                        if (!size.contains(".")) {
                            EvalEx = new Expression(size);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarArrTable().put(varname,
                                    new VarArrClass(type, varname, value, currentFunction, currentNode, isConstant));
                        } else
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).getText(),
                                    ctx.getStart().getLine());
                    } else {
                        funcTable.get(currentFunction).getVarArrTable().put(varname,
                                new VarArrClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterString_arr_declaration(MainParser.String_arr_declarationContext ctx) {
        String size = "";

        if (ctx.expression() != null) {
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        }

        if (!funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().getText())
                && !funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }
            
            if(!isSame){
                if (!size.equals("null")) {
                    String type = ctx.STRING_DEC().get(0).getText();
                    String varname = ctx.LABEL().getText();
    
                    if (!size.equals("")) {
                        if (!size.contains(".")) {
                            EvalEx = new Expression(size);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarArrTable().put(varname,
                                    new VarArrClass(type, varname, value, currentFunction, currentNode, isConstant));
                        } else
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().getText(), ctx.getStart().getLine());
                    } else {
                        funcTable.get(currentFunction).getVarArrTable().put(varname,
                                new VarArrClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterBoolean_arr_declaration(MainParser.Boolean_arr_declarationContext ctx) {
        String size = "";

        if (ctx.expression() != null) {
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        }

        if (!funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().get(0).getText())
                && !funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().get(0).getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().get(0).getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                if (!size.equals("null")) {
                    String type = ctx.BOOLEAN_DEC().get(0).getText();
                    String varname = ctx.LABEL().get(0).getText();
    
                    if (!size.equals("")) {
                        if (!size.contains(".")) {
                            EvalEx = new Expression(size);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarArrTable().put(varname,
                                    new VarArrClass(type, varname, value, currentFunction, currentNode, isConstant));
                        } else
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).getText(),
                                    ctx.getStart().getLine());
                    } else {
                        funcTable.get(currentFunction).getVarArrTable().put(varname,
                                new VarArrClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterFloat_arr_declaration(MainParser.Float_arr_declarationContext ctx) {
        String size = "";

        if (ctx.expression() != null) {
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                    funcTable.get(currentFunction).getVarTable());
        }

        if (!funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().get(0).getText())
                && !funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().get(0).getText())) {

            boolean isSame = false;

            if(funcTable.get(currentFunction).getParams() != null){
                if(funcTable.get(currentFunction).getParams().containsKey(ctx.LABEL().get(0).getText())){
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
                    isSame = true;
                }
            }

            if(!isSame){
                if (!size.equals("null")) {
                    String type = ctx.FLOAT_DEC().get(0).getText();
                    String varname = ctx.LABEL().get(0).getText();
    
                    if (!size.equals("")) {
                        if (!size.contains(".")) {
                            EvalEx = new Expression(size);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarArrTable().put(varname,
                                    new VarArrClass(type, varname, value, currentFunction, currentNode, isConstant));
                        } else
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).getText(),
                                    ctx.getStart().getLine());
                    } else {
                        funcTable.get(currentFunction).getVarArrTable().put(varname,
                                new VarArrClass(type, varname, currentFunction, currentNode));
                    }
                }
            }
        } else {
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", ctx.LABEL().get(0).getText(), ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setFuncTable(funcTable);
    }

    @Override
    public void enterPrint_statement(MainParser.Print_statementContext ctx) {
        for (int x = 0; x < ctx.extended_value_print().size(); x++) {
            if (ctx.extended_value_print().get(x).expression() != null) {
                Token first = ctx.extended_value_print().get(x).start;
                Token last = ctx.extended_value_print().get(x).stop;
                String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                        funcTable.get(currentFunction).getVarTable());

                if (!expr.equals("null")) {
                    // put in PrintCommand
                }
            } else if (ctx.extended_value_print().get(x).LABEL() != null) {
                String key = ctx.extended_value_print().get(x).LABEL().getText();
                if (!funcTable.get(currentFunction).getVarTable().containsKey(key)
                        && !funcTable.get(currentFunction).getVarArrTable().containsKey(key)) {
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", key, ctx.getStart().getLine());
                }
            }
            // add else for STRING_TYPE() to put in PrintCommand
        }
    }

    @Override
    public void enterScan_statement(MainParser.Scan_statementContext ctx) {
        if (!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())) {
            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        } else {
            // ScanCommand
        }
    }

    @Override
    public void enterFunction_calling(MainParser.Function_callingContext ctx) {
        if (!funcTable.containsKey(ctx.LABEL().getText())) {
            errorRepo.reportErrorMessage("UNDECLARED_FUNCTION", ctx.LABEL().getText(), ctx.getStart().getLine());
        } 
        else if(ctx.function_paremeters_value().size() != 0){
            int funcCallingSize = ctx.function_paremeters_value().size();

            if (funcCallingSize != funcTable.get(ctx.LABEL().getText()).getParams().size()) {
                errorRepo.reportErrorMessage("PARAMETER_COUNT_MISMATCH", ctx.LABEL().getText(),
                        ctx.getStart().getLine());
            } else {
                Iterator<Entry<String, ParamClass>> iterParam = funcTable.get(ctx.LABEL().getText()).getParams().entrySet().iterator();
                HashMap<String, String> temphash = new HashMap<String, String>();

                for(int x=0; x<funcCallingSize; x++){
                    Function_paremeters_valueContext funcCallParam = ctx.function_paremeters_value().get(x);
                    ParamClass currParam = new ParamClass();

                    if(iterParam.hasNext())
                        currParam = iterParam.next().getValue();

                    if(funcCallParam.LABEL() != null){
                        if(temphash.containsKey(funcCallParam.LABEL().getText())){
                            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", funcCallParam.LABEL().getText(), ctx.getStart().getLine());
                        }
                        else if(funcTable.get(currentFunction).getVarTable().containsKey(funcCallParam.LABEL().getText())){
                            if(currParam.isArray() || !currParam.getType().equals(funcTable.get(currentFunction).getVarTable().get(funcCallParam.LABEL().getText()).getType())){
                                errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.LABEL().getText(), ctx.getStart().getLine());
                            }
                            temphash.put(funcCallParam.LABEL().getText(), funcCallParam.LABEL().getText());
                        }
                        else if(funcTable.get(currentFunction).getVarArrTable().containsKey(funcCallParam.LABEL().getText())){
                            if(!currParam.isArray() || !currParam.getType().equals(funcTable.get(currentFunction).getVarArrTable().get(funcCallParam.LABEL().getText()).getType())){
                                errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.LABEL().getText(), ctx.getStart().getLine());
                            }
                            temphash.put(funcCallParam.LABEL().getText(), funcCallParam.LABEL().getText());
                        }
                        else{
                            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", funcCallParam.LABEL().getText(), ctx.getStart().getLine());
                        }
                    }
                    else if(currParam.getType().equals("String") && !currParam.isArray()){
                        if(funcCallParam.STRING_TYPE() == null){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.getChild(0).getText(), ctx.getStart().getLine());
                        }
                    }
                    else if(currParam.getType().equals("int") && !currParam.isArray()){
                        if(funcCallParam.expression() == null && funcCallParam.number() == null){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.getChild(0).getText(), ctx.getStart().getLine());
                        }
                        else if(funcCallParam.expression() != null){
                            Token first = funcCallParam.expression().start;
                            Token last = funcCallParam.expression().stop;
                            String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                                    funcTable.get(currentFunction).getVarTable());

                            if(!expr.equals("null")){
                                if (expr.contains(".") && currParam.getType().equals("int")) 
                                    errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.expression().getText(), ctx.getStart().getLine());
                            }
                        }
                        else if(funcCallParam.number() != null){
                            if(funcCallParam.number().FLOAT_NUMBER() != null)
                                errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.getChild(0).getText(), ctx.getStart().getLine());
                        }
                    }
                    else if(funcCallParam.expression() != null){
                        Token first = funcCallParam.expression().start;
                        Token last = funcCallParam.expression().stop;
                        String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                                funcTable.get(currentFunction).getVarTable());

                        if(!expr.equals("null")){
                            if (expr.contains(".") && currParam.getType().equals("int")) 
                                errorRepo.reportErrorMessage("TYPE_MISMATCH", funcCallParam.expression().getText(), ctx.getStart().getLine());
                        }
                    }
                }
            }
        }
    }

    @Override public void enterReturn_statement(MainParser.Return_statementContext ctx) {
        String funcType = funcTable.get(currentFunction).getType();
        
        if(!funcType.equals("void")){
            if(ctx.LABEL() != null){
                if(funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())){
                    if(!funcTable.get(currentFunction).getVarTable().get(ctx.LABEL().getText()).getType().equals(funcType)){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().getText(), ctx.getStart().getLine());
                    }
                }
                else if(funcTable.get(currentFunction).getVarArrTable().containsKey(ctx.LABEL().getText())){
                    if(!funcTable.get(currentFunction).getVarArrTable().get(ctx.LABEL().getText()).getType().equals(funcType)){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().getText(), ctx.getStart().getLine());
                    }
                }
                else if(!funcTable.get(currentFunction).getParams().isEmpty()){
                    if(!funcTable.get(currentFunction).getParams().get(ctx.LABEL().getText()).getType().equals(funcType)){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().getText(), ctx.getStart().getLine());
                    }
                }
                else{
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
                }
            }
            else if(funcType.equals("String")){
                if(ctx.STRING_TYPE() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.getChild(1).getText(), ctx.getStart().getLine());
                }
            }
            else if(funcType.equals("int")){
                if(ctx.expression() == null && ctx.number() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.getChild(1).getText(), ctx.getStart().getLine());
                }
                else if(ctx.expression() != null){
                    Token first = ctx.expression().start;
                    Token last = ctx.expression().stop;
                    String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                            funcTable.get(currentFunction).getVarTable());
    
                    if(!expr.equals("null")){
                        if (expr.contains("."))
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.expression().getText(), ctx.getStart().getLine());
                    }
                }
                else if(ctx.number() != null){
                    if(ctx.number().FLOAT_NUMBER() != null){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.number().FLOAT_NUMBER().getText(), ctx.getStart().getLine());
                    }
                }
            }
            else if(funcType.equals("float")){
                if(ctx.expression() == null && ctx.number() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.getChild(1).getText(), ctx.getStart().getLine());
                }
            }
            else if(funcType.equals("bool")){
                if(ctx.comparison_statement() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.getChild(1).getText(), ctx.getStart().getLine());
                }
            }
        }
    }

    @Override public void enterAssignment_statement(MainParser.Assignment_statementContext ctx) { 
        // check if constant cannot asisgn
        // check if variable exists or not - functable(currentfunction).getvartable.containsKey()
        // after check if exist check if same type assigment pero pag float = int ok lang pero bawal int = float :D
        // yun function calling check mo lang type pero assign mo sa vartable = 0 yun value :D

        if(!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().get(0).toString())){
            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
        }else{
            if(funcTable.get(currentFunction).getVarTable().get(ctx.LABEL().get(0).toString()).isConstant()){
                errorRepo.reportErrorMessage("CONSTANT_REASSIGNMENT", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
            }else if(funcTable.get(currentFunction).getVarTable().get(ctx.LABEL().get(0).toString()).getType().equals("int")){
                if(ctx.number() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
                }else{
                    if(ctx.number().INT_NUMBER() == null){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
                    }
                }
            }else if(funcTable.get(currentFunction).getVarTable().get(ctx.LABEL().get(0).toString()).getType().equals("float")){
                if(ctx.number() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
                }else{
                    if(ctx.number().FLOAT_NUMBER() == null){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
                    }
                }
            }else if(funcTable.get(currentFunction).getVarTable().get(ctx.LABEL().get(0).toString()).getType().equals("String")){
                if(ctx.STRING_TYPE() == null){
                    errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.LABEL().get(0).toString(), ctx.getStart().getLine());
                }
            }
        }
 
        //get ctx.LABEL type then compare to (LABEL (OPEN_BRACE expression CLOSE_BRACE)? | number | STRING_TYPE | expression | comparison_statement)
    }

    @Override public void enterConditional_statement(MainParser.Conditional_statementContext ctx) { 
        currentNode++;
    }

    @Override public void exitConditional_statement(MainParser.Conditional_statementContext ctx) { 
        currentNode--;
    }

    @Override
    public void enterFunction_declaration(MainParser.Function_declarationContext ctx) {
        currentFunction = ctx.function_structure().LABEL().getText();
        currentNode = 0;
        String type = "";
        boolean hasReturn = false;
        int numReturn = 0;

        for(int x=0; x<ctx.function_structure().statements().size(); x++){
            if(ctx.function_structure().statements().get(x).small_statements().return_statement() != null){
                hasReturn = true;
                numReturn++;
            }
        }

        if(ctx.VOID() != null){
            type = ctx.VOID().getText();

            if(hasReturn)
                errorRepo.reportErrorMessage("INVALID_VOID_RETURN", currentFunction, ctx.getStart().getLine());
        }
        else{
            type = ctx.variable_type().getText();

            if(!hasReturn)
                errorRepo.reportErrorMessage("MISSING_RETURN", currentFunction, ctx.getStart().getLine());
            else if(numReturn > 1)
                errorRepo.reportErrorMessage("MULTIPLE_RETURN", currentFunction, ctx.getStart().getLine());  
        }
            

        if(funcTable.containsKey(currentFunction)){
            errorRepo.reportErrorMessage("MULTIPLE_FUNCTION", currentFunction, ctx.getStart().getLine());
        }
        else if (!ctx.function_structure().function_declaration_parameters().isEmpty()) {
            int paramsize = ctx.function_structure().function_declaration_parameters().size();
            LinkedHashMap<String, ParamClass> parameters = new LinkedHashMap<String, ParamClass>();

            for (int x = 0; x < paramsize; x++) {
                Function_declaration_parametersContext param = ctx.function_structure().function_declaration_parameters().get(x);
                String paramtype = param.variable_type().getText();
                String paramname = param.LABEL().getText();
                boolean isArray = false;

                if(param.OPEN_BRACE() != null){
                    isArray = true;
                }

                if(!parameters.containsKey(paramname)){
                    parameters.put(paramname, new ParamClass(paramtype, paramname, isArray));
                }
                else{
                    errorRepo.reportErrorMessage("MULTIPLE_VARIABLE", paramname, ctx.getStart().getLine());
                    break;
                }
            }

            funcTable.put(currentFunction, new FuncClass(type, currentFunction, parameters));
        }
        else{
            funcTable.put(currentFunction, new FuncClass(type ,currentFunction, null));
        }
    }

    @Override public void enterMain_function(MainParser.Main_functionContext ctx) { 
        currentFunction = ctx.MAIN().getText();
        currentNode = 0;

        funcTable.put(currentFunction, new FuncClass("void", currentFunction, null));
    }
}
