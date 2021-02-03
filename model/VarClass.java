package model;

public class VarClass {
    private String datatype;
    private String varname;
    private String value;
    private String parentFunction;
    private int nodeDepth;
    private boolean isConstant;

    public VarClass(String type, String name, String parent, int depth){
        this.datatype = type;
        this.varname = name;
        this.value = "null";
        this.parentFunction = parent;
        this.nodeDepth = depth;
        this.isConstant = false;
    }

    public VarClass(String type, String name, String value, String parent, int depth, boolean isConstant){
        this.datatype = type;
        this.varname = name;
        this.value = value;
        this.parentFunction = parent;
        this.nodeDepth = depth;
        this.isConstant = isConstant;
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

    public boolean isConstant(){
        return this.isConstant;
    }

    public void setValue(String value){
        this.value = value;
    }
}
