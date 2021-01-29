package model;

import java.util.HashMap;

public class SymbolTableManager {
    public static HashMap<String, VarArrClass> arrTable;
    public static HashMap<String, VarClass> varTable;
    private static SymbolTableManager INSTANCE = null;

    private SymbolTableManager(){
        varTable = new HashMap<String, VarClass>();
        arrTable = new HashMap<String, VarArrClass>();
    }

    public static SymbolTableManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SymbolTableManager();
        }
        return INSTANCE;
    }

    public HashMap<String, VarArrClass> getVarArrTable(){
        return this.arrTable;
    }

    public void setVarArrTable(HashMap<String, VarArrClass> newVarArrTable){
        this.arrTable = newVarArrTable;
    }

    public HashMap<String, VarClass> getVarTable(){
        return this.varTable;
    }

    public void setVarTable(HashMap<String, VarClass> newVarTable){
        this.varTable = newVarTable;
    }
}
