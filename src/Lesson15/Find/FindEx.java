package Lesson15.Find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class FindEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"Tom","Maria","Nikolai","Varvara","Fedia","Sam","Sara","Alice","Lyakushka"}));

        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());
    }
}
