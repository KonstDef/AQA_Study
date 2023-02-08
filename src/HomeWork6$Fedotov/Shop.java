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
package HomeWork6$Fedotov;

import HomeWork6$Fedotov.Comparators.*;
import java.util.*;

public class Shop {
    public String name;
    GoodComparatorById goodComparatorById = new GoodComparatorById(); //adds sort filter for id
    GoodComparatorByName goodComparatorByName = new GoodComparatorByName(); //adds sort filter for name
    GoodComparatorByPrice goodComparatorByPrice = new GoodComparatorByPrice(); //adds sort filter for price
    private LinkedHashMap<String,Good> goods = new LinkedHashMap<>(); // Linked hash map is selected for 1.unique elements 2.ordering

    public boolean add(Good good) {
        Map<String,Good> goodsOld = new LinkedHashMap<>(goods);
        goods.putIfAbsent(good.getId(), good);

        return !goodsOld.equals(goods);
    }

    public Collection<Good> show(String str) {
        str = str.toUpperCase();

        switch (str) {
            case "NEWEST":
                Deque<Good> goodsDeque = new ArrayDeque<>();
                for(Map.Entry<String,Good> good: goods.entrySet()) {
                    goodsDeque.addFirst(good.getValue()); //puts product from old collection to new
                }
                return goodsDeque;
            case "ID":
                Set<Good> goodsSet = new TreeSet<>(goodComparatorById);
                goodsSet.addAll(goods.values());
                return goodsSet;
            case "NAME":
                List<Good> goodsList = new LinkedList<>(goods.values());
                goodsList.sort(goodComparatorByName);
                return goodsList;
            case "PRICE":
                Queue<Good> goodsQueue = new PriorityQueue<>(goodComparatorByPrice);
                goodsQueue.addAll(goods.values());
                return goodsQueue;
            default:
                return goods.values();
        }
    }

    public boolean remove(String id) {
        Map<String,Good> goodsOld = new HashMap<>(goods);
        if(goods.isEmpty()){
            System.out.println("There are no goods in shop.");
            return false;
        }

        goods.remove(id);
        return !goodsOld.equals(goods);
    }

    public boolean edit(Good good) {
        Map<String,Good> goodsOld = new HashMap<>(goods);
        if(goods.isEmpty()){
            System.out.println("There are no goods in shop.");
            return false;
        }

        goods.replace(good.getId(),good);
        return !goodsOld.equals(goods);
    }
}