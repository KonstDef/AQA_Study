package Lesson10.Qeuque;

import java.util.ArrayDeque;

class ExampleOfAQueueOfObjects {
    public static void main(String[] args) {
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.add(new Person("Vasya"));
        people.add(new Person("Petya"));
        System.out.println(people);
        for (Person p:people) {
            System.out.println(p);
        }
        for (Person p:people) {
            System.out.println(p.getName());
        }
    }
}
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
