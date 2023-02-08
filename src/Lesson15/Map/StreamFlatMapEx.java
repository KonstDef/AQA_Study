package Lesson15.Map;

import java.util.stream.Stream;

public class StreamFlatMapEx {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("OPPhone 11", 10000),
                new Phone("KaPhone 3232", 1000),
                new Phone("UsPhone M", 5000));

        phoneStream.flatMap(phone -> Stream.of(
                String.format("Name: %s price no discount: %d", phone.getName(),phone.getPrice()),
                String.format("Name: %s price discounted: %d", phone.getName(),(int) (phone.getPrice()*0.9))
        )).forEach(System.out::println);
    }
}
