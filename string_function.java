//wap to demonstrate built-in string function in java
public class string_function {
    public static void main(String[] args) {
        String str = "Hello World by bishwas ";
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
    }
}