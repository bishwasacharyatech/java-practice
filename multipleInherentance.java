interface Animal_test {
    void eat();
}

interface Pet {
    void bark();
    void play();
}

class Dog implements Animal_test, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

// THIS NAME MUST MATCH THE FILENAME EXACTLY
public class multipleInherentance { 
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}