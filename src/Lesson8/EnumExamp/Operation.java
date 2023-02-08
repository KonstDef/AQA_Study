package Lesson8.EnumExamp;

public class Operation {
    public static void main(String[] args) {
        int x,y;
        x = 5;
        y =10;
        System.out.printf("%d + %d = %d\n",x,y,Operations.SUM.action(x,y));
        System.out.printf("%d - %d = %d\n",x,y,Operations.SUBSTRACT.action(x,y));
        System.out.printf("%d * %d = %d\n",x,y,Operations.MULTIPY.action(x,y));
    }
}

enum Operations{
    SUM{
        public int action(int x, int y){return x+y;}
    },
    SUBSTRACT{
        public int action(int x, int y){return x-y;}
    },
    MULTIPY{
        public int action(int x, int y){return x*y;}
    };

    public abstract int action(int x, int y);
}
