package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheListInDescendingOrderOfElementsLength {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        printSortedList(listOfStrings);
        sortedList(listOfStrings);
    }

    private static void sortedList(List<String> listOfStrings) {
        listOfStrings.sort(Comparator.comparing(String::length).reversed());
        System.out.println(listOfStrings);
        listOfStrings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        System.out.println(listOfStrings);
    }

    private static void printSortedList(List<String> listOfStrings) {
        List<String> sortedList = listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
//        List<String> sortedList = listOfStrings.stream().sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())).toList();
        System.out.println(sortedList);
    }
}
