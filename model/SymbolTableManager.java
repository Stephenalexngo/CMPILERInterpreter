package model;

import java.util.HashMap;

public class SymbolTableManager {
    private static HashMap<String, FuncClass> funcTable;
    private static SymbolTableManager INSTANCE = null;

    private SymbolTableManager(){
        funcTable = new HashMap<String, FuncClass>();
    }

    public static void initialize(){
        INSTANCE = new SymbolTableManager();
    }

    public static SymbolTableManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SymbolTableManager();
        }
        return INSTANCE;
    }

    public HashMap<String, FuncClass> getFuncTable(){
        return this.funcTable;
    }

    public void setFuncTable(HashMap<String, FuncClass> newFuncTable){
        this.funcTable = newFuncTable;
    }
}
