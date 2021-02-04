package commandfiles;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.udojava.evalex.Expression;

import model.SymbolTableManager;
import ui.gui;

public class ForCommand implements ICommand{

    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private String comparator;
    private ArrayList<ICommand> blockStatements;
    private Expression EvalEx;

    public ForCommand(String firstOperand, String secondOperand, String comparator, ArrayList<ICommand> blockStatements ){
        EvalEx = new Expression(firstOperand); 
        this.firstOperand = EvalEx.eval();
        EvalEx = new Expression(secondOperand); 
        this.secondOperand = EvalEx.eval();
        this.comparator = comparator;
        this.blockStatements = blockStatements;
    }

    public void execute(){
        if(comparator.equals("up to")){
            for(BigDecimal x = firstOperand; x.compareTo(secondOperand) < 0; x = x.add(BigDecimal.ONE)){
                gui.getTextArea().appendText(SymbolTableManager.getInstance().getScanCommands().get(x.intValue()) + '\n');
            }
        }else{
            int i = secondOperand.intValue() - 1;
            for(BigDecimal x = firstOperand; x.compareTo(secondOperand) < 0; x = x.add(BigDecimal.ONE)){
                gui.getTextArea().appendText(SymbolTableManager.getInstance().getScanCommands().get(i) + '\n');
                i--;
            }
        }
    }
}
