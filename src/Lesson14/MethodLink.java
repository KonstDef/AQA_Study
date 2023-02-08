package Lesson14;

public class MethodLink {
    public static void main(String[] args) {
        int[]nums = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(sum(nums,ExpressionHelper::isEven));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums,expr));
    }
    public static int sum( int[]number, Expression func){
        int result=0;
        for(int i:number){
            if (func.isEqual(i)) result+=i;
        }
        return result;
    }
}
class ExpressionHelper{
    static boolean isEven(int n){
        return n%2==0;
    }
    static boolean isPositive(int n){
        return n>0;
    }

    //++predicate<Integer>, switch
}