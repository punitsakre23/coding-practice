package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Count the occurrences of each character
 */
public class CountTheOccurrencesOfEachCharacterInAString {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Input String: ");
        var str = sc.nextLine();
        if (str.isBlank()) {
            System.out.println("Empty String");
            return;
        }
        var res = countTheOccurrences(str);
        System.out.println(res);
        res = countTheOccurrencesInSequence(str);
        System.out.println(res);
    }

    private static Map<Character, Long> countTheOccurrences(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<Character, Long> countTheOccurrencesInSequence(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }
}
