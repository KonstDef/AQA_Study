package Lesson15.Collect;

import Lesson15.Map.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("OPPhone 11", 10000),
                new Phone("KaPhone 3232", 1000),
                new Phone("UsPhone M", 5000));

        Map<Phone,String> filteredPhonesMap = phoneStream
                .collect(Collectors.toMap(s->s,s->s.getName()));

        filteredPhonesMap.forEach((k,v)-> System.out.println(v+" "+k.getPrice()+"$"));
    }
}
