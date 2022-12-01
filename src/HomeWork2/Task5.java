package HomeWork2;

/*  5.
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

public class Task5 {
    public static void main(String[] args) {
        //Variables
        double inchToCm = 2.54;             //conversion between units

        System.out.printf("in\tcm\n");      //first row
        //Logic and output
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d\t%.2f\n", i, inchToCm * i);
        }
    }
}