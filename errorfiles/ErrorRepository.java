package errorfiles;

import java.util.HashMap;

public class ErrorRepository {
    private HashMap<String,String> errorMessage;

    public ErrorRepository() {
		this.errorMessage = new HashMap<String,String>();
		this.produceMessages();
	}
	
	private void produceMessages() {
		this.errorMessage.put("UNDECLARED_VARIABLE", "Variable undeclared '%s' at line %d \n");
        this.errorMessage.put("MULTIPLE_VARIABLE", "Variable already declared '%s' at line %d \n");
        this.errorMessage.put("MULTIPLE_FUNCTION", "Function already declared '%s' at line %d \n");
        this.errorMessage.put("TYPE_MISMATCH", "Type mismatch '%s' at line %d \n");
    }
    
    public void reportErrorMessage(String error, String token ,int line){
        System.out.printf(errorMessage.get(error), token, line);
    }
}
