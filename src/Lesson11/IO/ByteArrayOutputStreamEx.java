package Lesson11.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) {
        String text = "Skymachine Karnivool";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try{
            byteArrayOutputStream.write(text.getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(byteArrayOutputStream);
    }
}
