package Lesson11.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String string = "Cloud Castle";
        try(FileInputStream fis = new FileInputStream("src/resources/text.txt");
            FileOutputStream fos = new FileOutputStream("src/resources/textO.txt")){
            byte[] buffer = string.getBytes();
            System.out.println("With length: "+buffer.length);
            fos.write(buffer,0,buffer.length);
            System.out.println("Complete.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
