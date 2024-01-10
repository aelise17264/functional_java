package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set
;import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;;

public class Collect {
    public static void main(String[] args) {
        String[] wordsArr = {"hello", "functional", "programming", "is", "cool", "apples"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        //  Map<Integer, List<String>> wordMap = words
        //     .stream()
        //     .collect(Collectors.groupingBy(
        //         (word) -> word.length()
        //     ));

        // System.out.println(wordMap);

        Map<Boolean, List<String>> wordMap = words
        .stream()
        .collect(Collectors.partitioningBy(
            (word) -> word.length() > 5
        ));

        System.out.println(wordMap);
    }
    
}
