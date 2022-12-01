package Lesson3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] temp = {1, 3, 23, 33, 12, 123, 99};
        int sum = 0;
        double med;
        System.out.println("Length of array is " + temp.length);

        /* Classical
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        */

        // Modern
        for (int i : temp) {
            sum += i;
        }

        med = sum / temp.length;
        System.out.println(med);

        System.out.println(Arrays.toString(temp));
    }
}