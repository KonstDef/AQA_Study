package Lesson11.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) {
        String text = "Pryvitanne svet!";
        try (FileOutputStream fos = new FileOutputStream("notes3.txt");
        PrintStream printStream = new PrintStream(fos)){
            printStream.println(text);
            System.out.println("End");
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
