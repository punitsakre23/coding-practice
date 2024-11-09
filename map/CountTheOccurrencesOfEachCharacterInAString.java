package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        countTheOccurrences(str);
    }

    private static void countTheOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (Character c : str.toCharArray()) {
            charCountMap.merge(c, 1, Integer::sum);
        }
        System.out.println(charCountMap);
    }
}
