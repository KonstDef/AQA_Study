package HomeWork2;

/*  4.
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Variables
        int a = 0;          //int as it has the easiest implementation
        int b = 0;          //int as it has the easiest implementation
        int result = 0;
        //possible to implement double with bytecode or
        //add another if for last number to do a * 0.1 * x (for b.x)

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Input
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 1:
                    System.out.print("Enter integer for A: ");
                    placeholder = scanner.nextLine();
                    try { // int check
                        a = Integer.parseInt(placeholder);
                    } catch (NumberFormatException ex) {
                        System.out.println("Enter integer!");
                        i--;
                    }
                    break;
                case 2:
                    System.out.print("Enter integer for B: ");
                    placeholder = scanner.nextLine();
                    try { // int check
                        b = Integer.parseInt(placeholder);
                    } catch (NumberFormatException ex) {
                        System.out.println("Enter integer!");
                        i--;
                    }
                    break;
            }
        }

        //Logic a * b = a_1 + a_2 + a_3 + a_4 ... + a_b
        for (int i = 1; i <= b; i++) {
            result += a;
        }

        //Output
        System.out.printf("Multiplication of %d with %d is %d.", a, b, result);
    }
}
