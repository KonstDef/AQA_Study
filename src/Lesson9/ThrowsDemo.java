package Lesson9;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Catched : " + e);
        } finally {
            System.out.println("Finally finally");
        }
        int a = 0, b = 100;
        try {
            System.out.print("b/a = ");
            System.out.println(b / a);
        } catch (ArithmeticException arithmeticException){
            System.out.println("BUG!"+arithmeticException);
        }finally {
            System.out.println("\nb+a= "+ (b + a));
        }
        System.out.println("---");
        try {
            System.out.print("b/a = ");
            System.out.println(b / a);
            System.out.println("\nb+a= "+ (b + a));
        } finally {
            System.out.println("\nb+a= "+ (b + a));
        }
    }

    static void throwOne() throws IllegalAccessException {
        System.out.println("In body of throwOne().");
        throw new IllegalAccessException("Demo");
    }
}