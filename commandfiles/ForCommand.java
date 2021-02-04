package commandfiles;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.udojava.evalex.Expression;

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
                // Execute other command
            }
        }else if(comparator.equals("down to")){
            for(BigDecimal x = secondOperand; x.compareTo(firstOperand) < 0; x = x.add(BigDecimal.ONE)){
                // Execute other command
            }
        }
    }
}
