package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Video3_Reduce {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        BinaryOperator<Integer> getSum = (acc, x) -> {
            Integer result = acc + x;
            System.out.printf("acc: %s and x is %s, result is %s \n", acc, x, result);
            return result;
        };

        Integer sum = listOfIntegers
                .stream()
                .reduce(0, getSum);

        System.out.printf("Sum is %s", sum);
    }
}
