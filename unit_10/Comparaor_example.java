package unit_10;
import java.util.ArrayList;
import java.util.Collections;

public class Comparaor_example {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("ram");
        list.add("hari");
        list.add("shyam");
        Collections.sort(list);
        System.out.println(list);

        
    }
}
