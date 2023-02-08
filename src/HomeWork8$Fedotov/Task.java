package HomeWork8$Fedotov;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/*Нужно создать набор автомобилей и выполнить следующие задачи:
1.отобразить все автомобили;
2.отобразить автомобили указанного цвета;
3.отобразить автомобили дороже указанной цены;
4.отобразить автомобили, чей год выпуска находится в заданном диапазоне;
5.сортировать автомобили в порядке убывания стоимости.
Задачи решить с использованием прикладного интерфейса Stream API.*/
public class Task {
    public static void main(String[] args) {
        //Создание набора автомобилей:
        Set<Car> cars = new LinkedHashSet<>();
        Collections.addAll(cars,
                new Car("Mazda MPV",2002,6000,"ivory"),
                new Car("Audi A8L",2005,12000,"black"),
                new Car("Zeekr 009",2023,60000,"blue"),
                new Car("Tesla Cybertruck",2020,40000,"chrome"),
                new Car("Chevrolet Impala",1967,2000,"black"),
                new Car("Ford Mustang Eleanor",2009,216000,"chrome"),
                new Car("Peugeot 406",1998,3300,"white"),
                new Car("BMW M3 GTR",2001,250000,"blue"),
                new Car("VAZ 2103",1971,1000,"red")
        );
        Consumer<Car> carPrinter = c -> System.out.printf("%s\t%sy.\t%s$\t%s\n",
                c.getModel(),c.getReleaseYear(),c.getPrice(),c.getColor());

        //1.отобразить все автомобили;
        System.out.println("***1|All cars***");
        cars.forEach(carPrinter);

        //2.отобразить автомобили указанного цвета;
        System.out.println("\n\n***2|Cars of \"chrome\" color***");
        cars.stream()
                .filter(c->c.getColor().equals("chrome"))
                .forEach(carPrinter);

        //3.отобразить автомобили дороже указанной цены;
        //  2nd path: by .filter(c->c.getPrice()>10000) or .takeWhile(c->c.getPrice()>10000) with reversed ordering
        System.out.println("\n\n***3|Cars with cost more than 10,000$***");
        cars.stream()
                .sorted((c1,c2)->Integer.compare(c1.getPrice(), c2.getPrice()))
                .dropWhile(c->c.getPrice()<10000)
                .forEach(carPrinter);

        //4.отобразить автомобили, чей год выпуска находится в заданном диапазоне;
        //  2nd path: by .filter(c->(c.getReleaseYear()>=2000&&c.getReleaseYear()<2010))
        System.out.println("\n\n***4|Cars of 2000-2010 period***");
        cars.stream()
                .sorted((c1,c2)->Integer.compare(c1.getReleaseYear(), c2.getReleaseYear()))
                .dropWhile(c->c.getReleaseYear()<2000)
                .takeWhile(c->c.getReleaseYear()<2010)
                .forEach(carPrinter);

        //5.сортировать автомобили в порядке убывания стоимости.
        //  2nd path: via Comparable and Comparator;
        System.out.println("\n\n***5|Cars sorted of price decrease***");
        cars.stream()
                .sorted((c1,c2)->-Integer.compare(c1.getPrice(), c2.getPrice()))    //minus before Integer required to sort in decreasing order
                .forEach(carPrinter);
    }
}