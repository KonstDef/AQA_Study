package HomeWork2;

/*  3.
Вычислить: 1+2+4+8+…+256
 */

import static java.lang.Math.pow;

public class Task3 {
    public static void main(String[] args) {
        //Variables
        int num = 0;            //sum variable

        //Logic
        for (int i = 0; pow(2, i) <= 256; i++) {
            num += pow(2, i);   //all numbers are pow of 2
        }

        //Output
        System.out.println(num);
    }
}
