class Box {
    double width, height;

    // Non-parameterized constructor
    Box() {
        width = 10; height = 10;
    }

    // Parameterized constructor
    Box(double w, double h) {
        width = w; height = h;
    }

    void area() {
        System.out.println("Area: " + (width * height));
    }
}

public class Program {
    public static void main(String[] args) {
        Box b1 = new Box();       // Calls non-param constructor
        Box b2 = new Box(5, 4);   // Calls param constructor            
        
        b1.area();
        b2.area();
    }
}