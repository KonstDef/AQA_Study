package Lesson11.comparebleAndComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonProgram {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Vasya Giorgievich"));
        personSet.add(new Person("Ivan Vasilyevich"));
        personSet.add(new Person("Abraham Lavrentiych"));
        personSet.add(new Person("Vasya Bergamotych"));
        for (Person person: personSet){
             System.out.println(person.getName());
        }

        System.out.println("--------");
        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> personTreeSet = new TreeSet<>(personComparator);
        personTreeSet.add(new Person("Buklya"));
        personTreeSet.add(new Person("Mafynka"));
        personTreeSet.add(new Person("Mumu:("));
        personTreeSet.add(new Person("Kuzya"));
        for (Person person: personTreeSet){
            System.out.println(person.getName());
        }
    }
}
class Person implements Comparable<Person>{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Person(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}