class test{ 
    
    private String name;
    private int age;
    public String getName(){

        return name;
    }
    public int getAge(){
        return age; 
        }
       public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }   
    
}
public class encapulation_eg {
    public static void main(String[] args) {
        test obj = new test();
        obj.setName("raju paudel");
        obj.setAge(25);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
