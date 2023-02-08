package Lesson8.Generics;

public class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
}

class Person1{
    private String name;
    Person1(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int hashCode(){
        return name.hashCode()-100000;
    }
}

class Program{
    public static void main(String[] args) {
        Person tom1 = new Person("Tom");
        System.out.println("Tom1 name in class "+tom1);

        Person1 tom2 = new Person1("Tom");
        System.out.println("Tom2 name IRL "+tom2);
        System.out.println("---");

        System.out.println("Tom1 has hashcode = " + tom1.hashCode());
        System.out.println("Tom2 has changed hashcode as");
        System.out.println("---");

        System.out.println("Tom1 has class path = "+tom1.getClass());
    }
}
