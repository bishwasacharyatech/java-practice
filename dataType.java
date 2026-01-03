//wap to demonstrate data types  available in java
import java.util.Arrays;
public class dataType {
    public static void main(String[] args) {
        //primitive data types
        int a = 10;
        float b = 20.5f;
        double c = 30.99;
        char d = 'A';
        boolean e = true;
        byte f = 100;
        short g = 20000;
        long h = 300000L;

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("Byte: " + f);
        System.out.println("Short: " + g);
        System.out.println("Long: " + h);

        //non-primitive data types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};
       
        System.out.println("String: " + str);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
