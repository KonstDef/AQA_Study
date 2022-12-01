package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aray$2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int it = 0;
        int ij = 0;

        String placeholder;
        while (it<=0) {
            System.out.print("Введите 1ый размер массива: ");
            placeholder = scanner.nextLine();
            try { // проверка что ввод является интом
                it = Integer.parseInt(placeholder);
                if (it < 0) System.out.println("Введите положительное число"); // проверка на отрицательность
            } catch (NumberFormatException ex) {
                System.out.println("Введите положительное число");
            }
        }//цикл ввода
        while (ij<=0) {
            System.out.print("Введите 2ой размер массива: ");
            placeholder = scanner.nextLine();
            try { // проверка что ввод является интом
                ij = Integer.parseInt(placeholder);
                if (ij < 0) System.out.println("Введите положительное число"); // проверка на отрицательность
            } catch (NumberFormatException ex) {
                System.out.println("Введите положительное число");
            }
        }//цикл ввода

        /*int[][] array = new int[it][ij];
        for(int i =0;i<it;i++) {
            array[i] = random.ints(ij, 0, 10).toArray();
            System.out.println(Arrays.toString(array[i]));
        }*/

        /*int[][] array = new int[it][ij];
        for (int i = 0; i<it; i++){
            for(int j =0; j<ij; j++){
                array[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(array[i]));
        }*/

        int[][] array = new int[it][ij];
        for (int i = 0; i<it; i++){
            for(int j =0; j<ij; j++){
                array[i][j] = random.nextInt(10);
                System.out.printf("[%d]",array[i][j]);
            }
            System.out.println();
        }

        int sum = 0;
        for(int i = 0; i < array.length;i++){
            sum+=array[i][i];
        }
        System.out.printf("Сумма главной диагонали = %d;",sum);
    }
}
