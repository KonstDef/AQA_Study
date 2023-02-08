package Lesson10.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListProgram {
    public static void main(String[] args) {
        String[] str = new String[]{"Зимбабве","Гондурас"};
        List<String> states = new ArrayList<>();
        states.add("Германия u");
        states.add("Македония");
        states.add("Алжир");
        states.addAll(Arrays.asList(str));
        System.out.println(states);
        if (states.toString().contains("Германия")){
            System.out.println("Список содержит Германию!");
        }
    }
}
