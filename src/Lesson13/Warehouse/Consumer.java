package Lesson13.Warehouse;

public class Consumer extends Thread {
    Store store;
    int consumed = 0;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run(){
        try {
            while (consumed<5){
                consumed=consumed+store.get();
                System.out.println("Consumers already consumed  "+consumed+" goods");
                sleep(100);
            }
        } catch (InterruptedException e){
            System.out.println("Consumer thread stopped.");
        }
    }
}
