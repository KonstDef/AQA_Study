package Lesson15.Map;

import java.util.stream.Stream;

public class StreamMapEx {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("OPPhone 11", 10000),
                new Phone("KaPhone 3232", 1000),
                new Phone("UsPhone M", 5000));

        phoneStream.map(p->"Name: "+p.getName() + " price " + p.getPrice())
                .forEach(System.out::println);
    }
}
