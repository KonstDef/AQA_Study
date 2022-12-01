package OOP;

public class Program {
    public static void main(String[] args) {
        Person abraka = new Person("Abrakadabr", 33);
        abraka.displayedInfo();


        Person kukuha = new Person("Kuku", 12);
        kukuha.displayedInfo();


        Person zuza = new Person("Zuza", 45);
        zuza.displayedInfo();

        Person.displayCounter();

/*        Cat cat = new Cat("Musia", -1000, 3.23);
        cat.sayMeow();*/
/*        Cat cat = new Cat();
        cat.setName("Musia");
        cat.setAge(10);
        cat.setWeight(2.22);

        System.out.printf("%s age %d weight %.2f",cat.getName(),cat.getAge(),cat.getWeight());*/
    }

}