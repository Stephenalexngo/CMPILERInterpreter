package commandfiles;

import ui.gui;

public class PrintCommand implements ICommand{
    
    private String expr;

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
