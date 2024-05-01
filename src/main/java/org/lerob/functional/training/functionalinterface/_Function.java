package org.lerob.functional.training.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Function take 1 arg and produce 1 Result
        int incrementResult = incrementByOne(0);
        System.out.println(incrementResult);

        int incrementResult2 = incrementByOne2.apply(0);
        System.out.println(incrementResult2);

        int multiply = multiplyByTen.apply(incrementResult2);
        System.out.println(multiply);

        int addThenMultiply = addBy1ThenMultiplyBy10.apply(4);
        System.out.println(addThenMultiply);

        // BiFunction takes 2 args and produce 1 Result
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOne2 = number -> ++number;
    static Function<Integer, Integer> multiplyByTen = number -> Math.multiplyExact(number, 10);
    static Function<Integer, Integer>  addBy1ThenMultiplyBy10 = incrementByOne2.andThen(multiplyByTen);
    static int incrementByOne(int number) {
        return ++number;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (num1, numb2) -> ++num1 * numb2;
    static int incrementByOneAndMultiply(int numb1, int numb2) {
        return (++numb1 * numb2);
    }

}
