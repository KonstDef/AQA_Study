package Lesson15;

import java.util.stream.IntStream;

public class StreamAPIExampleClass {
    public static void main(String[] args) {


//                int[] intArray = new int[5*2+1];
//        for (int i = -5, j = 0; i <= 5; i++, j++) {
//            intArray[j] = i;
//        }
//        int result = 0;
//        for (int i : intArray) {
//            if (i > 0) result++;
//        }
//        System.out.println(result);

        long count = IntStream.of(-5,-4,-3,-2,-1,0,2,3,4,5).filter(w->w>0).count();        System.out.println(count);
    }
}
