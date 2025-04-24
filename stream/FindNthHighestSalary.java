package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Find Nth Highest Salary Using Stream API
 */
public class FindNthHighestSalary {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        var inputList = new ArrayList<Integer>();

        var nth = sc.nextInt();

        while (sc.hasNextInt()) {
            inputList.add(sc.nextInt());
        }

        var result = findNthHighestSalary(inputList, nth);
        System.out.println(nth + " Highest Salary: " + result);
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        find2ndHighestSalary(listOfIntegers, 2);
    }

    private static void find2ndHighestSalary(List<Integer> listOfIntegers, int i) {
        Integer resultant = listOfIntegers.stream().distinct().sorted(Comparator.reverseOrder()).skip(i - 1).findFirst().orElse(-1);
        System.out.println("2nd Highest Salary: " + resultant);
    }

    private static Integer findNthHighestSalary(ArrayList<Integer> inputList, Integer nth) {
        return inputList.stream().distinct().sorted(Collections.reverseOrder()).skip((long) nth - 1).findFirst().orElse(null);
    }
}
