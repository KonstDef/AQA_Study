package Lesson11.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamEx {
    public static void main(String[] args) {
        String string = "Cloud Castle";
        try{
            FileOutputStream fos = new FileOutputStream("src/resources/text.txt");
            byte[] buffer = string.getBytes();
            System.out.println("With length: "+buffer.length);
            fos.write(buffer,0,buffer.length);
            fos.write(buffer[5]);
            System.out.println("Complete.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
