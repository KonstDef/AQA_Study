package HomeWork1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task4 {
    public static void main(String args[]) {

        /*В переменную записываем число.
        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
        Например, "это однозначное положительное число".
        Достаточно будет определить, является ли число однозначным, " двузначным или трехзначным и более. */

        //Variables
        double number; //Решил разбавить задание ещё на проверку float или int, не особо тяжёлая реализация

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Input
        //Input cycle
        for (; ; ) {
            System.out.print("Enter number: ");
            placeholder = scanner.nextLine();
            try { // проверка что ввод является числом
                number = Double.parseDouble(placeholder); //Google
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Enter number!");
            }
        }

        //Logic + Output
        //Int or double check
        if (number - (int) number != 0) { // 100.10 - 100 = 0.1
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
        if (abs(number) >= 1000) { //Flashback from R
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
