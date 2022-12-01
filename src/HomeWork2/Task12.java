package HomeWork2;

/*  12.
Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите какой элемент является в этом
массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        //Variables
        int infoNum = 0; //variable to keep the highest number
        int infoPos = 0; //variable to keep it last position

        Random random = new Random();
        int[] intArray = random.ints(12, 0, 16).toArray();

        //Output1
        System.out.printf("Array:\t%s\n", Arrays.toString(intArray));

        //Logic
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] >= infoNum) {
                infoNum = intArray[i];
                infoPos = i;
            }
        }

        //Output2
        System.out.printf("Has highest value = %d.\nwith index for last instance = %d.", infoNum, infoPos);
    }
}
