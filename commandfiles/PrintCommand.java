package commandfiles;

import java.util.HashMap;

import model.SymbolTableManager;
import model.VarClass;
import ui.gui;

public class PrintCommand implements ICommand{
    
    private String expr;
    private HashMap<String, VarClass> varTable;

    public PrintCommand(String expression, String currFunc){
        this.expr = expression;
        this.varTable = SymbolTableManager.getInstance().getFuncTable().get(currFunc).getVarTable();
    }

    private String format(){


        return "hello";
    }

    public void execute(){
        gui.getTextArea().appendText(this.format());
    }
}
