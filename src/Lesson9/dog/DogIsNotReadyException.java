package Lesson9.dog;

public class DogIsNotReadyException extends Exception{
    public DogIsNotReadyException(String message){
        super(message);
    }
    public DogIsNotReadyException(){
        super();
    }
}