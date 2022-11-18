package Lesson2;

// 0000 aaaa_2 = +a_10;
// 1111 aaaa_2 = -a_10;


import java.util.Scanner;

public class SquareAndSweets {
    public static void main(String args[]) {
        //Прямоугольник 5 и 7, площадь просто умножение сторон
        /*int a = 5;
        int b = 7;
        int s = a*b;
        System.out.println("Площадь прямоугольника равна " + s);
         */

        //В зависимости от переданного значения в консоль, если конфет в вазе больше 320, то вывести предложение "В вазе все конфеты"
        // нет, "конфет в вазе не хватает + колличество"

        int limit = 320; // объявление предела
        int sweets = -1; // -1 чтобы работал while
        String placeholder; // заглушка для scan

        Scanner scan = new Scanner(System.in); // объявление сканера

        while (sweets < 0) { //цикл ввода
            System.out.print("Введите колличество конфет в вазе: ");
            placeholder = scan.nextLine();
            try { // проверка что ввод является интом
                sweets = Integer.parseInt(placeholder);
                if (sweets < 0) System.out.println("Введите положительное число"); // проверка на отрицательность
            } catch (NumberFormatException ex) {
                System.out.println("Введите положительное число");
            }
        }

        if (sweets > limit) {
            System.out.println("\nВ вазе лишних " + (sweets - limit) + " конфет."); // если предел
        } else if (sweets == limit) { // если предел достигнут
            System.out.println("\nВ вазе все конфеты!");
        } else if (sweets == 0) { // если ваза пользователя пуста
            System.out.println("\nВаза пуста!");
        } else {
            System.out.println("\nВ вазе не хватает " + (limit - sweets) + " конфет."); // норма
        }
    }
}
