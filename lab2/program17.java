public class program17 {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
            
        }
    }
}