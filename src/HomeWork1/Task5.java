package HomeWork1;

import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {

        /*5. Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
        Определить существует ли такой треугольник.
        Дано: a, b, c – стороны предполагаемого треугольника.
        Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
        Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
        (Стороны треугольника вводим с клавиатуры) */

        //Variables
        double a, b, c;

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Logic
        //a cycle
        for (; ; ) {
            System.out.print("Enter number for a: ");
            placeholder = scanner.nextLine();
            try { // check int
                a = Double.parseDouble(placeholder); //Google
                if (a > 0) break;
                else {
                    System.out.println("Enter positive number");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Enter number!");
            } //num check
        }

        //b cycle
        for (; ; ) {
            System.out.print("Enter number for b: ");
            placeholder = scanner.nextLine();
            try {
                b = Double.parseDouble(placeholder);
                if (b > 0) break;
                else {
                    System.out.println("Enter positive number");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Enter number!");
            } //num check
        }

        //c cycle
        for (; ; ) {
            System.out.print("Enter number for c: ");
            placeholder = scanner.nextLine();
            try {
                c = Double.parseDouble(placeholder);
                if (c > 0) break;
                else {
                    System.out.println("Enter positive number");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Enter number!");
            } //num check
        }

        //Output
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("\nThis triangle can not exist!\n");
        } else {
            System.out.println("\nThis triangle is correct!");
        }
    }
}
