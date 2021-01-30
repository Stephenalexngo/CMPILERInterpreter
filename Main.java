import javafx.application.Application;
import ui.*;
import controller.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // parse(this.input); for GUI
        if(Controller.parse()){
            // showTree();
        }

        // Application.launch(gui.class, args);

        // String x = "3.14+2.14";
        // Expression expression = new Expression(x);
        // expression.setPrecision(3);
        // BigDecimal result = expression.eval(); 
        // System.out.println(result);
    }
}
