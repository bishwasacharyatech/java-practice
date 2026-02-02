public class exceptionExample {
    public static void main(String[] args) {
        try {
            int data = 25/ 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}