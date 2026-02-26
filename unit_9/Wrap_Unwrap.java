package unit_9;

public class Wrap_Unwrap {
    public static void main(String[] args) {
        int a=10;
        Integer obji = Integer.valueOf(a);
        System.out.println("The value of obji is: " + obji);
        Integer obji2 = a; // Auto-boxing
        System.out.println("The value of obji2 is: " + obji2);
        int b = obji; // Auto-unboxing
        System.out.println("The value of b is: " + b);
        int c = obji.intValue(); // Explicit unboxing
        System.out.println("The value of c is: " + c);
        












    }
}
