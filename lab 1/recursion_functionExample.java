//wap to implement recursion function in java
public class recursion_functionExample {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) { // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int result = factorial(number);// Calling the recursive method
        System.out.println("Factorial of " + number + " is: " + result);// Printing the result
    }
    
}
