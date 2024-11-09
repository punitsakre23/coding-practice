package stream;

import java.util.ArrayList;
import java.util.Collections;
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
    }

    private static Integer findNthHighestSalary(ArrayList<Integer> inputList, Integer nth) {
        return inputList.stream().distinct().sorted(Collections.reverseOrder()).skip((long) nth - 1).findFirst().orElse(null);
    }
}
