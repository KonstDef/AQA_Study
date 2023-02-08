package Lesson15.Match;

import java.util.ArrayList;
import java.util.Arrays;

public class Matches {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"Tom","Maria","Nikolai","Varvara","Fedia","Sam","Sara","Alice","Lyakushka"}));

        boolean any = names.stream().anyMatch(s->s.length()>3);
        System.out.println(any);

        boolean all = names.stream().allMatch(s->s.length()==3);
        System.out.println(any);

        boolean none = names.stream().noneMatch(s->s=="Bob");
        System.out.println(none);
    }
}
