package Lesson14;

public class Block {
    public static void main(String[] args) {
        Operationable4 op = (x, y) -> {
            if (y == 0)
                return 0;
            else return x / y;
        };
        System.out.println(op.calculate(30,0));
        System.out.println(op.calculate(30,10));
    }
}

interface Operationable4 {
    int calculate(int x, int y);
}
