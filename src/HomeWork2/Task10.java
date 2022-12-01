package HomeWork2;

/*  10.
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
 */

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        //Variables
        Random random = new Random();

        int[] intArray1 = random.ints(5, 0, 16).toArray();
        int[] intArray2 = random.ints(5, 0, 16).toArray();

        double mean1 = 0; //mean for array1
        double mean2 = 0; //mean for array2

        //Output1
        System.out.printf("1st array:\t%s\n"
                + "2nd array:\t%s\n", Arrays.toString(intArray1), Arrays.toString(intArray2)); //prints 2 arrays on 2 lines

        //Logic
        for (int i = 0; i < intArray1.length; i++) {
            mean1 += intArray1[i];
            mean2 += intArray2[i];
        }
        mean1 /= intArray1.length;
        mean2 /= intArray2.length;

        //Output2
        System.out.printf("\n1st array mean:\t%.1f\n"
                + "2nd array mean:\t%.1f\n", mean1, mean2); //prints 2 means on 2 lines

        if (mean1 > mean2) {
            System.out.println("Mean of 1st array is bigger then 2nd.");
        } else if (mean2 > mean1) {
            System.out.println("Mean of 2nd array is bigger then 1st.");
        } else {
            System.out.println("Means are equal.");
        }
    }
}
