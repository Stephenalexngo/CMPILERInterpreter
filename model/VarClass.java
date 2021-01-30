package model;

public class VarClass {
    private String datatype;
    private String varname;
    private String value;
    private String parentFunction;
    private int nodeDepth;

    public VarClass(String type, String name, String parent, int depth){
        this.datatype = type;
        this.varname = name;
        this.value = "null";
        this.parentFunction = parent;
        this.nodeDepth = depth;
    }

    public VarClass(String type, String name, String value, String parent, int depth){
        this.datatype = type;
        this.varname = name;
        this.value = value;
        this.parentFunction = parent;
        this.nodeDepth = depth;
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

    public String getParent(){
        return this.parentFunction;
    }

    public int getDepth(){
        return this.nodeDepth;
    }
}
