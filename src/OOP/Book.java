package OOP;

public class Book {
    private static int id=0;
    private static int counter;

    private String name;
    private String author;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if(year<=0){
            System.out.println("Implicit year!");
        }
    }

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
        counter = id++;
    }

    public void displayID(){
        System.out.printf("Book %s by %s of year %d. Has %d id.",getName(),getAuthor(),getYear(),id);
    }

    public static void numOfBooks(){
        System.out.printf("There are %d books in shelf.",counter);
    }
}
