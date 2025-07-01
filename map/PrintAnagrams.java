package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintAnagrams {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};

//      Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        System.out.println(groupAnagrams(s));
    }

    private static List<List<String>> groupAnagrams(String[] s) {
        Map<String, List<String>> grouped = new LinkedHashMap<>();
        for (String word : s) {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(grouped.values());
    }

}
