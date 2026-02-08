public class ThrowTest {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid !!!!! Age must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code.");
    }
}