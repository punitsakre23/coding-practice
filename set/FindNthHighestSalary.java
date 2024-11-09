package set;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

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
        TreeSet<Integer> topSalaries = new TreeSet<>();

        for (Integer salary : inputList) {
            topSalaries.add(salary);
            if (topSalaries.size() > nth) {
                topSalaries.pollFirst();
            }
        }

        return topSalaries.size() == nth ? topSalaries.first() : null;
    }
}
