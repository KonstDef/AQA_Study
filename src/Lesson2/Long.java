package Lesson2;

//Вычислить расстояние, проходимое светом, используя переменные типа long
/*
lightSpeed = 186000;
days = 1000;
seconds = days*24*60*60
distance = seconds * lightSpeed;

In days light travels distance miles;
 */

public class Long {

    public static void main(String args[]){
        int lightSpeed = 186000;

        //Расширяющее
        //double dbLightSpeed = lightSpeed;
        //System.out.println(dbLightSpeed);

        //Сужающее
        //byte btLightSpeed = (byte) lightSpeed;
        //System.out.println(btLightSpeed);

        int days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = seconds * lightSpeed;

        System.out.print("In " + days + " days ");
        System.out.print("light travels around ");
        System.out.println(distance + " miles.");
    }

}
