import java.util.Random;
public class RandomEx {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(100); 

        System.out.println("Generated Random Number: " + n);
    }
}