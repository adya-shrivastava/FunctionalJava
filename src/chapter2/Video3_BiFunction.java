package chapter2;

import java.util.function.BiFunction;

public class Video3_BiFunction {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5, 3));

        TriFunction<Integer, Integer, Integer, Integer> add3 = (x, y, z) -> x + y + z;
        System.out.println(add3.apply(3, 4,6));

        NoArgFunction<String> sayHello = () -> "Hello";
        System.out.println(sayHello.apply());
    }
}
