package HomeWork5$Fedotov.Exceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message){
        super(message);
    }
    public WrongLoginException(){
        super();
    }
}