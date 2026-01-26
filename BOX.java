abstract class box {
    int l,b,h,volume;
    void getdata(){
        l=10;
        b=5;
        h=2;


    }   
    void calculate(){
        volume=l*b*h;
        System.out.println("Volume of box is: "+volume);
    } 
}
public class BOX extends box {
    public static void main(String args[]){
        box obj=new BOX();
        obj.getdata();
        obj.calculate();
    }    
}
