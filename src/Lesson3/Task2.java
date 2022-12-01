package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        String br = "Opera";

        /*
        System.out.print("Browser is ");
        if (br == "GC") {
            System.out.println("Google Chrome");
        } else if (br == "FF") {
            System.out.println("Firefox");
        } else {
            System.out.println("Safari");
        }
       */
        System.out.print("Browser is ");
        switch(br){
            case "GC":
                System.out.println("Google Chrome");
                break;
            case "FF":
                System.out.println("Firefox");
                break;
            case "Safari":
                System.out.println("Safari");
                break;
            default:
                System.out.println("Unknown browser");
        }
    }
}
