package Lesson14;

public class Local {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        Operationable3 op = () -> {
            //x = 100; //forbidden, must be final
            return x+y;
        }; //block
        System.out.println(op.calculate());
        System.out.println(x);
    }
}

interface Operationable3 {
    int calculate();
}