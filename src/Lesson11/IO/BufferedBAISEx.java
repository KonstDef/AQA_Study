package Lesson11.IO;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedBAISEx {
    public static void main(String[] args) {
        String text = "Pryvitanne svet!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try (BufferedInputStream bis = new BufferedInputStream(in)) {
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
    }
}
