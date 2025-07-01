package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapContentsOfTwoListsWithoutUsingThirdVariable {
    public static void main(String[] args) {
        List<Integer> list1	= new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2	= new ArrayList<>(Arrays.asList(4, 5, 6));

        printList(list1, list2);
        swapUsingListFunctions(list1, list2);
        printList(list1, list2);
        swapUsingForLoop(list1, list2);
        printList(list1, list2);
    }

    private static void swapUsingForLoop(List<Integer> list1, List<Integer> list2) {
        /*
            a = a + b;
            b = a - b;
            a = a - b;
        */

        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + list2.get(i));
            list2.set(i, list1.get(i) - list2.get(i));
            list1.set(i, list1.get(i) - list2.get(i));
        }
    }

    private static void swapUsingListFunctions(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        list2.clear();
        list2.addAll(list1.subList(0, list1.size()/2));
        list1.removeAll(list1.subList(0, list1.size()/2));
    }

    private static void printList(List<Integer> list1, List<Integer> list2) {
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2 + "\n");
    }
}
