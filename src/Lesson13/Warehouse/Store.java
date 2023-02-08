package Lesson13.Warehouse;

public class Store {
    int counter =0;
    final int N  =5;

    synchronized int put(){
        if(counter<=N){
            counter++;
            System.out.println("Warehouse has "+counter+" goods.");
            return 1;
        }
        return 0;
    }
    synchronized int get(){
        if(counter>0){
            counter--;
            System.out.println("Warehouse contains "+counter+" goods.");
            return 1;
        }
        return 0;
    }
}
