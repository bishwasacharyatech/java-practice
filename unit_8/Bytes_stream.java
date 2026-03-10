package unit_8;

import java.io.*;
public class Bytes_stream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("bishwas.txt");
           int content= 1011101;
           fos.write((byte) content);
            System.out.println("File writing completed successfully.");
            fos.close();

            FileInputStream fis = new FileInputStream("bishwas.txt");
            int data = fis.read();
            System.out.println("Data read from file: " + data);
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    
}
}
