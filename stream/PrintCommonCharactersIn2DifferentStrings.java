package stream;

import java.util.List;
import java.util.Scanner;

public class PrintCommonCharactersIn2DifferentStrings {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var s1 = sc.nextLine();
        var s2 = sc.nextLine();

        printCommonCharacters(s1, s2);
    }

    private static void printCommonCharacters(String s1, String s2) {
        List<Character> characterList = s1.chars().mapToObj(s -> (char) s).distinct().filter(s -> s2.indexOf(s) != -1).toList();
        System.out.println(characterList);
    }
}
