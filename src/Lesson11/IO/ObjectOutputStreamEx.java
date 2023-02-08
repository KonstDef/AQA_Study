package Lesson11.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamEx {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/resources/person.dat"))){
            Person p = new Person("Vasya",42,200, true);
            oos.writeObject(p);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Person implements Serializable{
    public String name;
    public int age;
    public double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }

    public boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}
