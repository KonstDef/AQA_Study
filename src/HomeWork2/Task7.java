package HomeWork2;

/*  7.
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */

public class Task7 {
    public static void main(String[] args) {
        //Variables
        int number = 0;         //Variable that will count odd number

        //Logic
        for (int i = 1; i <= 99; i++) { //1 and 99 are included (not specified)
            if (i % 2 != 0) {
                number += i;
            }
        }

        //Variable
        System.out.printf("Sum of all odd numbers in (1-99) is %d", number);
    }
}
