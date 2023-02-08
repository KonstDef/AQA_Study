package Lesson7;
public class Journal implements Printable {

    private String name;

    Journal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println(name);
    }

    public void startReading(){
        System.out.println("You started reading "+name);
    }
}
