package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Find Maximum Occurrence of a character in a String
 */
public class FindMaximumOccurredCharacterInAString {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var inputString = sc.nextLine();
        if (inputString.isBlank()) {
            System.out.println("Blank Input");
            return;
        }
        FindMaximumOccurredCharacterInAString obj = new FindMaximumOccurredCharacterInAString();
        obj.getMaximumOccurredCharacterInAString(inputString);
    }

    public void getMaximumOccurredCharacterInAString(String inputString) {
        char out = inputString.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .reduce((e1, e2) -> e1.getValue() >= e2.getValue() ? e1 : e2)
                .map(Map.Entry::getKey).orElse('?');
        logger.log(Level.INFO, () -> "Maximum occurred character in a String: {} " + out);
    }
}
