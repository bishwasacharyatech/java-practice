//write a java program that store 5 elememts in the vector and displays them 
package Lab3;

import java.util.Vector;
public class vectorDisplay {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");
        vector.add("Element 4");
        vector.add("Element 5");

        
        System.out.println("Elements in the vector:");
        for (String element : vector) {
            System.out.println(element);
        }
    }
}