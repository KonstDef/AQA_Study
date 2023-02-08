package Lesson13.Warehouse;

public class Producer extends Thread{
    Store store;
    int produced = 5;

    public Producer(Store store) {
        this.store = store;
    }

    public void run(){
        try {
            while (produced>0){
                produced=produced-store.put();
                System.out.println("Producer requires to produce "+produced+" goods");
                sleep(100);
            }
        } catch (InterruptedException e){
            System.out.println("Producer thread stopped.");
        }
    }
}
