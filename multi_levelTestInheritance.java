class  animal{
    void jump() {
        System.out.println("animal is jumping");
    }
}
class cow extends animal {
    void eat() {
        System.out.println("cow is eating grass");
    }
}
class babyCow extends cow {
    void weep() {
        System.out.println("baby cow is weeping");
    }
}
public class multi_levelTestInheritance {
    public static void main(String[] args) {
        babyCow myBabyCow = new babyCow();
        myBabyCow.weep();
        myBabyCow.eat();
        myBabyCow.jump();
    }
}
