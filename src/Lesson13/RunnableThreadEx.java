package Lesson13;

public class RunnableThreadEx implements Runnable {
    RunnableThreadEx(){}

    public void run(){
        System.out.print("Runnable thread starts it job.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception){
            System.out.println("Runnable thread stopped.");
        }
        System.out.print("Runnable thread stopped.\n");
    }
}
