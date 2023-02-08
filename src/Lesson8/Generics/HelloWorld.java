package Lesson8.Generics;

import java.util.*;

class Program2{
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Hello");
        String text = list.get(0)+" world!";
        System.out.println(text);
        System.out.println("---");

//        String hello = list.get(0); //was not implemented
        String hello = (String) list.get(0);
        System.out.println(hello);
        System.out.println("---");

//        list.add(233);
//        for (Object str : list){
//            System.out.println("-"+(String) str);
//        } same as 17

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add(" ");
        stringList.add("world!");
        //stringList.add(233); = error
        for (String str : stringList){
            System.out.print(str);
        }
        System.out.println();
        System.out.println("---");
        System.out.println("<diamond construction>");
//        System.out.println("---");
//        List<String> llist = Arrays.asList("Hello"," ","World!");
//        List<Integer> data = new ArrayList(llist); //no error but there is
//        Integer intNum = data.get(0);
//        System.out.println(data);
//        System.out.println("---");
    }
}