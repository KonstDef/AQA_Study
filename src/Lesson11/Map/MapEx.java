package Lesson11.Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>();
        states.put(5, "Burgundi");
        states.put(3, "Majordi");
        states.put(2, "Burbudi");
        states.put(1, "Taidi");
        states.put(4, "Marocandi");

        for (Map.Entry<Integer, String> state : states.entrySet()) {
            System.out.println("State " + state.getValue() + " has code " + state.getKey() + ".");
        }
        states.put(1, "Ugandi");
        System.out.println(states);
    }
}
