package HomeWork2;

/*  9.
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        //Variables
        Random random = new Random();
        // found method of generating array on https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html
        int[] intArray = random.ints(20, 0, 21).toArray();

        //Output1
        System.out.printf("Original array:\t%s\n", Arrays.toString(intArray));

        //Logic
        //changes numbers on odd indexes (except 0) to 0
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 1) {
                intArray[i] = 0;
            }
        }

        //Output2
        System.out.printf("Edited array: \t%s\n", Arrays.toString(intArray));
    }
}
