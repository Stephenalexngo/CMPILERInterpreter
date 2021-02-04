package grammarfile;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import commandfiles.ICommand;
import commandfiles.PrintCommand;
import commandfiles.ScanCommand;
import errorfiles.ErrorRepository;
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
    public ErrorRepository errorRepo = ErrorRepository.getInstance();
    public String currentFunction = "";
    public int currentNode = 0;
    public boolean isConstant = false;
    HashMap<String, FuncClass> funcTable = SymbolTableManager.getInstance().getFuncTable();
    ArrayList<ICommand> arrCommand = SymbolTableManager.getInstance().getCommands();

    public MyListener(MainParser parser) {
        this.tokens = (CommonTokenStream) parser.getTokenStream();
    }

    public void removeNodes(){
        ArrayList<String> singleVar = new ArrayList<String>();
        ArrayList<String> arrVar = new ArrayList<String>();

        for(String key:  funcTable.get(currentFunction).getVarTable().keySet()){
            if(funcTable.get(currentFunction).getVarTable().get(key).getDepth() == currentNode){
                singleVar.add(key);
            }
        }
        
        for(String key:  funcTable.get(currentFunction).getVarArrTable().keySet()){
            if(funcTable.get(currentFunction).getVarArrTable().get(key).getDepth() == currentNode){
                arrVar.add(key);
            }
        }

        for(int i=0; i<singleVar.size(); i++){
            funcTable.get(currentFunction).getVarTable().remove(singleVar.get(i));
        }

        for(int i=0; i<arrVar.size(); i++){
            funcTable.get(currentFunction).getVarArrTable().remove(arrVar.get(i));
        }
    }

    public String convertExpression(List<Token> listtoken, HashMap<String, VarClass> varTable) {
        String expression = "";
        boolean isError = false;

        for (int x = 0; x < listtoken.size(); x++) {
            if (listtoken.get(x).getType() == 51) {
                if (varTable.containsKey(listtoken.get(x).getText())) {
                    if(varTable.get(listtoken.get(x).getText()).getDepth() <= currentNode){
                        if(varTable.get(listtoken.get(x).getText()).getType().equals("String")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", listtoken.get(x).getText(), listtoken.get(x).getLine());
                        }
                        else{
                            if (!varTable.get(listtoken.get(x).getText()).getValue().isEmpty())
                                expression += varTable.get(listtoken.get(x).getText()).getValue();
                            else {
                                errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                                        listtoken.get(x).getLine());
                                isError=true;
                            }
                        }
                    }
                    else{
                        errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                            listtoken.get(x).getLine());
                            isError=true;
                    }
                } 
                else if(funcTable.get(currentFunction).getParams() != null){
                    if(funcTable.get(currentFunction).getParams().containsKey(listtoken.get(x).getText())){
                        if(funcTable.get(currentFunction).getParams().get(listtoken.get(x).getText()).getType().equals("String")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", listtoken.get(x).getText(), listtoken.get(x).getLine());
                        }
                        else{
                            expression += "0";
                        }
                    }
                }
                else {
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                            listtoken.get(x).getLine());
                    isError=true;
                }
            }
            else {
                expression += listtoken.get(x).getText();
            }
        }

        if(isError)
            return "null";
        else
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
                        if(varTable.get(listtoken.get(x).getText()).getDepth() <= currentNode){
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
                        }
                        else{
                            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", listtoken.get(x).getText(),
                                listtoken.get(x).getLine());
                            return "null";
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

    @Override public void enterScoping_statement(MainParser.Scoping_statementContext ctx) { 
        currentNode++;
    }

    @Override public void exitScoping_statement(MainParser.Scoping_statementContext ctx) { 
        removeNodes();
        currentNode--;
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
                        EvalEx.setPrecision(3);
                        BigDecimal result = EvalEx.eval();
    
                        String value = result.floatValue() + "";
    
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
        String printexp = "";
        for (int x = 0; x < ctx.extended_value_print().size(); x++) {
            if (ctx.extended_value_print().get(x).expression() != null) {
                Token first = ctx.extended_value_print().get(x).start;
                Token last = ctx.extended_value_print().get(x).stop;
                String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                        funcTable.get(currentFunction).getVarTable());

                if (!expr.equals("null")) {
                    EvalEx = new Expression(expr);
                    BigDecimal value = EvalEx.eval();
                    expr = value.floatValue() + "";;
                    printexp += expr;
                }
            } else if (ctx.extended_value_print().get(x).LABEL() != null) {
                String key = ctx.extended_value_print().get(x).LABEL().getText();
                if (!funcTable.get(currentFunction).getVarTable().containsKey(key)
                        && !funcTable.get(currentFunction).getVarArrTable().containsKey(key)) {
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", key, ctx.getStart().getLine());
                }
                else{
                    if (!key.equals("null")) {
                        printexp += funcTable.get(currentFunction).getVarTable().get(key).getValue();
                    }
                }
            }
            else {
                printexp += ctx.extended_value_print().get(x).STRING_TYPE().getText().replace("\"", "");
            }
        }
        PrintCommand print = new PrintCommand(printexp,currentFunction);
        //System.out.println(funcTable.get(currentFunction).getVarTable().get("x").getValue());
        //System.out.println("PRINT");
        arrCommand.add(print);
        SymbolTableManager.getInstance().setCommands(arrCommand);
    }

    @Override
    public void enterScan_statement(MainParser.Scan_statementContext ctx) {
        if (!funcTable.get(currentFunction).getVarTable().containsKey(ctx.LABEL().getText())) {
            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        } else {
            ScanCommand scan = new ScanCommand(ctx.STRING_TYPE().getText(), ctx.LABEL().getText(), currentFunction, currentNode);
            scan.execute();
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
        String varName = ctx.LABEL(0).toString();

        if(funcTable.get(currentFunction).getVarTable().get(varName).getDepth() <= currentNode){
            if(!funcTable.get(currentFunction).getVarTable().containsKey(varName)){
                errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", varName, ctx.getStart().getLine());
            }else{
                if(funcTable.get(currentFunction).getVarTable().get(varName).isConstant()){
                    errorRepo.reportErrorMessage("CONSTANT_REASSIGNMENT", varName, ctx.getStart().getLine());
                }else if(funcTable.get(currentFunction).getVarTable().get(varName).getType().equals("int")){
                    if(ctx.number() != null){
                        if(ctx.number().FLOAT_NUMBER() != null){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                        }else{
                            funcTable.get(currentFunction).getVarTable().get(varName).setValue(ctx.number().INT_NUMBER().getText());
                        }
                    }else if(ctx.function_calling() != null){
                        if(!funcTable.get(ctx.function_calling().LABEL().toString()).getType().equals("int")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                        }else{
                            funcTable.get(currentFunction).getVarTable().put(varName, 
                            new VarClass("int", varName, "0", currentFunction, currentNode, false));
                        }
                    }else if(ctx.expression(0) != null){
                        Token first = ctx.expression(0).start;
                        Token last = ctx.expression(0).stop;
                        String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                                funcTable.get(currentFunction).getVarTable());
                                
                        if (expr.contains(".")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.expression().toString(), ctx.getStart().getLine());
                        }else{
                            EvalEx = new Expression(expr);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarTable().put(varName,
                                    new VarClass("int", varName, value, currentFunction, currentNode, isConstant));
                        }
                    }
                    // }else{
                    //     if(ctx.number().INT_NUMBER() == null){
                    //         errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                    //     }else{
                    //         funcTable.get(currentFunction).getVarTable().put(varName, 
                    //         new VarClass("int", varName, ctx.number().INT_NUMBER().getText(), currentFunction, currentNode, isConstant));
                    //     }
                    // }
                    
                }else if(funcTable.get(currentFunction).getVarTable().get(varName).getType().equals("float")){
                    if(ctx.number() == null){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                    }else if(ctx.function_calling() != null){
                        if(!funcTable.get(ctx.function_calling().LABEL().toString()).getType().equals("float")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                        }else{
                            funcTable.get(currentFunction).getVarTable().put(varName, 
                            new VarClass("float", varName, "0", currentFunction, currentNode, false));
                        }
                    }else if(ctx.expression(2) != null){
                        Token first = ctx.expression(2).start;
                        Token last = ctx.expression(2).stop;
                        String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                                funcTable.get(currentFunction).getVarTable());
                                
                        if (!expr.contains(".")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.expression().toString(), ctx.getStart().getLine());
                        }else{
                            EvalEx = new Expression(expr);
                            BigDecimal result = EvalEx.eval();
                            String value = result.intValue() + "";
    
                            funcTable.get(currentFunction).getVarTable().put(varName,
                                    new VarClass("float", varName, value, currentFunction, currentNode, isConstant));
                        }
                    }else{
                        if(ctx.number().FLOAT_NUMBER() == null){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                        }else{
                            funcTable.get(currentFunction).getVarTable().put(varName, 
                            new VarClass("float", varName, ctx.number().FLOAT_NUMBER().getText(), currentFunction, currentNode, isConstant));
                        }
                    }
                }else if(funcTable.get(currentFunction).getVarTable().get(varName).getType().equals("bool")){
                    if(ctx.comparison_statement() == null){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                    }else if(ctx.function_calling() != null){
                        if(!funcTable.get(ctx.function_calling().LABEL().toString()).getType().equals("bool")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                        }else{
                            Token first = ctx.comparison_statement().start;
                            Token last = ctx.comparison_statement().stop;
                            String expr = convertLogical(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),
                            funcTable.get(currentFunction).getVarTable());
        
                            if (!expr.contains("")){
                                EvalEx = new Expression(expr);
                                BigDecimal result = EvalEx.eval();
        
                                String value = result.intValue() + "";
        
                                funcTable.get(currentFunction).getVarTable().put(varName,
                                    new VarClass("bool", varName, value, currentFunction, currentNode, isConstant));
                            }else{
                                errorRepo.reportErrorMessage("TYPE_MISMATCH", ctx.expression().toString(), ctx.getStart().getLine());
                            }
                        }
                    }
                }else if(funcTable.get(currentFunction).getVarTable().get(varName).getType().equals("String")){
                    if(ctx.STRING_TYPE() == null){
                        errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                    }else if(ctx.function_calling() != null){
                        if(!funcTable.get(ctx.function_calling().LABEL().toString()).getType().equals("String")){
                            errorRepo.reportErrorMessage("TYPE_MISMATCH", varName, ctx.getStart().getLine());
                        }else{
                            funcTable.get(currentFunction).getVarTable().put(varName, 
                            new VarClass("float", varName, "0", currentFunction, currentNode, false));
                        }
                    }else{
                        funcTable.get(currentFunction).getVarTable().put(varName, 
                            new VarClass("float", varName, ctx.STRING_TYPE().getText(), currentFunction, currentNode, false));
                    }
                }
            }
        }else{
            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", varName,  ctx.getStart().getLine());
        } 
    }

    @Override public void enterConditional_statement(MainParser.Conditional_statementContext ctx) { 
        currentNode++;
        Token if_first = ctx.conditional_comparison_structure(0).comparison_statement().start;
        Token if_last = ctx.conditional_comparison_structure(0).comparison_statement().stop;
        String if_value = convertLogical(tokens.getTokens(if_first.getTokenIndex(), if_last.getTokenIndex()),
        funcTable.get(currentFunction).getVarTable());

        for(int x=0; x<ctx.ELSE_IF().size(); x++){
            Token else_if_first = ctx.conditional_comparison_structure(1).comparison_statement().start;
            Token else_if_last = ctx.conditional_comparison_structure(1).comparison_statement().stop;
            String else_if_value = convertLogical(tokens.getTokens(else_if_first.getTokenIndex(), else_if_last.getTokenIndex()),
            funcTable.get(currentFunction).getVarTable());
        }
    }

    @Override public void exitConditional_statement(MainParser.Conditional_statementContext ctx) { 
        removeNodes();
        currentNode--;
    }

    @Override public void enterWhile_statement(MainParser.While_statementContext ctx) { 
        currentNode++;
        Token first_exp_start = ctx.expression().start;
        Token first_exp_stop = ctx.expression().stop;
        String first_value = convertLogical(tokens.getTokens(first_exp_start.getTokenIndex(), first_exp_stop.getTokenIndex()),
        funcTable.get(currentFunction).getVarTable());

        Token second_exp_start = ctx.loop_structure().expression().start;
        Token second_exp_stop = ctx.loop_structure().expression().stop;
        String second_value = convertLogical(tokens.getTokens(second_exp_start.getTokenIndex(), second_exp_stop.getTokenIndex()),
        funcTable.get(currentFunction).getVarTable());
    }

	@Override public void exitWhile_statement(MainParser.While_statementContext ctx) { 
        removeNodes();
        currentNode--;
    }

	@Override public void enterFor_statement(MainParser.For_statementContext ctx) { 
        currentNode++;
        String first_value = "0";

        if(ctx.loop_variable_declaration().expression() != null){
            Token first_exp_start = ctx.loop_variable_declaration().expression().start;
            Token first_exp_stop = ctx.loop_variable_declaration().expression().stop;
            first_value = convertLogical(tokens.getTokens(first_exp_start.getTokenIndex(), first_exp_stop.getTokenIndex()),
            funcTable.get(currentFunction).getVarTable());
        }
        else if(ctx.loop_variable_declaration().int_declaration().expression() != null){
            Token first_exp_start = ctx.loop_variable_declaration().int_declaration().expression().start;
            Token first_exp_stop = ctx.loop_variable_declaration().int_declaration().expression().stop;
            first_value = convertLogical(tokens.getTokens(first_exp_start.getTokenIndex(), first_exp_stop.getTokenIndex()),
            funcTable.get(currentFunction).getVarTable());
        }
        else if(ctx.loop_variable_declaration().int_declaration().INT_NUMBER() != null){
            first_value = ctx.loop_variable_declaration().int_declaration().INT_NUMBER().getText();
        }
        
        Token second_exp_start = ctx.loop_structure().expression().start;
        Token second_exp_stop = ctx.loop_structure().expression().stop;
        String second_value = convertLogical(tokens.getTokens(second_exp_start.getTokenIndex(), second_exp_stop.getTokenIndex()),
        funcTable.get(currentFunction).getVarTable());
    }

	@Override public void exitFor_statement(MainParser.For_statementContext ctx) { 
        removeNodes();
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
