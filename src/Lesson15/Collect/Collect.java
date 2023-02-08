package Lesson15.Collect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args) {
        Stream<String> phones = Stream.of("iPhone X", "Nokia 3310", "Huawei Nexus 6P", "Galaxy S11", "LG G6",
                "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2","Pixel 2");

        Set<String> filteredPhonesSet = phones.filter(s->s.length()<12)
                .collect(Collectors.toCollection(TreeSet::new));

        filteredPhonesSet.forEach(System.out::println);
    }
}
