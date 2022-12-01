package OOP;

public class Employer extends Person2{
    private String lastName;

    public Employer(String name, int age, String lastName) {
        super(name);
        age(age);
        this.lastName=lastName;
    }

    public int age(int age){
        return age;
    }

    @Override
    public final void displayed(){
        System.out.println(lastName);
    }
}
