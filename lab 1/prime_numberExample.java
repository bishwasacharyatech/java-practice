//wap to print all prime number between 1 to 100 in java
public class prime_numberExample {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 2; i <= 100; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}