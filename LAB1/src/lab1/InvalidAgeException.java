
package exceptionhandling;


public class InvalidAgeException extends Exception {
    
    public InvalidAgeException(String customMessage) {
        super(customMessage);
    }
    
}
