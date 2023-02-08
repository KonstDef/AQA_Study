package Lesson10.List;

import java.util.ArrayList;

class Program {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alexandr");
        list.add("Sergey");
        list.add("Ruslan");
        list.add("Liudmila");
        list.add("Kot");
        list.add("42");
        System.out.println("Outputting list as array: \t"+list);

        System.out.print("Outputting one by one: \t");
        for (String str:list) {
            System.out.print(str+" ");
        }

        list.add(1,"Evgeniy");
        //list.add(8,"Tatiana"); error
        list.add(list.size(),"Tatiana");
        System.out.println("\nAfter modding: "+list);

        list.remove(1);
        System.out.println("After deleting: "+list);
        //list.remove(9); error
        //list.remove(list.size()-1);
        list.remove((String)"Tatiana");
        System.out.println("After deleting last: "+list);
        System.out.printf("list is %d big.\n",list.size());

        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Traitor is : " + list.get(5));

        ArrayList<Integer> intarr = new ArrayList<>();
        intarr.add(0);
        intarr.add(2);
        intarr.remove((Integer)2);
        System.out.println(intarr);

        list.set(3,"Ivan Vasilevich");
        System.out.println("4th edited : "+list);

        ArrayList<ArrayList<Integer>> d2 = new ArrayList<>();
        d2.add(new ArrayList<Integer>());
        d2.add(new ArrayList<Integer>());
        d2.get(0).add(123);
        d2.get(0).add(32);
        d2.get(1).add(43);
        d2.get(1).add(55);
        System.out.println(d2);

        ArrayList<ArrayList<ArrayList<Integer>>> d3 = new ArrayList<>();
        d3.add(new ArrayList<ArrayList<Integer>>());
        d3.add(new ArrayList<ArrayList<Integer>>());
        d3.get(0).add(new ArrayList<Integer>());
        d3.get(0).add(new ArrayList<Integer>());
        d3.get(1).add(new ArrayList<Integer>());
        d3.get(1).add(new ArrayList<Integer>());
        d3.get(0).get(0).add(0);
        d3.get(0).get(0).add(1);
        d3.get(0).get(1).add(2);
        d3.get(0).get(1).add(3);
        d3.get(1).get(0).add(4);
        d3.get(1).get(0).add(5);
        d3.get(1).get(1).add(6);
        d3.get(1).get(1).add(7);
        System.out.println(d3);
    }
}
