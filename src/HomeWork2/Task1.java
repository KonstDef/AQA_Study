package HomeWork2;

/*  1.
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //Variables
        double distance = 10;           //distance upon start, will increase during the loop
        double distanceSum = distance;  //fist day should be already counted

        //Logic
        for (int i = 1; i < 7; i++) {
            distance *= 1.1;            //probable distance increase
            distanceSum += distance;    //distance adds to sum
        }

        //Output
        System.out.printf("In one week runner will cover up to %.2f km.", distanceSum);
    }
}
