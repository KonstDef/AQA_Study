package Lesson13.Warehouse2;

public class Store {
    int product = 0;
    final int N = 5;
    public boolean available = false;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Consumer got 1 product!");
        System.out.println("Warehouse has: " + product + " products");
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Producer produced 1 product!");
        System.out.println("Warehouse has: " + product + " products");
        notify();
    }
}
