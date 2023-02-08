package Lesson11.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/resources/text.txt")) {
            System.out.printf("File size = %d \n", fis.available());

            int i;
            while ((i = fis.read()) != -1) {
                System.out.println("Byte value: " + i + ". That represents: " + (char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
