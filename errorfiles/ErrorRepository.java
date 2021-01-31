package errorfiles;

import java.util.HashMap;

import ui.gui;

public class ErrorRepository {
    private HashMap<String,String> errorMessage;

    public ErrorRepository() {
		this.errorMessage = new HashMap<String,String>();
		this.produceMessages();
	}
	
	private void produceMessages() {
        this.errorMessage.put("UNDECLARED_VARIABLE", "Variable undeclared '%s' at line %d \n");
        this.errorMessage.put("UNDECLARED_FUNCTION", "Function undeclared '%s' at line %d \n");
        this.errorMessage.put("MULTIPLE_VARIABLE", "Variable already declared '%s' at line %d \n");
        this.errorMessage.put("MULTIPLE_FUNCTION", "Function already declared '%s' at line %d \n");
        this.errorMessage.put("MULTIPLE_RETURN", "Multiple return for function '%s' at line %d \n");
        this.errorMessage.put("TYPE_MISMATCH", "Type mismatch '%s' at line %d \n");
        this.errorMessage.put("MISSING_RETURN", "Missing return statement for function '%s' at line %d \n");
        this.errorMessage.put("INVALID_VOID_RETURN", "Function '%s' is void, it should not return a value at line %d \n");
        this.errorMessage.put("PARAMETER_COUNT_MISMATCH", "Argument size for method call '%s' at line %d does not match with its declaration \n");
    }
    
    public void reportErrorMessage(String error, String token ,int line){
        gui.getTextArea().appendText(String.format(errorMessage.get(error), token, line));
    }
}
