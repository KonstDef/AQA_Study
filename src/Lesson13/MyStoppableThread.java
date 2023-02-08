package Lesson13;

public class MyStoppableThread {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        StopThreadEx stopThreadEx = new StopThreadEx();
        new Thread(stopThreadEx,"MyThread").start();

        try {
            Thread.sleep(5000);Thread.sleep(5000);
            stopThreadEx.disable();
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Thread stopped");
        }
        System.out.println("Main thread stopped.");
    }
}
