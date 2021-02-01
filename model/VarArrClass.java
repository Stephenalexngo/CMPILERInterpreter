package model;

public class VarArrClass {
    private String datatype;
    private String varname;
    private String size;
    private String parentFunction;
    private int nodeDepth;
    private boolean isConstant;

    public VarArrClass(String type, String name, String parent, int depth){
        this.datatype = type;
        this.varname = name;
        this.size = "null";
        this.parentFunction = parent;
        this.nodeDepth = depth;
        this.isConstant = false;
    }

    public VarArrClass(String type, String name, String size, String parent, int depth, boolean isConstant){
        this.datatype = type;
        this.varname = name;
        this.size = size;
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

    public String getSize(){
        return this.size;
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
}
