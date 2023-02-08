package Lesson15.Sorted;

public class Phone {
    private String name;
    private String company;
    private int price;

    public Phone(String name, int price, String company) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }
}
