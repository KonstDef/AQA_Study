package HomeWork1;
public class Task1 {
    static public void main(String args[]) {

        /*1. Объявить переменные с помощью которых можно будет посчитать общую сумму покупки нескольких товаров.
        Например плитки шоколада, кофе и пакеты молока.*/

        //Variables
        double chocolate = 3.25;
        double coffee = 10.22;
        double milk = 1.45;

        int chocolateQty = 2;
        int coffeeQty = 1;
        int milkQty = 5;

        //Logic
        double price = chocolate * chocolateQty + coffee * coffeeQty + milk * milkQty;

        //Output
        System.out.println("\nYou paid: " + price + "$");
        //Todo: Add evaluation of extra payments and not bought products
    }
}
