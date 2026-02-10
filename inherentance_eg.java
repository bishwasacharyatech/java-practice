class animal {
    void Eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends animal {
    void Bark() {
        System.out.println("The dog barks.");
    }
}
public class inherentance_eg {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.Eat();
    }   


}
