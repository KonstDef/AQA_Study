package Lesson15.TakeDropWhile;

import java.util.stream.Stream;

public class DropWhileEx {
    public static void main(String[] args) {
        Stream<Integer> numbers1 = Stream.of(-3,-2,-1,0,1,2,3,4,-4,-5);
        Stream<Integer> numbers2 = Stream.of(-3,-2,-1,0,1,2,3,4,-4,-5);

        //numbers.dropWhile(n->n<0)
        //  .forEach(n-> System.out.println(n));
        numbers1.sorted().dropWhile(n->n<0)
          .forEach(n-> System.out.println(n));
        System.out.println();
        System.out.print(numbers2
                .sorted().dropWhile(n->n<0).count());
    }
}
