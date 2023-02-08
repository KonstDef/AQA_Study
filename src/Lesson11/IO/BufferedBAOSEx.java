package Lesson11.IO;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedBAOSEx {
    public static void main(String[] args) {
        String text = "Pryvitanne svet!";
        try (FileOutputStream out = new FileOutputStream("notes.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            byte[] buffer = text.getBytes();
            bos.write(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
