package Lesson11.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamEx{
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("src/resources/text.txt");
        FileOutputStream fos = new FileOutputStream("src/resources/textO.txt");
        try{
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer,0,buffer.length);
            fos.write(buffer,0,buffer.length);
            System.out.println("Done.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fis!=null&&fos!=null) {
                    System.out.println("Streams not closed.");
                    fis.close();
                    fos.close();
                }
            } catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println("Streams closed.");
        }
    }
}
