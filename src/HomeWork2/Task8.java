package HomeWork2;

/*  8.
Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран. Подсчитайте сколько
в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        //Variables
        Random random = new Random();
        //found method of generating array on https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html
        //int[] intArray = random.ints(15, 0, 100).toArray();
        int[] intArray = new int[15];
        int even = 0;   //variable to get even

        //Logic
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
            if (intArray[i] % 2 != 1) {
                even++;
            }
        }

        //Output
        System.out.printf("Array: %s" + "\nHas %d even numbers.", Arrays.toString(intArray), even);
    }
}
