package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        Map<Integer, Integer> charCountMap = new HashMap<>();
        for (Integer i : list) {
            charCountMap.merge(i, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> i : charCountMap.entrySet()) {
            if (i.getValue() > 1) {
                System.out.println(i.getKey());
            }
        }
    }
}
