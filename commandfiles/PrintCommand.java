package commandfiles;

import java.util.HashMap;

import model.VarClass;

public class PrintCommand implements ICommand{
    
    private String expr;
    private HashMap<String, VarClass> varTable = new HashMap<String, VarClass>();

    public PrintCommand(String expression, HashMap<String, VarClass> varTable){
        this.expr = expression;
        this.varTable = varTable;
    }

    private String format(){


        return "";
    }

    public void execute(){
        System.out.println(this.format());
    }
}
