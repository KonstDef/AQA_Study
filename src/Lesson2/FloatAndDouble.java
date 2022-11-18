package Lesson2;
/*Вычислить площадь круга*/
public class FloatAndDouble {
    public static void main(String args[]){
        double pi = 3.1416;

        //Усечение
        /*int intPi = (int) pi;
        System.out.println(intPi);*/

        //Округление
        /*int intPi = (int) Math.round(pi);
        System.out.println(intPi);
        int intPiB = (int) Math.round(pi+0.5);
        System.out.println(intPiB);*/

        double r = 10.8;
        double $s; //Square
        
        $s = pi * r * r;

        //Константа
        //final double S_PLOSAD = $s;

        //Унар: 1++, !1
        //Бинар: 1+1
        //Тернар:
        /* if(a>18){
        // sout("Проходите!")
        // }else{
        // sout("Не входите!")
           }*/

        System.out.println("\tПлощадь круга: \n\t\"" + $s +"\"");
    }
}