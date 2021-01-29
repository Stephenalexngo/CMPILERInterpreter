package grammarfile;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import model.SymbolTableManager;
import model.VarClass;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.udojava.evalex.Expression;

public class MyListener extends MainBaseListener {
    
    public CommonTokenStream tokens;
    public Expression EvalEx;

    public MyListener(MainParser parser){
        tokens = (CommonTokenStream) parser.getTokenStream();
    }

    public String convertExpression(List<Token> listtoken){
        String expression = "";

        for(int x=0; x<listtoken.size(); x++){
            expression += listtoken.get(x).getText();
        }

        return expression;
    }

    @Override public void enterInt_declaration(MainParser.Int_declarationContext ctx) {
        HashMap<String, VarClass> varTable = SymbolTableManager.getInstance().getVarTable();
        Token first = ctx.expression().start;
        Token last = ctx.expression().stop;
        
        if(!varTable.containsKey(ctx.LABEL().getText())){
            String type = ctx.INT_DEC().getText();
            String varname = ctx.LABEL().getText();
            String expr = convertExpression(tokens.getTokens(first.getTokenIndex(), last.getTokenIndex()));
            
            System.out.println(expr);
            EvalEx = new Expression(expr);
            BigDecimal result = EvalEx.eval();
            
            String value = result.intValue()+"";

            varTable.put(varname, new VarClass(type, varname, value));
        }
        else{
            System.out.println("Variable Already Declared at line " + ctx.getStart().getLine());
        }
    }
}
