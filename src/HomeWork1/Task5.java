package HomeWork1;

import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {

        /*Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
        Определить существует ли такой треугольник.
        Дано: a, b, c – стороны предполагаемого треугольника.
        Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
        Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
        (Стороны треугольника вводим с клавиатуры) */

        //Logic
        class Triangle {
            public double a, b, c;

            public Triangle() {
                Scanner scanner = new Scanner(System.in);
                String placeholder;

                //a cycle
                for (; ; ) {
                    System.out.print("Enter number for a: ");
                    placeholder = scanner.nextLine();
                    try { // проверка что ввод является числом
                        a = Double.parseDouble(placeholder); //Google
                        if (a > 0) {
                            break;
                        } else {
                            System.out.println("Enter positive number");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Enter number!");
                    }
                }
                //b cycle
                for (; ; ) {
                    System.out.print("Enter number for b: ");
                    placeholder = scanner.nextLine();
                    try { // проверка что ввод является числом
                        b = Double.parseDouble(placeholder); //Google
                        if (b > 0) {
                            break;
                        } else {
                            System.out.println("Enter positive number");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Enter number!");
                    }
                }
                //c cycle
                for (; ; ) {
                    System.out.print("Enter number for c: ");
                    placeholder = scanner.nextLine();
                    try { // проверка что ввод является числом
                        c = Double.parseDouble(placeholder); //Google
                        if (c > 0) {
                            break;
                        } else {
                            System.out.println("Enter positive number");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Enter number!");
                    }
                }
            }

            public boolean check() {
                if (a > b + c || b > a + c || c > a + b) {
                    System.out.println("\nThis triangle can not exist!\n");
                    return false;
                } else {
                    System.out.println("\nThis triangle is correct!");
                    return true;
                }
            }
        }

        //Body
        for (; ; ) {
            Triangle triangle = new Triangle();
            if (triangle.check()) {
                break;
            }
        }
    }
}
