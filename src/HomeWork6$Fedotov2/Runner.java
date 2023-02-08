/*
Создать класс Runner в котором:
●(1) создаем объект магазина
●(2) создаем пару тройку товаров и добавляем эти товары в магазин
●(3) получаем товаров из магазина, сортируем по цене(по возрастанию) и выводим в консоль.
●(4) удаляем один товар
●(5) получаем список товаров из магазина, сортируем по порядку добавления(последние добавленные в начале) и выводим в консоль.
●(6) редактируем один товар
●(7) получаем список товаров и выводим в консоль
 */

package HomeWork6$Fedotov2;

import java.util.Collection;

public class Runner {
    public static void main(String[] args) {
        //(1)
        Shop shop = new Shop();
        Good good;
        //(2)
        good = new Good("CH01","BananaChoc",10.1);
        shop.add(good);
        good = new Good("FR12","Waterfree Melon",9.12);
        shop.add(good);
        good = new Good("HE02","Licorice&Cinnamon",14.99);
        shop.add(good);
        good = new Good("FR06","Lemon cheese",7.67);
        shop.add(good);
        //(3)
        print(shop.show("price"));
        //(4)
        shop.remove("FR12");
        //(5)
        print(shop.show("newest"));
        //(6)
        good = new Good("HE02","LicoriceNoCinnamon",13.10);
        shop.edit(good);
        //(7)
        print(shop.show("id"));
    }

    public static boolean print(Collection<Good> goods){
        System.out.println("---");
        System.out.printf("%5s%20s%10s\n","ID","Name","Price");
        if(goods.isEmpty()){
            System.out.println("There are no goods in shop.");
            return false;
        }
        for(Good good : goods){
            System.out.printf("%5s%20s%10.2fBYN\n",good.getId(),good.getName(),good.getPrice());
        }
        return true;
    }
}
