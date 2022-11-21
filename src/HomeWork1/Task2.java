package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {

        /*2. Объявить три переменные типа int и присвоить первой числовое значение,
        вторая переменная равна первой переменной увеличенной на 3,
        а третья переменная равна сумме первых двух.*/

        //Variables
        int var1, var2, var3;

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Logic
        //Input cycle
        for (; ; ) {
            System.out.print("Enter integer Variable 1: ");
            placeholder = scanner.nextLine();
            try {
                var1 = Integer.parseInt(placeholder);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Enter integer!");
            } //int check
        }

        var2 = var1 + 3;
        var3 = var1 + var2;

        //Output
        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);
        System.out.println("Variable 3 = " + var3);
    }
}
