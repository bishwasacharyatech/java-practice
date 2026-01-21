abstract class abstraction_eg {
    int l,b,h,volume;
    void getdata(){
        l=10;
        b=20;
        h=30;
    }
    void calculate(){
        volume=l*b*h;
        System.out.println("Volume of cuboid is: "+volume);
    }
}
public class abstraction extends abstraction_eg {
    public static void main(String[] args) {
        abstraction obj=new abstraction();
        obj.getdata();
        obj.calculate();
    }
}

