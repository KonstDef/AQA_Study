package HomeWork1;

import java.util.Scanner;

public class Task6 {
    public static void main(String args[]) {

        /*6. Дано целое число.
        Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2.
        Если нулевым, то заменить его на 10.
        Вывести полученное число.*/

        //Variables
        int number;

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Logic
        //Input cycle
        for (; ; ) {
            System.out.print("Enter integer number: ");
            placeholder = scanner.nextLine();
            try { // проверка что ввод является интом
                number = Integer.parseInt(placeholder); //Google
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Enter integer!");
            }
        }

        //Positive, negative or zero check
        if (number < 0) {
            number -= 2;
        } else if (number > 0) {
            number += 1;
        } else {
            number = 10;
        }

        //Output
        System.out.println("Number changed to: " + number);
    }
}
