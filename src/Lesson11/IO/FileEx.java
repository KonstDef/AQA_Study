package Lesson11.IO;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File dir = new File("src/resources");
        if (dir.isDirectory()){
            for (File file: dir.listFiles()){
                if (file.isDirectory()){
                    System.out.println(file.getName()+"\t is folder");
                } else if (file.isFile()){
                    System.out.println(file.getName()+"\t is file");
                }
            }
        }
    }
}
