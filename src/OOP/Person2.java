package OOP;

public class Person2 {
    private String name;

    public String getName() {
        return name;
    }

    public Person2(String name){
        this.name=name;
    }

    public void displayed(){
        System.out.println("Name: "+name);
    }
}
