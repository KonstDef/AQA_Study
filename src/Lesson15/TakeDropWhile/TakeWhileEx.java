package Lesson15.TakeDropWhile;

import java.util.stream.Stream;

public class TakeWhileEx {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3,-2,-1,0,1,2,3,4,-4,-5);

        numbers.takeWhile(n->n<0)
          .forEach(n-> System.out.println(n));
        //numbers.sorted().takeWhile(n->n<0)
        //  .forEach(n-> System.out.println(n));
    }
}
