package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {

        /*3. Объявить переменные, для подсчета общего количества предметов для сервировки стола.
         Например чашки, такое же количество блюдец и ложек.*/

        //Variables
        int spoons, knives, forks, plates; //То же что и со второй таской)

        Scanner scanner = new Scanner(System.in);
        String placeholder;

        //Logic
        //Input cycle
        for (; ; ) {
            System.out.print("Enter integer for guests: ");
            placeholder = scanner.nextLine();
            try { // проверка что ввод является интом
                spoons = knives = forks = plates = Integer.parseInt(placeholder); //Google
                if (spoons > 0) {
                    break;
                } else {
                    System.out.println("Positive value required!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Enter integer!");
            }
        }

        //Output
        if (spoons == knives && knives == forks && forks == plates) { //Проверка на случай кражи ложки вирусом!
            System.out.println("You need " + spoons + " knives, forks, spoons and plates.");
        } else {
            System.out.println("Something got wrong!");
        }
    }
}
