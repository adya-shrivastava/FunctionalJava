package chapter2;

import java.util.function.Function;

public class Video2_IntroToLambdaFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;

        /** Verbose way */
//        Function<Integer, Integer> absoluteValue = (x) -> {
//            if (x < 0) {
//                return -x;
//            } else {
//                return x;
//            }
//        };

        System.out.println(absoluteValue.apply(-499));
    }
}
