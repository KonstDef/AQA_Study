package Lesson10.Qeuque;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(12);
        System.out.println(list);
        list.add(23);
        System.out.println(list);
        list.add(1,28);
        System.out.println(list);
        list.add(42);
        System.out.println(list);
        list.remove((Integer) 9);
        System.out.println(list);

        for (Integer i : list){
            System.out.print(i+" ");
        }
    }
}
