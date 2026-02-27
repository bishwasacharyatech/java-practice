package unit_8;
import java.io.*;;

public class character_stream {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("bishwas.txt");
            BufferedWriter bw =new BufferedWriter(writer);

            bw.write("Hello, this is a test file.");
            bw.write("This file is created using BufferedWriter.");
            System.out.println("File writing completed successfully.");
            bw.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}
