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

        findNthHighestSalary(inputList, nth);
    }

    private static void findNthHighestSalary(ArrayList<Integer> inputList, int nth) {
        if (inputList.isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        var list = inputList.stream().distinct().sorted(Collections.reverseOrder()).toList();

        System.out.println(list.get(nth - 1));
    }
}
