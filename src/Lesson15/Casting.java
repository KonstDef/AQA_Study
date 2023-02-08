package Lesson15;

import java.util.Arrays;
import java.util.stream.*;

public class Casting {
    public static void main(String[] args) {
        Stream<String> citiesStream = Arrays.stream(new String[]{"Madrid","Moscow","Bangladesh"});
        citiesStream.forEach(s-> System.out.println(s));

    }
}
