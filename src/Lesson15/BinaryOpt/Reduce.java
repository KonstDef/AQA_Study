package Lesson15.BinaryOpt;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numberStream.reduce((x,y)->x*y);
        System.out.println(result.get());

        Stream<String> stringStream = Stream.of("мама","мыла","раму");
        String stringOptional = stringStream.reduce("Result:",(x,y)->x+" "+y);
        //        Optional<String> stringOptional = stringStream.reduce((x,y)->x+" "+y);
        System.out.println(stringOptional);

    }
}
