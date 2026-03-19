//wap to read write and append  data in a file in java file reader and file writer class
package Lab3;
import java.io.*;
public class filehandelingExample {
    public static void main(String[] args) {    
      
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example in Java.");
            writer.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        
        try {
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Data read from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
}

    }
}