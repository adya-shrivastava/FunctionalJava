package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Video4_Collectors {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> wordsList = words
                .stream()
                .filter((x) -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(wordsList);

        String joinedWords = words
                .stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.joining("--"));

        System.out.println(joinedWords);

        Long countingWords = words
                .stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.counting());

        System.out.println(countingWords);

        Map<Integer, List<String>> mappingWords = words
                .stream()
                .collect(Collectors.groupingBy(
//                        String::length
                        word -> word.length()
                ));

        System.out.println(mappingWords);


        Map<Boolean, List<String>> partitionedWords = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 5
                ));

        System.out.println(partitionedWords);

    }
}
