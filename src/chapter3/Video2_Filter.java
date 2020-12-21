package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Video2_Filter {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        Predicate<Integer> isEven = (x) -> x % 2 == 0;

        List<Integer> evenList = listOfIntegers
                .stream()
//                .filter(isEven)
                .filter((x) -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);

        String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> wordsList = words
                .stream()
                .filter((x) -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(wordsList);

        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = createLengthTest.apply(3);

        List<String> newWordsList = words
                .stream()
                .filter(isLongerThan3)
                .collect(Collectors.toList());

        System.out.println(newWordsList);
    }
}
