public class TryCatchException {
    public static void main(String[] args) {
        try {
            System.out.println("--- Starting Try Block ---");
            int result = 10 / 0; // Triggering the error
            System.out.println("Result: " + result); 

        } catch (ArithmeticException e) {
            System.out.println("--- Catch Block Triggered ---");
            System.out.println("Error: " + e.getMessage());

        } finally {
            // This runs NO MATTER WHAT
            System.out.println("--- Finally Block: I always run! ---");
            System.out.println("Cleaning up resources...");
        }

        System.out.println("Program finished safely.");
    }
}