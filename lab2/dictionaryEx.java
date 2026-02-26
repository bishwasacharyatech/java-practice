
import java.util.*; 
public class dictionaryEx {
    public static void main(String[] args) {
        Dictionary<String, String> geek= new Hashtable<String, String>();
        geek.put("123", "Code");
        geek.put("456", "program");

        //get () method
        System.out.println("Value for key '123': " + geek.get("123"));
        System.out.println("Value for key '456': " + geek.get("456"));

        //isEmpty() method
        System.out.println("Is the dictionary empty? " + geek.isEmpty());

        //remove() method
        System.out.println("Removing key 'A'... : " + geek.remove("A"));
        System.out.println("Value for key 'A' after removal: " + geek.get("A"));

        //size() method
        System.out.println("Size of the dictionary: " + geek.size());
    }
}
