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

    @Override public void enterFloat_declaration(MainParser.Float_declarationContext ctx) {
        
    }
}
