package Lesson13;

public class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.printf("%s starts it job.\n",Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception){
            System.out.println(exception.getMessage()+" thread stopped.");
        }
        System.out.printf("%s stopped.\n",Thread.currentThread().getName());
    }
}
