package Lesson3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayMain = new int[]{1, 2, 32, 23, 11, 99, 87, 56, 1231, 23, 547, 237, 756};
        int[] placeholder = new int[arrayMain.length];

        for (int i = arrayMain.length - 1; i >= 0; i--) {
            placeholder[arrayMain.length - (i + 1)] = arrayMain[i];
        }
        System.out.println(Arrays.toString(arrayMain));
        System.out.println(Arrays.toString(placeholder));
    }
}
