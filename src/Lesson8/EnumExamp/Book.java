package Lesson8.EnumExamp;

import java.util.Arrays;

public class Book {
    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type) {
        bookType = type;
        this.name = name;
        this.author = author;
    }

    public void getBookType() {
        switch (bookType) {
            case FANTASY:
                System.out.println("Fantasy");
                break;
            case SCI_FI:
                System.out.println("Sci-fi");
                break;
            case BIOGRAFY:
                System.out.println("Biografy");
                break;
            case HISTORICAL:
                System.out.println("Historical");
                break;
            case TECHNICAL:
                System.out.println("Technical");
                break;
            case DETECTIVE:
                System.out.println("Detective");
                break;
        }

    }
}

enum Type {
    FANTASY,
    SCI_FI,
    BIOGRAFY,
    HISTORICAL,
    DETECTIVE,
    TECHNICAL
}

class Program {
    public static void main(String[] args) {
        Book damnedKing = new Book("Damned king", "Maurice Druon", Type.HISTORICAL);
        Book bestBookToGoSleep = new Book("Java", "Schildt", Type.TECHNICAL);
        System.out.printf("Book %s by %s has a type %s\n", bestBookToGoSleep.name, bestBookToGoSleep.author, bestBookToGoSleep.bookType);
        System.out.printf("Book %s by %s has a type ", damnedKing.name, damnedKing.author);
        damnedKing.getBookType();
        System.out.println("---");
        Type[] types = Type.values();
        System.out.println(Arrays.toString(types));
        for (Type i : types){
            System.out.println(i.name());
        }
    }
}
