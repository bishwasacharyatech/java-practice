class Animal{
    void jump() {
        System.out.println("animal is jumping");
    }
}
class Cow extends Animal {
    void eat() {
        System.out.println("cow is eating grass");
    }
}
class Goat extends Animal {
    void weep() {
        System.out.println("goat is weeping");
    }   
    
}
public class hirararcyTest {
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.eat();
        myCow.jump();
        Goat myGoat = new Goat();
        myGoat.weep();  
        myGoat.jump();
    }  
 }