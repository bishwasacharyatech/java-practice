abstract class Shape {
    abstract void draw(); // No body
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}

public class program14 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}