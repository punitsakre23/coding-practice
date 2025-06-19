package stream;

import utilities.GenerateARandomString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {

        var generatedString = GenerateARandomString.generateRandomAlphabeticString(10);
        System.out.println(generatedString);

        Map<Character, Long> collect = generatedString.chars().mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
