package Lesson10.Qeuque;

import java.util.PriorityQueue;

class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(33);
        priorityQueue.add(90);
        priorityQueue.add(224);
        priorityQueue.add(123);
        priorityQueue.add(1123);

        for (int i : priorityQueue){
            System.out.print(i+" ");
        }
        System.out.println("\n"+priorityQueue);
        priorityQueue.remove();
        priorityQueue.remove(90);
        System.out.println(priorityQueue);
        priorityQueue.offer(55);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.element());
    }
}
