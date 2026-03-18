package unit_10;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet: " + set);
        System.out.println("Contains 'Banana': " + set.contains("Banana"));
        System.out.println("Size: " + set.size());

        set.remove("Cherry");
        System.out.println("After removing 'Cherry': " + set);
    }
       
    

    

}
