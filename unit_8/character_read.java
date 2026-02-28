package unit_8;
import java.io.*;;

public class character_read{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("bishwas.txt");
            BufferedReader br =new BufferedReader(reader);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            reader .close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}
