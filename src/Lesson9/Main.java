package Lesson9;

import Lesson3.Array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Обработка проводится через try... catch, throw, throws, finally.
        //Операторы программы которые надо отследить размещаются в блоке try
//        int d = 0;
//        int a = 72/d;
//        System.out.println(a);
        // AritmeticException: / by zero
        try {
            int d = 0;
            int a = 42 / d;
            System.out.println(a);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by zero is not acceptable.");
        }

        //Три переменные
        int var1 = 0, var2 = 0, var3 = 0;
        //var2 and 3 random;
        Random random = new Random();

//        for (int i = 0; i<3;i++){
//            var2 = random.nextInt();
//            var3 = random.nextInt();
//            var1 = random.nextInt(333)/(var2/var3);
//            System.out.printf("Var1 is %d; Var2 is %d; Var3 is %d;",var1,var2,var3);
//        }
//        for (int i = 0; i < 3; i++) {
//            try {
//                var2 = random.nextInt();
//                var3 = random.nextInt();
//                System.out.printf("Var2 is %d; Var3 is %d;\n", var2, var3);
//                var1 = 333 / (var2 / var3);
//            } catch (ArithmeticException arithmeticException) {
//                System.out.println("0 division;");
//                var1 = 0;
//            }
//            System.out.printf("Var1 sum is %d;\n", var1 + var1);
//        }
//        for (int i = 0; i < 3; i++) {
//            try {
//                var2 = random.nextInt();
//                var3 = random.nextInt();
//                System.out.printf("Var2 is %d; Var3 is %d;\n", var2, var3);
//                var1 = 333 / (var2 / var3);
//            } catch (Exception exception) {
//                System.out.println(exception.toString()+";");
//                var1 = 0;
//            }
//            System.out.printf("Var1 sum is %d;\n", var1 + var1);
//        }
//        try{
//            double[] arg = new double[10];
//            int a = arg.length;
//            System.out.println("a = "+a);
//            int b = 42/a;
//            int c [] = {1};
//            c[42]=99;
//        }catch (ArithmeticException arithmeticException){
//            System.out.println("Zero division " + arithmeticException);
//        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
//            System.out.println("Out of bound exception "+arrayIndexOutOfBoundsException);
//        }catch (Exception exception) {
//            System.out.println(exception);
//        } //Must be last in the list of exceptions

        try {
            int a1 = 0;
            System.out.println("a1 = " + a1);
            try {
                if (a1 == 0)
                    a1 = a1 / (a1 - a1);
                else if (a1 == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.out.println("1st try...catch "+arrayIndexOutOfBoundsException.toString());
            }
        }catch (ArithmeticException arithmeticException){
            System.out.println("2nd try...catch "+arithmeticException.toString());
        }
    }
}
