package HomeWork7$Fedotov;

//6. Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
public class Strings$6 {
    public static void main(String[] args) {
        String sentenceOOP = "Object-oriented programming is a programming language model organized around " +
                "objects rather than \"actions\" and data rather than logic. Object-oriented programming " +
                "is more user-friendly oriented. Object-oriented programming rules Java. I like object-oriented programming!";

        boolean isChanged = true; //starts with true because in change ocures in false
        StringBuilder bufferOOP = new StringBuilder(sentenceOOP); //keeps original string (buffer)
        StringBuilder sentenceOOPChanged = new StringBuilder(); //will get changed string

        while(bufferOOP.toString().toLowerCase().contains("object-oriented programming")){
            int start = bufferOOP.toString().toLowerCase().indexOf("object-oriented programming"); //gets entry of oop string
            int length = "object-oriented programming".length(); //gets length of oop string

            if (isChanged){
                    String str = bufferOOP.substring(0,start+length); //copies string with oop
                    sentenceOOPChanged.append(str); //adds coppied string to final string
                    bufferOOP.delete(0,start+length); //deletes string from buffer
                    isChanged = false; //changes state for boolean
            } else {
                    String str = bufferOOP.substring(0,start); //copies string without oop
                    sentenceOOPChanged.append(str).append("OOP"); //adds coppied string to final string and ads OOP
                    bufferOOP.delete(0,start+length); //deletes string from buffer
                    isChanged = true; //changes state for boolean
            }
        }
        sentenceOOPChanged.append(bufferOOP); //appends tail from buffer to final string

        System.out.println("------6------");
        System.out.println(String.join(": ", "Original", sentenceOOP));
        System.out.println(String.join(": ", "Changed", sentenceOOPChanged));
    }
}