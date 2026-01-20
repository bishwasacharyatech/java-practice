class MathOperation {
    // Version 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Version 2: Adds three integers (Different number of inputs)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Version 3: Adds two doubles (Different type of inputs)
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        
        System.out.println(obj.add(5, 10));        // Calls Version 1
        System.out.println(obj.add(5, 10, 15));    // Calls Version 2
        System.out.println(obj.add(5.5, 2.2));     // Calls Version 3
    }
}