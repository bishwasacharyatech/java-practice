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
class puppy extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}
public class inherentance { 

    public static void main(String[] args) {
        puppy Dogpuppy = new Dogpuppy();
        Dogpuppy.weep();
        Dogpuppy.bark();
        Dogpuppy.eat();
    }
}