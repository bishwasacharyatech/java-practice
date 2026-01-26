class test{
    private String name;
    private int age;

    public String getname(){
        return name;
    } 
    public int getage(){
        return age;

    }
    public void setname(String   name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }

}
public class encapulationEx {
    public static void main(String args[]){
        test obj=new test();
        obj.setname("bishwas");
        obj.setage(20);
        System.out.println("Name: "+obj.getname());
        System.out.println("Age: "+obj.getage());
    }
}
