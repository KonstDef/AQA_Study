package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String title = "Breathtaking";
        Scanner scan = new Scanner(System.in); //create input

        //сам запрос юзеру
        System.out.print("What is your name?\nMy name is : ");
        name = scan.nextLine(); //запрос имени

        System.out.println("Hello " + name + " you are " + title + "!"); // output
    }
}