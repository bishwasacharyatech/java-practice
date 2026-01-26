//reference current class instance variables
class thisEx{
    int a;
    int b;
    //parameterized constructor
    thisEx(int a, int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        //displaying value of a and b
        System.out.println("a: " +a+ " b= "+b);


    }
    public static void main(String [] args)
    {
        thisEx obj = new thisEx(10,20);
        obj.display();

    }
}