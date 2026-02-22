package stringAll;
public class StringExample {
    public static void main(String[] args) {
        String text = "Hello, Java World!";

        // 1. Basic Information
        int length = text.length();                 // 18 (Total characters)
        char firstChar = text.charAt(7);            // 'J' (Character at index 7)
        
        // 2. Finding Positions (Indexing)
        int firstIndex = text.indexOf("a");         // 8 (First occurrence of 'a')
        
        // 3. Transformation (Creates a new String)
        String upper = text.toUpperCase();          // "HELLO, JAVA WORLD!"
        String replaced = text.replace("Java", "AI"); // "Hello, AI World!"
        
        // 4. Extraction
        String sub = text.substring(7, 11);         // "Java" (From index 7 to 10)
                // 5. Comparison & Validation
        boolean starts = text.startsWith("Hello");  // true
        boolean contains = text.contains("Java");   // true

        // --- Outputting Results ---
        System.out.println("Original: " + text);
        System.out.println("Length: " + length);
        System.out.println("Char at index 7: " + firstChar);
        System.out.println("Index of 'a': " + firstIndex);
        System.out.println("Substring (7-11): " + sub);
        System.out.println("Upper: " + upper);
        System.out.println("Replaced: " + replaced);
        System.out.println("Starts with 'Hello': " + starts);
        System.out.println("Contains 'Java': " + contains);
    }
}
