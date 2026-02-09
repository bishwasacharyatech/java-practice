public class TryCatchException {
    public static void main(String[] args) {
        try {
            System.out.println("--- Starting Try Block ---");

            // 1. Possible ArithmeticException
            int result = 10 / 2; 
            System.out.println("Division Result: " + result);

            // 2. Possible ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            // This will crash because there is no index 5 (only 0, 1, 2)
            System.out.println("Accessing index 5: " + numbers[5]); 

            // 3. Possible NullPointerException
            String text = null;
            System.out.println(text.length());

        } catch (ArithmeticException e) {
            System.out.println("Math Error: You can't divide by zero!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: You tried to access a slot that doesn't exist!");

        } catch (Exception e) {
            // This is the "General Catch" - it catches anything else
            System.out.println("General Error: Something else went wrong: " + e.getMessage());

        } finally {
            System.out.println("--- Finally Block: I always run! ---");
            System.out.println("Cleaning up...");
        }

        System.out.println("Program finished safely.");
    }
}
