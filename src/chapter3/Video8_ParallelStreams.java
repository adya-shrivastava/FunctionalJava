package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Video8_ParallelStreams {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Processing: " + word);
                    return word.toUpperCase();
                })
                .map(word -> {
                    System.out.println("Adding exclamation to: " + word);
                    return  word + "!";
                })
                .collect(Collectors.toList());

        System.out.println(processedWords);
    }
}
