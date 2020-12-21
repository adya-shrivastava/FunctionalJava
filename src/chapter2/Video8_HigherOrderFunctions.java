package chapter2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Video8_HigherOrderFunctions {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> zeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: Second Argument is zero");
                        return 0f;
                    }

                    return divide.apply(x, y);
                };


        BiFunction<Float, Float, Float> divideSafe = zeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10f, 2f));
    }
}
