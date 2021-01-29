package model;

public class VarClass {
    private String datatype;
    private String varname;
    private String value;

    public VarClass(String type, String name, String value){
        this.datatype = type;
        this.varname = name;
        this.value = value;
    }

    public String getType(){
        return this.datatype;
    }

    public String getName(){
        return this.varname;
    }

    public String getValue(){
        return this.value;
    }
}
