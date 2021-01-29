package model;

public class VarArrClass {
    private String datatype;
    private String varname;
    private String size;

    public VarArrClass(String type, String name){
        this.datatype = type;
        this.varname = name;
        this.size = "null";
    }

    public VarArrClass(String type, String name, String size){
        this.datatype = type;
        this.varname = name;
        this.size = size;
    }

    public String getType(){
        return this.datatype;
    }

    public String getName(){
        return this.varname;
    }

    public String getSize(){
        return this.size;
    }
}
