package chapter2;

import java.util.function.Function;

public class Video1_IntroToFunctionInterface {
    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {
        // First Integer is the type of input
        // Second Integer is the type of output
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
