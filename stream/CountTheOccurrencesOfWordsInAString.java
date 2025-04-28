package stream;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccurrencesOfWordsInAString {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Input String: ");
        var str = sc.nextLine();
        if (str.isBlank()) {
            System.out.println("Empty String");
            return;
        }
        countTheOccurrencesOfWords(str);
    }

    private static void countTheOccurrencesOfWords(String str) {
        List<String> listOfWords = List.of(str.split(" "));
        Map<String, Long> collectedWords = listOfWords.stream().map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectedWords);
    }
}
