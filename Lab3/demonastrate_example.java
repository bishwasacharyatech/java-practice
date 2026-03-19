//write a demonstrate example of all arraylist hashmap hashset and tree map in java

package Lab3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class demonastrate_example {
    
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("bishwas");
        arrayList.add("bipen");
        arrayList.add("Raj");
        arrayList.add("aayush");
        System.out.println("ArrayList: " + arrayList);

        // HashMap example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        System.out.println("HashMap: " + hashMap);

        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Yellow");
        System.out.println("HashSet: " + hashSet);

        // TreeMap example
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("TreeMap: " + treeMap);
    }
}
