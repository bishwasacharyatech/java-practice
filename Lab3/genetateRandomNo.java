//write a java program to generate random number between 1 to 100
package Lab3;
import java.util.Random;
public class genetateRandomNo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}

