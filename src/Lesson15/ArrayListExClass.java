package Lesson15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExClass {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities,"Paris","Chicago","Prague","Liverpool","Madrid");
        cities.stream()
                .filter(s->s.length()==6)
                .forEach(s -> System.out.println(s));
    }
}
