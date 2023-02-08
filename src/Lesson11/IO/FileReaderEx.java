package Lesson11.IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/resources/FileWriter.txt")){
            int c;
            while ((c = reader.read())!= -1){
                System.out.print((char)c);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
