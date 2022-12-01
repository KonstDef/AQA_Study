package Lesson3;

public class Array {
    static public void main(String[] args) {
        int[] arrayEmp; // Creating empty array
        int[] arrayRes = new int[10]; // Reserving array for 10 el;
        int[] arrayFilled = {0,1,2}; // Creating array with 3 el;
        int[] arrayFil = new int[]{1,2,3};

        int el1 = arrayFilled[1]; // takes second element from array
        System.out.println(el1);
    }
}
