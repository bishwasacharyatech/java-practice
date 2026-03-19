//Write a java program to store student ids and names using hashtable.
package Lab3;
import java.util.Hashtable;
public class hashtableExample {
    public static void main(String[] args) {
       
        Hashtable<Integer, String> studentTable = new Hashtable<>();

        
        studentTable.put(101, "bishwas");
        studentTable.put(102, "sailesh");
        studentTable.put(103, "Raj");
        studentTable.put(104, "bipen");
        studentTable.put(105, "aayush");
        studentTable.put(106, "rohit");

       
        System.out.println("Student IDs and Names:");
        for (Integer id : studentTable.keySet()) {
            System.out.println("ID: " + id + ", Name: " + studentTable.get(id));
        }
    }
}

