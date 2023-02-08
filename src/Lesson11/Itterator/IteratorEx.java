package Lesson11.Itterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Guatemalla");
        states.add("Panama");
        states.add("Kuba");
        states.add("Argentina");
        states.add("Jamaaaaajka");

        Iterator<String> iterator = states.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
        //System.out.println(iterator.next()); - oshibka no such element exception
    }
}
