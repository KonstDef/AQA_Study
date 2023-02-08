package Lesson11.IO;

import java.io.*;

public class DataIOStreamEx {
    public static void main(String[] args) {
        Person belka = new Person("Belka",1,0.2,false);

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/resources/dataInputStreamFile.txt"))){
            dataOutputStream.writeUTF(belka.name);
            dataOutputStream.writeInt(belka.age);
            dataOutputStream.writeDouble(belka.height);
            dataOutputStream.writeBoolean(belka.married);
            System.out.println("File has been written!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/resources/dataInputStreamFile.txt"))){
            String name = dataInputStream.readUTF();
            int age = dataInputStream.readInt();
            double height = dataInputStream.readDouble();
            boolean married = dataInputStream.readBoolean();

            System.out.printf("Name is %s Age is %d Height is %.2f Status is %b",name,age,height,married);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
