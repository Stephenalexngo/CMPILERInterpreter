package model;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FuncClass {
    private String datatype;
    private String funcname;
    private LinkedHashMap<String, ParamClass> parameters;
    private HashMap<String, VarArrClass> arrTable;
    private HashMap<String, VarClass> varTable;

    public FuncClass(String type, String name, LinkedHashMap<String, ParamClass> params){
        this.datatype = type;
        this.funcname = name;
        this.parameters = params;
        this.arrTable = new HashMap<String, VarArrClass>();
        this.varTable = new HashMap<String, VarClass>();
    }

    public String getType(){
        return this.datatype;
    }

    public String getFuncName(){
        return this.funcname;
    }

    public LinkedHashMap<String, ParamClass> getParams(){
        return this.parameters;
    }

    public HashMap<String, VarArrClass> getVarArrTable(){
        return this.arrTable;
    }

    public HashMap<String, VarClass> getVarTable(){
        return this.varTable;
    }
}
