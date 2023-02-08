package HomeWork5$Fedotov.Exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message){
        super(message);
    }
    public WrongPasswordException(){
        super();
    }
}
