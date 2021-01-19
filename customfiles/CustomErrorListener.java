package customfiles;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import java.util.ArrayList;


public class CustomErrorListener extends BaseErrorListener {

    private ArrayList<String> error_List = new ArrayList<>();

    public CustomErrorListener() {
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {

        String error_Message = msg + " at line " + line;
        error_List.add(error_Message);

        System.out.println(error_Message);
    }

    public int getErrorList(){
        return this.error_List.size();
    }
}