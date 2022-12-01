package HomeWork2;

/*  2.
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Task2 {
    public static void main(String[] args) {
        //Variables
        int amoebas = 1;     //variable for amoebas count

        //Logic+output
        System.out.printf("Counting starts with %d amoebas.\n", amoebas);

        for (int i = 3; i <= 24; i += 3) { //3 is selected as fist division occurs only at 3
            amoebas *= 2;
            System.out.printf("%d hours:\tThere are %d amoebas.\n", i, amoebas);
        }
    }
}
