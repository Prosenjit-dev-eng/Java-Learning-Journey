package FunctionalProgramming;
// 102

import java.util.function.BinaryOperator;

public class Lambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> mult  = (a,b) -> a*b;
        int res = mult.apply(2, 3);
        System.out.println(res);
    }
}
