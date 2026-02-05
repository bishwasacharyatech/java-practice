// multilevel inheritance 
class Animal_test {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal_test {
    void bark() {
        System.out.println("barking...");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}
public class inherentance { 

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();
    }
}