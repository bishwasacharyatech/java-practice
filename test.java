public class test{}
    void getdata(){
        l=5;
        b=6;
        h=7;
    }
    void calculate(){
        volume=l*b*h;
        System.out.println("Volume of cuboid is: "+volume);
    }
}
public class abstraction extends test
    public static void main(String args[]){
        test obj=new test();
        obj.getdata();
        obj.calculate();
    }
}
