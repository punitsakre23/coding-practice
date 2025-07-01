package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintAnagrams {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};

//      Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        System.out.println(groupAnagrams(s));

        Map<String, List<String>> grouped = groupAnagram(s);
//        grouped.values().stream().filter(group -> group.size() > 1).toList();

        // Optional: print the grouped anagram values only
        System.out.println(new ArrayList<>(grouped.values()));
    }

    private static List<List<String>> groupAnagrams(String[] s) {

//        List<String> sorted = Arrays.stream(s).map(str -> new String(str.chars().mapToObj(c -> (char) c).sorted().toString())).toList();
//        System.out.println(sorted);
//        Arrays.stream(s).map(str -> str.chars().sorted().mapToObj(c -> (char) c).toString()).forEach(System.out::println);

        List<String> list = new ArrayList<>(List.of(s));
        System.out.println(list);
        List<String> sortedStrings = new ArrayList<>();
        for (String str : s) {
            char [] c = str.toCharArray();
            Arrays.sort(c);
            sortedStrings.add(new String(c));
        }
        System.out.println(sortedStrings);
        List<List<String>> anagrams = new ArrayList<>();
        List<String> anagram = new ArrayList<>();
        for (int i = 0; i < sortedStrings.size(); i++) {
            anagram.add(list.get(i));
            for (int j = i+1; j < sortedStrings.size(); j++) {
                if (sortedStrings.get(i).equals(sortedStrings.get(j))) {
                    anagram.add(list.get(j));
                }
            }
            anagrams.add(new ArrayList<>(anagram));
            sortedStrings.removeAll(Collections.singletonList(sortedStrings.get(i)));
            list.removeAll(anagram);
            i--;
            anagram.clear();
        }
        return anagrams;
    }

    public static Map<String, List<String>> groupAnagram(String[] words) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(PrintAnagrams::sortChars));
    }

    // Helper method to sort characters of a string
    private static String sortChars(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}
