
public class ThrowExample {
    
    static void checkAge(int age) {
        if (age < 18) {
            // We manually create and throw the error here
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted! Welcome.");
        }
    }

    public static void main(String[] args) {
        try {
            // Change this to 20 to see the "Access granted" message
            checkAge(15); 
        } catch (ArithmeticException e) {
            System.out.println("Caught an error: " + e.getMessage());
        } finally {
            System.out.println("Age check process finished.");
        }
    }
}
