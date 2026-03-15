package unit_10;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> h =new TreeSet<String>();
        //adding elements into treeSet
        h.add("india");
        h.add("china");
        h.add("nepal");
        h.add("nepal"); //add duplicate elements

        System.out.println(h);
        System.out.println("list conatain nepal or not :"+h.contains("nepal"));
        //removing items from Tree set using remove
        h.remove("china");
        System.out.println("List after removing china :\n"+h);

    }

    
}
