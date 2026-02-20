 public class CharAtExample {
    public static void main(String[] args) {
        String word = "Gemini";

        char first = word.charAt(0);
        
     
        char last = word.charAt(word.length() - 1);

        System.out.println("First letter: " + first); 
        System.out.println("Last letter: " + last);  

        System.out.println("--- Printing all characters ---");
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Index " + i + " is: " + word.charAt(i));
        }
    }
 }





 