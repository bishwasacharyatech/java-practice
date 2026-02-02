interface interface1 {
    void displayA();
}
interface interface2 {
    void displayB();
}
class A{
    public void displayA() {
        System.out.println("i am inside class ");
    }
}
class  B extends A implements  interface1 ,interface2 {
    public void displayA() {
        System.out.println("i am inside interface1");
    }
    public void displayB() {
        System.out.println("i am inside interface2");
    }
}
public class multipleInheritanceTest {
    public static void main(String[] args) {
        B obj = new B();
        obj.displayA();
        obj.displayB();
    }
}