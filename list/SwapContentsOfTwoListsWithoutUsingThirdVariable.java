package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapContentsOfTwoListsWithoutUsingThirdVariable {
    public static void main(String[] args) {
        List<Integer> list1	= new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2	= new ArrayList<>(Arrays.asList(4, 5, 6));

        System.out.println("Before Swap:");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        list1.addAll(list2);
        list2.clear();
        list2.addAll(list1.subList(0, list1.size()/2));
        list1.removeAll(list1.subList(0, list1.size()/2));

        System.out.println("\nAfter Swap:");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
    }
}
