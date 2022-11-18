package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static public void main(String args[]) {

        /*1. Объявить переменные с помощью которых можно будет посчитать общую сумму покупки нескольких товаров.
        Например плитки шоколада, кофе и пакеты молока.*/

        //Creating main shopCart class
        class shopCart {

            //Creating shopping cart as list of its product
            //Данный конкретный момент с List помню из C++, где попытка использовать Array заканчивалась "Это фиаско, братан!"
            List<product> cart = new ArrayList<product>(); // Вот тут было самое интересное, просто добавив List<product> cart
            //Я постоянно ловил Null pointer, благо сообразил зайти в debug, увидел что

            //Creating class of shopping cart product
            class product {

                String name;            // Product name *де-факто заглушка ;)*
                int qtyRequired;        // Planned quantity
                int qtyBought;          // Bought quantity
                double priceBought;      // Price of !single! bought product, required for retrospective
                boolean status;         // Status of product, T - bought, F (Default) - not

                //Constructor
                public product(String n, int r) {
                    name = n;   //заглушка
                    qtyRequired = r;
                }

                //Buying method
                public void buy(int b, double p) {
                    qtyBought += b;
                    priceBought = p;
                    if (qtyBought == qtyRequired) status = true;
                }

                //Дальше я расстроился т.к. у Джавы нету перегрузки операторов как таковой *sad*
                //Method to get overall price of product for next calculations
                public double price() {
                    return priceBought * qtyBought;
                }
            }

            //Adding product to cart
            public void add(String name, int qty, boolean m) {  //name is for product name, qty for its required quantity, m - message
                product prod = new product(name, qty);
                cart.add(prod); //заглушка всё тянется и тянется по причине ещё пока недостатка моих знаний :)
                if (m) System.out.println("Need to buy:\t" + name + "\t" + qty + "p.");
            }

            //Buying something
            public void buy(String n, int qty, double p) {

                //Тут мне IDEA помогла и сама выдала нужный мне фор когда я начал вбивать iter, по итогу itli :)
                for (int i = 0; i < cart.size(); i++) {
                    product product = cart.get(i);
                    if (product.name == n) {  //По сути я так и не разобрался как безопасно переименовывать имя класса *заглушка*
                        product.buy(qty, p);
                        System.out.println("Bought:\t" + n + "\t" + qty + "/" + product.qtyRequired + "p.\tfor " + product.priceBought + "$ per p.");
                        break;
                    } else if (i == cart.size() - 1) { //обработка кейса нового продукта
                        add(n, qty, false);
                        (cart.get(i + 1)).buy(qty, p);
                        System.out.println("+ Bought:\t" + n + "\t" + qty + "p.\tfor " + cart.get(i + 1).priceBought + "$ per p.");
                        break;
                    }
                }
            }

            //Getting sum of products inside shopping cart
            public double sum() {
                double placeholder = 0;

                for (int i = 0; i < cart.size(); i++) { //Itterating through cart
                    product product = cart.get(i);
                    placeholder += product.price();
                }

                return placeholder; //returns sum of cart
            }
        }

        //Test part
        shopCart cart = new shopCart(); //creating cart

        System.out.println("Creating list:");
        cart.add("Chocolate", 5, true);  //adding prod1
        cart.add("Coffee", 2, true);    //adding prod2
        cart.add("Milk", 8, true);     //adding prod3

        System.out.println("\nGoing shoping:");
        cart.buy("Chocolate", 4, 3.98);  //buying prod1
        cart.buy("Lays", 6, 3.64);     //buying new prod
        cart.buy("Coffee", 22, 2.18);    //buying prod2
        cart.buy("Milk", 8, 3.64);     //buying prod3

        System.out.println("\nYou paid: " + cart.sum() + "$");
        //Todo: Add evaluation of extra payments and not bought products
    }
}
