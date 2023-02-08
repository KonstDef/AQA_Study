package Lesson9;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            demothrow();
        }catch (NullPointerException nullPointerException){
            System.out.println("Catched "+ nullPointerException);
        }
    }
    static void demothrow(){
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e){
            System.out.println("Exception caught in demothrow()");
            throw e;
        }
    }
}

