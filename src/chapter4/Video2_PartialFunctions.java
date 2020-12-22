package chapter4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Video2_PartialFunctions {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
                x -> (y, z) -> add.apply(x, y, z);

        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);

        System.out.println(add5.apply(6, 7));

        // first two arguments are given
        BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial2 =
                (x, y) -> (z) -> add.apply(x, y, z);

        Function<Integer, Integer> add5and6 = addPartial2.apply(5, 6);

        System.out.println(add5and6.apply(7));

        Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial3 =
                x -> y -> z -> add.apply(x, y, z);

        Function<Integer, Function<Integer, Integer>> add5new = addPartial3.apply(5);
        Function<Integer, Integer> add5And6 = add5new.apply(6);
        System.out.println(add5And6.apply(7));
    }
}
