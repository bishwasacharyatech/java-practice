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
class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}
public class inherentance { 

    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}