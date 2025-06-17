package stream;

import utilities.GenerateARandomListOfIntegers;

import java.util.List;

public class RemoveDuplicateElementsFromList {
    public static void main(String[] args) {
        var integerList = GenerateARandomListOfIntegers.generateARandomListOfIntegers(20);
        System.out.println(integerList);
        printListWithoutDuplicates(integerList);
    }

    private static void printListWithoutDuplicates(List<Integer> integerList) {
        List<Integer> list = integerList.stream().distinct().toList();
        System.out.println(list);
    }
}
