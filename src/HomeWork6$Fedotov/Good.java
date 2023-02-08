/*
Создать класс Товар, поля:
● id
● name
● price
*/
package HomeWork6$Fedotov;

public class Good{
    private String id;
    private String name;
    private double price;

    public Good(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }
}