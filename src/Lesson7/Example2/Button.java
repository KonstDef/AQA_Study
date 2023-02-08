package Lesson7.Example2;

public class Button {
    EventHandler handler;

    Button(ButtonHandler handler){
        this.handler = new ButtonHandler();
    }

    public void click(){
        handler.EventAction();
    }

}
