package OOP;

public class Person {
    private final int id;
    static int counter=0;
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
        id = counter++;
    }
    public void displayedInfo(){
        System.out.printf("Name: %s\tAge: %d\tID:%d\n", name, age, id);
    }

    public static void displayCounter(){
        System.out.println("There are "+counter+" citizens");
    }
}
