package Lesson4;

public class Overload {
    public static void main(String[] args) {
        int s1 = sum(12, 24);
        int s11 = sum(12,23,411);
        double s2 = sum(1.11,12.23);
        double s22 = sum(12.2, 12.43, 13.23);

        String s3 = sum("Kostia",23,2,99);

        System.out.println(s3);
    }

    static String sum(String name, int day, int m, int year) {
        return name + String.valueOf(" "+ day + ":" + m + ":" + year);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static double sum(double x, double y, double z) {
        return x + y + z;
    }
    static int summa(int ...num){
        int result = 0;
        for(int i : num){
            result+=num[i];
        }
        return result;
    }
}
