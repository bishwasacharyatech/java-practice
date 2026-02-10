class  animal{
    void Jump() {
        System.out.println("animal is jumping");
    }
}
class cow extends animal {
    void Eat() {
        System.out.println("cow is eating grass");
    }
}
class babyCow extends cow {
    void Weep() {
        System.out.println("baby cow is weeping");
    }
}
public class multi_levelTestInheritance {
    public static void main(String[] args) {
        babyCow myBabyCow = new babyCow();
        myBabyCow.Weep();
        myBabyCow.Eat();
        myBabyCow.Jump();
    }
}
