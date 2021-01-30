package customfiles;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;

import ui.gui;

import org.antlr.v4.runtime.RecognitionException;

import java.util.ArrayList;

public class CustomErrorListener extends BaseErrorListener {

    private ArrayList<String> error_List = new ArrayList<>();
    private Parser parser;

    public CustomErrorListener() {

    }

    private String CustomErrorMessage(String msg, int line, int pos, String offendingSymbol) {
        String error_message_temp;
        
        if(msg.contains("mismatched input"))
            error_message_temp = "Unexpected symbol: '" + offendingSymbol + "' in line " + line + ", at pos " + pos;
        else if (msg.contains("extraneous input"))
            error_message_temp = "Invalid Token '" + offendingSymbol + "' in line " + line + ", at pos " + pos;
        else if (msg.contains("no viable alternative at"))
            error_message_temp = "Syntax Error '" + offendingSymbol + "' in line " + line + ", at pos " + pos;
        else if(msg.contains("missing "))
            error_message_temp = "Missing Token in line " + line + ", at pos " + pos;
        else 
            error_message_temp = "Syntax Error in line " + line + ", at pos " + pos;

        return error_message_temp;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        
        String error_Message = CustomErrorMessage(msg, line, charPositionInLine, this.parser.getCurrentToken().getText());
            
        error_List.add(error_Message);

        gui.console.appendText(error_Message);
    }
    
    public void setParser(Parser parser){
        this.parser = parser;
    }

    public int getErrorList(){
        return this.error_List.size();
    }
}