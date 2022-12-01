package HomeWork2;

/*  11.
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */

import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        //Variables
        Random random = new Random();

        int[] intArray = random.ints(4, 0, 11).toArray();
//        for testing purpose
//        int[] intArray = new int[]{1,2,3,4,5};

        //Output
        System.out.printf("Array:\t%s\n", Arrays.toString(intArray));

        //Logic
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i - 1] >= intArray[i]) {
                System.out.println("is usual.");
                break;      //don't need to test all values
            } else if (i == intArray.length - 1) {
                System.out.println("is strictly increasing sequence.");
            }
        }
    }
}
