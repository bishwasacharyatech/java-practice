class Person{
    void  message(){
        System.out.println("This is person class");
    }
}
//sub class studuent 
class Student extends Person{
    void message(){
        System.out.println("This is student class");
    }
    //note that dispaly() is only in student class
    void display(){
       //will invoke parent class message() method
        message();

        super.message();
    }
}
class superMethodExample {
    public static void main(String args[]) {
        Student obj=new Student();
        obj.display();
    }
}