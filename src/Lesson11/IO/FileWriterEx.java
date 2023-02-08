package Lesson11.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("src/resources/FileWriter.txt")){
            String text = "Pryvitanne Svet!";
            fileWriter.write(text);
            fileWriter.append('\n');
            fileWriter.append("I tebe!");

            fileWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
