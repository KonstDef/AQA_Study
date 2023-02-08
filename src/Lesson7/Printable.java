package Lesson7;
import java.util.Scanner;

public interface Printable{
    void print();

    default void makeCopies(){

        System.out.print("\nHow many copies do you want: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("\nYou need to make "+num+" copies.");
    }

    static void read(){
        System.out.println("Read printable.");
    }
}
