package Lesson7;
public class Book2 implements Printable{

    String name;
    String author;

    Book2(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s)\n", name, author);
    }

    @Override
    public void makeCopies(){
        System.out.println("Method was overriden!");
    }
}
