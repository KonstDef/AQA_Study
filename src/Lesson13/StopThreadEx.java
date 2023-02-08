package Lesson13;

public class StopThreadEx implements Runnable {
    private boolean isActive;

    void disable() {
        isActive = false;
    }

    StopThreadEx() {
        isActive = true;
    }

    public void run() {
        System.out.print("Runnable stop thread starts it job.\n");
        int counter = 1;
        while (isActive) {
            System.out.println("Cycle " + counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println("Runnable stop thread stopped by force.");
            }
        }
        System.out.print("Runnable stop thread stopped.");
    }
}
