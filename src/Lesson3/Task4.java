package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        //IntStream int = new IntStream.int;

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        //System.out.println(ints(100));
    }
}
