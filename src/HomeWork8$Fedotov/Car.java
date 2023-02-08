package HomeWork8$Fedotov;
/*Создать класс «Автомобиль». В классе должна храниться следующая информация:
1. название автомобиля;
2. год выпуска;
3. стоимость;
4. цвет;*/
public class Car{
    private String model;
    private int releaseYear;
    private int price;
    private String color;

    public Car(String model, int releaseYear, int price, String color) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
}
