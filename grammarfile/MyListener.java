package grammarfile;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import errorfiles.ErrorRepository;
import model.SymbolTableManager;
import model.VarArrClass;
import model.VarClass;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.udojava.evalex.Expression;

public class MyListener extends MainBaseListener {
    
    public CommonTokenStream tokens;
    public Expression EvalEx;
    public ErrorRepository errorRepo;
    public String currentFunction = "";
    HashMap<String, VarClass> varTable = SymbolTableManager.getInstance().getVarTable();
    HashMap<String, VarArrClass> varArrTable = SymbolTableManager.getInstance().getVarArrTable();

    public MyListener(MainParser parser){
        this.tokens = (CommonTokenStream) parser.getTokenStream();
        this.errorRepo = new ErrorRepository();
    }

    public String convertExpression(List<Token> listtoken, HashMap<String, VarClass> varTable){
        String expression = "";

        for(int x=0; x<listtoken.size(); x++){
            if(listtoken.get(x).getType() == 51){
                if(varTable.containsKey(listtoken.get(x).getText())){
                    if(!varTable.get(listtoken.get(x).getText()).getValue().isEmpty())
                        expression += varTable.get(listtoken.get(x).getText()).getValue();
                    else{
                        errorRepo.reportErrorMessage("UNDECLARED_VARIABLE",listtoken.get(x).getText() ,listtoken.get(x).getLine());
                        return "null";
                    }
                }
                else{
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE",listtoken.get(x).getText() ,listtoken.get(x).getLine());
                    return "null";
                }
            }
            else{
                expression += listtoken.get(x).getText();
            }
        }

        return expression;
    }

    public String convertLogical(List<Token> listtoken, HashMap<String, VarClass> varTable){
        String expression = "";

        for(int x=0; x<listtoken.size(); x++){
            if(listtoken.get(x).getType() == 51){
                if(listtoken.get(x).getText().equals("T")){
                    expression += "1";
                }
                else if(listtoken.get(x).getText().equals("F")){
                    expression += "0";
                }
                else{
                    if(varTable.containsKey(listtoken.get(x).getText())){
                        if(!varTable.get(listtoken.get(x).getText()).getValue().isEmpty())
                            expression += varTable.get(listtoken.get(x).getText()).getValue();
                        else{
                            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE",listtoken.get(x).getText() ,listtoken.get(x).getLine());
                            return "null";
                        }
                    }
                    else{
                        errorRepo.reportErrorMessage("UNDECLARED_VARIABLE",listtoken.get(x).getText() ,listtoken.get(x).getLine());
                        return "null";
                    }
                }
            }
            else{
                if(listtoken.get(x).getType() == 38)
                    expression += "not";
                else
                    expression += listtoken.get(x).getText();
            }
        }

        return expression;
    }

    @Override public void enterInt_declaration(MainParser.Int_declarationContext ctx) {
        String expr = "";
        System.out.println(currentFunction);
        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        else if(ctx.INT_NUMBER() != null){
            expr = ctx.INT_NUMBER().getText();
        }
        
        if(!varTable.containsKey(ctx.LABEL().getText()) && !varArrTable.containsKey(ctx.LABEL().getText())){
            if(!expr.equals("null")){
                String type = ctx.INT_DEC().getText();
                String varname = ctx.LABEL().getText();

                if(!expr.equals("")){
                    if(!expr.contains(".")){
                        EvalEx = new Expression(expr);
                        BigDecimal result = EvalEx.eval();
                        String value = result.intValue()+"";

                        varTable.put(varname, new VarClass(type, varname, value));
                    }
                    else
                        errorRepo.reportErrorMessage("TYPE_MISMATCH",ctx.LABEL().getText() ,ctx.getStart().getLine());
                }
                else{
                    varTable.put(varname, new VarClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarTable(varTable);
    }

    @Override public void enterFloat_declaration(MainParser.Float_declarationContext ctx) {
        String expr = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        else if(ctx.FLOAT_NUMBER() != null){
            expr = ctx.FLOAT_NUMBER().getText().replace("f", "");
        }
        
        if(!varTable.containsKey(ctx.LABEL().getText()) && !varArrTable.containsKey(ctx.LABEL().getText())){
            if(!expr.equals("null")){
                String type = ctx.FLOAT_DEC().getText();
                String varname = ctx.LABEL().getText();

                if(!expr.equals("")){
                    EvalEx = new Expression(expr);
                    BigDecimal result = EvalEx.eval();
                    
                    String value = result.intValue()+"";

                    varTable.put(varname, new VarClass(type, varname, value));
                }
                else{
                    varTable.put(varname, new VarClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarTable(varTable);
    }

    @Override public void enterString_declaration(MainParser.String_declarationContext ctx) {
        String expr = "";

        if(ctx.STRING_TYPE() != null){
            expr = ctx.STRING_TYPE().getText();
        }
        
        if(!varTable.containsKey(ctx.LABEL().getText()) && !varArrTable.containsKey(ctx.LABEL().getText())){
            String type = ctx.STRING_DEC().getText();
            String varname = ctx.LABEL().getText();

            if(!expr.equals("")){
                expr = expr.replace("\"", "");
                varTable.put(varname, new VarClass(type, varname, expr));
            }
            else{
                varTable.put(varname, new VarClass(type, varname));
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarTable(varTable);
    }

    @Override public void enterBoolean_declaration(MainParser.Boolean_declarationContext ctx) {
        String expr = "";

        if(ctx.comparison_statement() != null){
            Token first = ctx.comparison_statement().start;
            Token last = ctx.comparison_statement().stop;
            expr = convertLogical(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        
        if(!varTable.containsKey(ctx.LABEL().get(0).getText()) && !varArrTable.containsKey(ctx.LABEL().get(0).getText())){
            if(!expr.equals("null")){
                String type = ctx.BOOLEAN_DEC().getText();
                String varname = ctx.LABEL().get(0).getText();

                if(!expr.equals("")){
                    EvalEx = new Expression(expr);
                    BigDecimal result = EvalEx.eval();
                    
                    String value = result.intValue()+"";

                    varTable.put(varname, new VarClass(type, varname, value));
                }
                else{
                    varTable.put(varname, new VarClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarTable(varTable);
    }

    @Override public void enterInt_arr_declaration(MainParser.Int_arr_declarationContext ctx) { 
        String size = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        
        if(!varArrTable.containsKey(ctx.LABEL().get(0).getText()) && !varTable.containsKey(ctx.LABEL().get(0).getText())){
            if(!size.equals("null")){
                String type = ctx.INT_DEC().get(0).getText();
                String varname = ctx.LABEL().get(0).getText();

                if(!size.equals("")){
                    if(!size.contains(".")){
                        EvalEx = new Expression(size);
                        BigDecimal result = EvalEx.eval();
                        String value = result.intValue()+"";

                        varArrTable.put(varname, new VarArrClass(type, varname, value));
                    }
                    else
                        errorRepo.reportErrorMessage("TYPE_MISMATCH",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
                    }
                else{
                    varArrTable.put(varname, new VarArrClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarArrTable(varArrTable);
    }

    @Override public void enterString_arr_declaration(MainParser.String_arr_declarationContext ctx) { 
        String size = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        
        if(!varArrTable.containsKey(ctx.LABEL().getText()) && !varTable.containsKey(ctx.LABEL().getText())){
            if(!size.equals("null")){
                String type = ctx.STRING_DEC().get(0).getText();
                String varname = ctx.LABEL().getText();

                if(!size.equals("")){
                    if(!size.contains(".")){
                        EvalEx = new Expression(size);
                        BigDecimal result = EvalEx.eval();
                        String value = result.intValue()+"";

                        varArrTable.put(varname, new VarArrClass(type, varname, value));
                    }
                    else
                        errorRepo.reportErrorMessage("TYPE_MISMATCH",ctx.LABEL().getText() ,ctx.getStart().getLine());
                    }
                else{
                    varArrTable.put(varname, new VarArrClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarArrTable(varArrTable);
    }

    @Override public void enterBoolean_arr_declaration(MainParser.Boolean_arr_declarationContext ctx) { 
        String size = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        
        if(!varArrTable.containsKey(ctx.LABEL().get(0).getText()) && !varTable.containsKey(ctx.LABEL().get(0).getText())){
            if(!size.equals("null")){
                String type = ctx.BOOLEAN_DEC().get(0).getText();
                String varname = ctx.LABEL().get(0).getText();

                if(!size.equals("")){
                    if(!size.contains(".")){
                        EvalEx = new Expression(size);
                        BigDecimal result = EvalEx.eval();
                        String value = result.intValue()+"";

                        varArrTable.put(varname, new VarArrClass(type, varname, value));
                    }
                    else
                        errorRepo.reportErrorMessage("TYPE_MISMATCH",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
                    }
                else{
                    varArrTable.put(varname, new VarArrClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarArrTable(varArrTable);
    }

    @Override public void enterFloat_arr_declaration(MainParser.Float_arr_declarationContext ctx) { 
        String size = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            size = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        
        if(!varArrTable.containsKey(ctx.LABEL().get(0).getText()) && !varTable.containsKey(ctx.LABEL().get(0).getText())){
            if(!size.equals("null")){
                String type = ctx.FLOAT_DEC().get(0).getText();
                String varname = ctx.LABEL().get(0).getText();

                if(!size.equals("")){
                    if(!size.contains(".")){
                        EvalEx = new Expression(size);
                        BigDecimal result = EvalEx.eval();
                        String value = result.intValue()+"";

                        varArrTable.put(varname, new VarArrClass(type, varname, value));
                    }
                    else
                        errorRepo.reportErrorMessage("TYPE_MISMATCH",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
                    }
                else{
                    varArrTable.put(varname, new VarArrClass(type, varname));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
        }

        SymbolTableManager.getInstance().setVarArrTable(varArrTable);
    }

    @Override public void enterPrint_statement(MainParser.Print_statementContext ctx) {
        for(int x=0; x<ctx.extended_value_print().size(); x++){
            if(ctx.extended_value_print().get(x).expression() != null){
                Token first = ctx.extended_value_print().get(x).start;
                Token last = ctx.extended_value_print().get(x).stop;
                String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);

                if(!expr.equals("null")){
                    // put in PrintCommand
                }
            }
            else if(ctx.extended_value_print().get(x).LABEL() != null){
                String key = ctx.extended_value_print().get(x).LABEL().getText();
                if(!varTable.containsKey(key) && !varArrTable.containsKey(key)){
                    errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", key, ctx.getStart().getLine());
                }
            }
            // add else for STRING_TYPE() to put in PrintCommand
        }
    }

    @Override public void enterScan_statement(MainParser.Scan_statementContext ctx) { 
        if(!varTable.containsKey(ctx.LABEL().getText())){
            errorRepo.reportErrorMessage("UNDECLARED_VARIABLE", ctx.LABEL().getText(), ctx.getStart().getLine());
        }
    }

    @Override public void enterFunction_declaration(MainParser.Function_declarationContext ctx) { 
        currentFunction = ctx.function_structure().LABEL().getText();
    }

    @Override public void enterMain_function(MainParser.Main_functionContext ctx) { 
        currentFunction = ctx.MAIN().getText();
    }
}
