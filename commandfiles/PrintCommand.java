package commandfiles;

import ui.gui;

import java.math.BigDecimal;

import com.udojava.evalex.Expression;

public class PrintCommand implements ICommand{
    
    private String expr;

    public Expression EvalEx;
    

    public PrintCommand(String expression, String currFunc){
        this.expr = expression;
    }

    private String format(){
        return this.expr;
    }

    public void execute(){
        gui.getTextArea().appendText(this.format() + '\n');
    }
}
