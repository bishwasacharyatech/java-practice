interface Animal {
    void speak(); // Abstract method
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Dog says: Woof Woof");
    }
}

public class Program11 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.speak();
    }
}