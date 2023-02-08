package Lesson13;

public class ThreadEx {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Thread t = Thread.currentThread();
        System.out.println(t);

        new MyThread("MyThread").start();

        for (int i=1; i<6; i++){
            new MyThread("MyThread"+i).start();
        }

        System.out.println("-------------");

        MyThread myThread = new MyThread("Threader!");
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.printf("Thread %s was interupted.\n",myThread.currentThread().getName());
        }
        System.out.println("Main stopped.");

        new RunnableThreadEx().run();
    }
}
