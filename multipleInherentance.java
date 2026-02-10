interface Animal_test {
    void eat();
}

interface Pet {
    void Bark();
    void Play();
}

class Dog implements Animal_test, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void Bark() {
        System.out.println("Dog barks");
    }

    public void Play() {
        System.out.println("Dog plays");
    }
}

// THIS NAME MUST MATCH THE FILENAME EXACTLY
public class multipleInherentance { 
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.eat();
    }
}