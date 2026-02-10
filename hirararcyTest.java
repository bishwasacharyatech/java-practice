class Animal{
    void Jump() {
        System.out.println("animal is jumping");
    }
}
class Cow extends Animal {
    void Eat() {
        System.out.println("cow is eating grass");
    }
}
class Goat extends Animal {
    void Weep() {
        System.out.println("goat is weeping");
    }   
    
}
public class hirararcyTest {
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.Eat();
        myCow.Jump();
        Goat myGoat = new Goat();
        myGoat.Weep();  
        myGoat.Jump();
    }  
 }