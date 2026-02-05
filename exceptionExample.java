public class exceptionExample {
    public static void main(String[] args) {
        try {
            int d = 25 / 0; 
            // We use 'd' here so the compiler knows it has a purpose
            System.out.println("Result: " + d); 
        } catch (ArithmeticException e) {
            System.out.println("Caught Error: " + e);
        } finally {
            System.out.println("finally block is always executed + data is not available");
        }
    }
}