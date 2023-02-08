package Lesson7.Example2;

public class Printer {
    public static void main(String[] args) {

        Button button = new Button(new ButtonHandler());

        button.click();
        button.click();
        button.click();

    }
}
