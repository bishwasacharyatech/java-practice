//wap to demonstrate the concept of class and object and method in java
// 1. Define the Class
class Student {
    
    String name;
    int rollNo;

    // 2. Define a Method (The Behavior)
    void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class Program8 {
    public static void main(String[] args) {
        
        // 3. Create an Object (The Instance)
        Student s1 = new Student(); 
        
      
        s1.name = "bishwas acharya";          
        s1.rollNo = 1;

        // 4. Calling the Method
        s1.display();               
    }
}