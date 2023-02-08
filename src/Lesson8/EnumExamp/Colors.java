package Lesson8.EnumExamp;

public class Colors {
    public static void main(String[] args) {
        for (Color i : Color.values()){
            System.out.printf("Code for color %s is %s\n",i.name(),i.getCode());
        }
    }
}

enum Color{
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code;

    Color(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
