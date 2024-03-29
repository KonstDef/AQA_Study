package HomeWork1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task4 {
    public static void main(String args[]) {

        /*4. В переменную записываем число.
        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
        Например, "это однозначное положительное число".
        Достаточно будет определить, является ли число однозначным, " двузначным или трехзначным и более. */

        //Variables
        double number; //Reason for double = to check if number is floating number or not

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Input
        //Input cycle
        for (; ; ) {
            System.out.print("Enter number: ");
            placeholder = scanner.nextLine();
            try {
                number = Double.parseDouble(placeholder);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Enter number!");
            } //num check
        }

        //Logic + Output
        //Int or double check
        if (number % 1 != 0) {
            System.out.println("It is a floating point number!");
        } else {
            System.out.println("It is an integer number!");
        }

        //Positive, negative or zero check
        if (number < 0) {
            System.out.println("It is a negative number!");
        } else if (number > 0) {
            System.out.println("It is a positive number!");
        } else {
            System.out.println("Number is zero!");
        }

        //Level of number
        if (abs(number) >= 1000) {
            System.out.println("It is Millenia number!");
        } else if (abs(number) >= 100) {
            System.out.println("It is Centuria number!");
        } else if (abs(number) >= 10) {
            System.out.println("It is Decada number!");
        } else if (abs(number) > 0) {
            System.out.println("It is Numerica number!");
        }
    }
}
