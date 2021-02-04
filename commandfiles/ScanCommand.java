package commandfiles;

import java.util.HashMap;

import model.SymbolTableManager;
import model.VarClass;
import ui.scanGUI;

public class ScanCommand implements ICommand {
    
    private String label;
    private String currFunc;
    private String varName;
    private int depth;

    public ScanCommand(String label, String varName, String currFunc, int depth){
        this.label = label;
        this.varName = varName;
        this.currFunc = currFunc;
        this.depth = depth;
    }

    public void execute(){
        scanGUI gui = new scanGUI();

        gui.setScanGUI(this.label, this.varName, this.currFunc, this.depth);
        gui.start();
    }

}
