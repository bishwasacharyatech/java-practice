package unit_10;
import java.util.HashSet;
import java.util.Iterator;
public class Iterator_example {
    public static void main(String[] args) {
        
        HashSet<String> h =new HashSet<String>();
        h.add("india");
        h.add("Austrilia");
        h.add("South africa");
        h.add("india");
        System.out.println("iteration over list :");
        Iterator<String> i = h.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
    
}
