package Lesson11.Set;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(random.nextInt(10));
        set.add(random.nextInt(10));
        set.add(random.nextInt(10));
        set.add(random.nextInt(10));
        set.add(random.nextInt(10));
        set.add(random.nextInt(10));
        System.out.println(set);
        set.add(5);
        System.out.println(set);
        System.out.println("--------");

        Set<Integer> setLinked = new LinkedHashSet<>();
        setLinked.add(42);
        setLinked.add(0);
        setLinked.add(9);
        setLinked.add(4);
        System.out.println(setLinked);
        setLinked.add(42);
        System.out.println(setLinked);
        System.out.println("--------");

        Set<Integer> setTreeSet = new TreeSet<>();
        setTreeSet.add(11);
        setTreeSet.add(random.nextInt(10));
        setTreeSet.add(random.nextInt(10));
        setTreeSet.add(random.nextInt(10));
        System.out.println(setTreeSet);
        setTreeSet.add(11);
        System.out.println(setTreeSet);
        System.out.println("--------");
    }
}
