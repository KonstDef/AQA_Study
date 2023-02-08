/*
Создать класс Магазин, поля:
● Список товаров (изначально пустой)
Методы:
● добавить товар(принимает объект товара и добавляет его в список товаров).
При попытке добавить товар с id уже существующем в списке, вставка производится не должна
● получить все товары(метод возвращает список всех товаров в
магазине)
● удалить товар (метод принимает id товара и удаляет из списка товар с соответствующим id)
● редактировать товар(принимает объект товара и редактирует им список
товаров)
*/
package HomeWork6$Fedotov2;

import HomeWork6$Fedotov.Comparators.*;
import java.util.*;

public class Shop {
    public String name;
    GoodComparatorById goodComparatorById = new GoodComparatorById(); //adds sort filter for id
    GoodComparatorByName goodComparatorByName = new GoodComparatorByName(); //adds sort filter for name
    GoodComparatorByPrice goodComparatorByPrice = new GoodComparatorByPrice(); //adds sort filter for price
    private Collection<Good> goods = new LinkedHashSet<>(); //linked hash set is selected for 1.unique elements 2.ordering

    public boolean add(Good good) {
        if(goods.isEmpty()) goods.add(good);
        else {
            for (Good goodIt : goods) {
                if (goodIt.getId().equals(good.getId())) return false;
            }
        }
        goods.add(good);
        return true;
    }

    public Collection<Good> show(String str) {
        str = str.toUpperCase();
//        Collection<Good> goodsList;

        switch (str) {
            case "NEWEST":
                Deque<Good> goodsDeque = new ArrayDeque<>();
                for(Good good : goods) {
                    goodsDeque.addFirst(good); //puts product from old collection to new
                }
//                return goodsDeque;
//            case "ID":
//                SortedMap<String,Good> goodsMap = new TreeMap<>();
//                for(Good good:goods){
//                    goodsMap.put(good.getId(),good);
//                }
//
//                return goodsMap.entrySet();
//            case "NAME":
//                goodsList.addAll(goods);
//                goodsList.sort(goodComparatorByName);
//                return goodsList;
//            case "PRICE":
//                goodsList.addAll(goods);
//                goodsList.sort(goodComparatorByPrice);
//                return goodsList;
//            default:
//                goodsList.addAll(goods);
//                return goodsList;
        }
        return null;
    }

    public boolean remove(String id) {
        if(goods.isEmpty()){
            System.out.println("There are no goods in shop.");
            return false;
        }

        for (Good good : goods) {
            if (id.equals(good.getId())) return goods.remove(good);
        }
        return false;
    }

    public boolean edit(Good good) {
        Iterator<Good> iterator = goods.iterator();

        if(goods.isEmpty()){
            System.out.println("There are no goods in shop.");
            return false;
        }

        do {
            Good goodIt = iterator.next();
            if (goodIt.getId().equals(good.getId())) {
                goodIt.set(good);
                return true;
            }
        } while (iterator.hasNext());
        return false;
    }
}
