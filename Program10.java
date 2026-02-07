class Maths {
    // Overloaded methods for addition
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

public class Program10 {
    public static void main(String[] args) {
        Maths obj = new Maths();
        System.out.println("Int sum: " + obj.add(5, 10));
        System.out.println("Double sum: " + obj.add(5.5, 4.5));
    }
}