package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Task$1 {
    static public void main(String args[]) {

        /*1. Объявить переменные с помощью которых можно будет посчитать общую сумму покупки нескольких товаров.
        Например плитки шоколада, кофе и пакеты молока.*/

        //Logic
        //Creating main ShopCart class
        class ShopCart {

            List<Product> cart = new ArrayList<>();
            //Creating class of shopping cart product
            class Product {

                String name;            // Product name
                int qtyRequired;        // Planned quantity
                int qtyBought;          // Bought quantity
                double priceBought;      // Price of !single! bought product, required for retrospective
                boolean status;         // Status of product, T - bought, F (Default) - not

                //Constructor
                public Product(String n, int r) {
                    name = n;   //заглушка
                    qtyRequired = r;
                }

                //Buying method
                public void buy(int b, double p) {
                    qtyBought += b;
                    priceBought = p;
                    if (qtyBought == qtyRequired) status = true;
                }

                //Method to get overall price of product for next calculations
                public double price() {
                    return priceBought * qtyBought;
                }
            }

            //Adding product to cart
            public void add(String name, int qty, boolean m) {  //name is for product name, qty for its required quantity, m - message
                Product prod = new Product(name, qty);
                cart.add(prod);
                if (m) System.out.println("Need to buy:\t" + name + "\t" + qty + "p.");
            }

            //Buying something
            public void buy(String n, int qty, double p) {

                for (int i = 0; i < cart.size(); i++) {
                    Product product = cart.get(i);
                    if (product.name == n) {
                        product.buy(qty, p);
                        System.out.println("Bought:\t" + n + "\t" + qty + "/" + product.qtyRequired + "p.\tfor " + product.priceBought + "$ per p.");
                        break;
                    } else if (i == cart.size() - 1) { //check "new product" case
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

                //Itterating through cart
                for (Product product : cart) {
                    placeholder += product.price();
                }

                return placeholder; //returns sum of cart
            }
        }

        //Test
        ShopCart cart = new ShopCart(); //creating cart

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
