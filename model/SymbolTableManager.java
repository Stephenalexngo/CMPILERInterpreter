package model;

import java.util.HashMap;

public class SymbolTableManager {
    public static final HashMap<String, VarClass> funcTable = new HashMap<String, VarClass>();
    public static final HashMap<String, VarClass> arrTable = new HashMap<String, VarClass>();
    public static HashMap<String, VarClass> varTable;
    private static SymbolTableManager INSTANCE = null;

    private SymbolTableManager(){
        varTable = new HashMap<String, VarClass>();
    }

    public static SymbolTableManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SymbolTableManager();
        }
        return INSTANCE;
    }

    public HashMap<String, VarClass> getVarTable(){
        return this.varTable;
    }

    public void setVarTable(HashMap<String, VarClass> newVarTable){
        this.varTable = newVarTable;
    }
}
