package grammarfile;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import errorfiles.ErrorRepository;
import model.SymbolTableManager;
import model.VarClass;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.udojava.evalex.Expression;

public class MyListener extends MainBaseListener {
    
    public CommonTokenStream tokens;
    public Expression EvalEx;
    public ErrorRepository errorRepo;

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
        HashMap<String, VarClass> varTable = SymbolTableManager.getInstance().getVarTable();
        String expr = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        else if(ctx.INT_NUMBER() != null){
            expr = ctx.INT_NUMBER().getText();
        }
        
        if(!varTable.containsKey(ctx.LABEL().getText())){
            if(!expr.equals("null")){
                String type = ctx.INT_DEC().getText();
                String varname = ctx.LABEL().getText();

                if(!expr.equals("")){
                    EvalEx = new Expression(expr);
                    BigDecimal result = EvalEx.eval();
                    
                    String value = result.intValue()+"";

                    if(!value.contains("."))
                        varTable.put(varname, new VarClass(type, varname, value));
                    else
                        errorRepo.reportErrorMessage("TYPE_MISMATCH",ctx.LABEL().getText() ,ctx.getStart().getLine());
                }
                else{
                    varTable.put(varname, new VarClass(type, varname, "null"));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }
    }

    @Override public void enterFloat_declaration(MainParser.Float_declarationContext ctx) {
        HashMap<String, VarClass> varTable = SymbolTableManager.getInstance().getVarTable();
        String expr = "";

        if(ctx.expression() != null){
            Token first = ctx.expression().start;
            Token last = ctx.expression().stop;
            expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        else if(ctx.FLOAT_NUMBER() != null){
            expr = ctx.FLOAT_NUMBER().getText().replace("f", "");
        }
        
        if(!varTable.containsKey(ctx.LABEL().getText())){
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
                    varTable.put(varname, new VarClass(type, varname, "null"));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }
    }

    @Override public void enterString_declaration(MainParser.String_declarationContext ctx) {
        HashMap<String, VarClass> varTable = SymbolTableManager.getInstance().getVarTable();
        String expr = "";

        if(ctx.STRING_TYPE() != null){
            expr = ctx.STRING_TYPE().getText();
        }
        
        if(!varTable.containsKey(ctx.LABEL().getText())){
            String type = ctx.STRING_DEC().getText();
            String varname = ctx.LABEL().getText();

            if(!expr.equals("")){
                expr = expr.replace("\"", "");
                varTable.put(varname, new VarClass(type, varname, expr));
            }
            else{
                varTable.put(varname, new VarClass(type, varname, "null"));
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().getText() ,ctx.getStart().getLine());
        }
    }

    @Override public void enterBoolean_declaration(MainParser.Boolean_declarationContext ctx) {
        HashMap<String, VarClass> varTable = SymbolTableManager.getInstance().getVarTable();
        String expr = "";

        if(ctx.comparison_statement() != null){
            Token first = ctx.comparison_statement().start;
            Token last = ctx.comparison_statement().stop;
            expr = convertLogical(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()),varTable);
        }
        
        if(!varTable.containsKey(ctx.LABEL().get(0).getText())){
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
                    varTable.put(varname, new VarClass(type, varname, "null"));
                }   
            }
        }
        else{
            errorRepo.reportErrorMessage("MULTIPLE_VARIABLE",ctx.LABEL().get(0).getText() ,ctx.getStart().getLine());
        }
    }
}
