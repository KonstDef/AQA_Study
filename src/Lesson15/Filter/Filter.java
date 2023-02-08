package Lesson15.Filter;

import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("OPPhone 11", 10000),
                new Phone("KaPhone 3232", 1000),new Phone("UsPhone M", 5000));
        phoneStream.filter(p->p.getPrice()<5000).forEach(p-> System.out.println(p.getName()));
    }
}
