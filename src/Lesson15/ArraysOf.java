package Lesson15;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArraysOf {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Paris", "London", "Madrid", "Buharest", "Prague");
        citiesStream.forEach(s -> System.out.println(s));

        String[] cities = {"Paris", "London", "Bristole"};
        Stream<String> citiesStrea = Stream.of(cities);

        int[] intArray = new int[5 * 2 + 1];
        for (int i = -5, j = 0; i <= 5; i++, j++) {
            intArray[j] = i;
        }

        IntStream intStream = IntStream.of(intArray);
        intStream.forEach(i -> System.out.println(i));

        LongStream longStream = LongStream.of(10000, 232323);
        longStream.forEach(i -> System.out.println(i));

        DoubleStream doubleStream = DoubleStream.of(1.23, 123.32);
        doubleStream.forEach(i -> System.out.println(i));
    }
}
