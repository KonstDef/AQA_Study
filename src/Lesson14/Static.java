package Lesson14;

public class Static {
    static int x = 10;
    static int y = 20;
    public static void main(String[] args){
        Operationable2 op = () -> {
          x = 30;
          return x+y;
        };
        System.out.println(op.calculate());
        System.out.println(x);
    }
}

interface Operationable2 {
    int calculate();
}
