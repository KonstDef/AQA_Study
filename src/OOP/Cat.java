package OOP;

public class Cat {

    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Implicit age!");
        }else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(age <= 0){
            System.out.println("Implicit weight!");
        }else {
            this.weight = weight;
        }
    }

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
}
