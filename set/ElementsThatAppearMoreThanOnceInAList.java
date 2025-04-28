package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Find duplicates in a List
 */
public class ElementsThatAppearMoreThanOnceInAList {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Input elements: ");
        var inputList = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            inputList.add(sc.nextInt());
        }

        elementsAppearingMoreThanOnceInAList(inputList);
    }

    private static void elementsAppearingMoreThanOnceInAList(ArrayList<Integer> list) {
        var set = new HashSet<>();
        var res = list.stream().filter(l -> !set.add(l)).toList();
        System.out.println(res);
    }
}
