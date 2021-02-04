package model;

import java.util.*;
import commandfiles.*;

public class SymbolTableManager {
    private static HashMap<String, FuncClass> funcTable;
    private static SymbolTableManager INSTANCE = null;
    private static ArrayList<ICommand> arrCommands;
    private static ArrayList<String> scanCommands;

    private SymbolTableManager(){
        funcTable = new HashMap<String, FuncClass>();
        arrCommands = new ArrayList<ICommand>();
        scanCommands = new ArrayList<String>();
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

    public void setCommands(ArrayList<ICommand> commands){
        this.arrCommands = commands;
    }

    public ArrayList<ICommand> getCommands(){
        return this.arrCommands;
    }

    public void setScanCommands(ArrayList<String> scanCommands){
        this.scanCommands = scanCommands;
    }

    public ArrayList<String> getScanCommands(){
        return this.scanCommands;
    }

    public HashMap<String, FuncClass> getFuncTable(){
        return this.funcTable;
    }

    public void setFuncTable(HashMap<String, FuncClass> newFuncTable){
        this.funcTable = newFuncTable;
    }
}
