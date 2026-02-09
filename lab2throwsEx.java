import java.io.IOException;
class lab2throwsEx {
    static void withdraw(int amount, int balance) throws ArithmeticException {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance for this withdrawal!");
        } else {
            System.out.println("Withdrawal successful! Remaining: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Attempting to withdraw $500 from $200...");
            withdraw(500, 200); 
        } catch (ArithmeticException e) {
           
            System.out.println("Caught Error: " + e.getMessage());
        }
    }
}
