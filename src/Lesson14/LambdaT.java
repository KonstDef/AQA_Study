package Lesson14;

public class LambdaT {
    public static void main(String[] args) {
        OperationableT<Integer> operation1 = (x, y) -> x + y;
        OperationableT<String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.calculate(10, 30));
        System.out.println(operation2.calculate("10", "30"));
    }
}

interface OperationableT<T> {
    T calculate(T x, T y);
}