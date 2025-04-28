package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CountTheNumberOfLettersNumbersAndSpecialCharactersInAString {
    public static void main(String[] args) {
        String input = "Automat@123ion";

        countInAMoreGenericWay(input);
        countWithoutStreams(input);
        countTheNumberOfLetters(input);
        countTheNumberOfDigits(input);
        countTheNumberOfSpecialCharacters(input);
        countTheNumber(input);
    }

    private static void countTheNumber(String input) {
        Map<String, Long> counts = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        ch -> Character.isLetter(ch) ? "Letters" :
                                Character.isDigit(ch) ? "Numbers" :
                                        "Special Characters",
                        Collectors.counting()
                ));

        System.out.println("Letters: " + counts.getOrDefault("Letters", 0L));
        System.out.println("Numbers: " + counts.getOrDefault("Numbers", 0L));
        System.out.println("Special Characters: " + counts.getOrDefault("Special Characters", 0L));
    }

    private static void countInAMoreGenericWay(String input) {
        int letters = 0;
        int numbers = 0;
        int specialCharacters = 0;

        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters++;
            } else if (ch >= '0' && ch <= '9') {
                numbers++;
            } else {
                specialCharacters++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special characters: " + specialCharacters);
    }

    private static void countWithoutStreams(String input) {
        int letters = 0;
        int numbers = 0;
        int specialCharacters = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else {
                specialCharacters++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special characters: " + specialCharacters);
    }

    private static void countTheNumberOfLetters(String input) {
        long countOfLetters = input.chars().filter(Character::isLetter).count();
        System.out.println("Number of Letters: " + countOfLetters);
    }

    private static void countTheNumberOfDigits(String input) {
        long countOfDigits = input.chars().filter(Character::isDigit).count();
        System.out.println("Number of Digits: " + countOfDigits);
    }

    private static void countTheNumberOfSpecialCharacters(String input) {
        long countOfSpecialCharacters = input.chars()
                .filter(c -> !Character.isLetterOrDigit(c))
                .count();
        System.out.println("Number of Special Characters: " + countOfSpecialCharacters);
    }


}
