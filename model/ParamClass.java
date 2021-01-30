package model;

public class ParamClass {
    private String datatype;
    private String varname;
    private boolean isArray;

    public ParamClass(String type, String name, boolean isarraay){
        this.datatype = type;
        this.varname = name;
        this.isArray = isarraay;
    }

    public String getType(){
        return this.datatype;
    }

    public String getName(){
        return this.varname;
    }

    public boolean isArray(){
        return this.isArray;
    }
}
