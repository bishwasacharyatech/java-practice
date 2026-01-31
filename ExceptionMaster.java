import java.io.*;

public class ExceptionMaster {

    // 1. 'throws' indicates this method might trigger an error the caller must handle
    public static void processData(int divisor) throws ArithmeticException {
        if (divisor == 0) {
            // 2. 'throw' manually triggers a specific exception
            throw new ArithmeticException("Custom Error: Logic dictates no zeros allowed!");
        }
        System.out.println("Result: " + (100 / divisor));
    }

    public static void main(String[] args) {
        // 3. 'try' block wraps risky logic
        try {
            System.out.println("Attempting logic...");
            processData(0); 

        } 
        // 4. 'catch' block handles the specific problem
        catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        // Multiple catch blocks can be used for different error types
        catch (Exception e) {
            System.out.println("A general error occurred.");
        } 
        // 5. 'finally' block executes no matter what happens above
        finally {
            System.out.println("Cleanup: Closing all connections and finishing execution.");
        }
        
        System.out.println("Program continues running safely...");
    }
}