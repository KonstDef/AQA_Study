package Lesson10.Qeuque;

import java.util.ArrayDeque;
import java.util.Deque;

class DequeEx {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();

        states.add("Germany");
        System.out.println(states);
        states.addFirst("France");
        System.out.println(states);
        states.push("Great Britain");
        System.out.println(states);
        states.addLast("Spain");
        System.out.println(states);
        states.add("Italy");
        System.out.println(states);
        System.out.println("Fist country is: "+states.getFirst());
        System.out.println("Last country is: "+states.getLast());
        System.out.println("There are "+states.size()+" countries.");
        System.out.println("Poped: "+states.pop());
        System.out.println("After pop: "+states);
        System.out.println("First polled: "+states.pollFirst());
        System.out.println("After polling: "+states);
        System.out.println("Last polled: "+states.pollLast());
        System.out.println("After polling: "+states);
        System.out.println("Just polling: "+states.poll());
        System.out.println("After polling: "+states);
    }
}
