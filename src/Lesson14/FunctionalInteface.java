package Lesson14;

import java.util.Arrays;

public class FunctionalInteface {
    public static void main(String[] args) {
        Operationable operationPlus = (x, y) -> x + y;
        Operationable operationMini = (x, y) -> x - y;
        Operationable operationMult = (x, y) -> x * y;
        Printable printer = s -> System.out.println(s);

        int result = operationPlus.calculate(23, 11);
        printer.print(Integer.toString(result));
        result = operationMini.calculate(23, 11);
        printer.print(Integer.toString(result));
        result = operationMult.calculate(11, 23);
        printer.print(Integer.toString(result));
    }
}

interface Operationable {
    int calculate(int x, int y);
}

interface Printable {
    void print(String s);
}