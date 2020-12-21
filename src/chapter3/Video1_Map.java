package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Video1_Map {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        Function<Integer, Integer> timesTwo = (x) -> x * 2;

        List<Integer> doubled = listOfIntegers
                .stream()
                .map(timesTwo)
//                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(doubled);
    }
}
