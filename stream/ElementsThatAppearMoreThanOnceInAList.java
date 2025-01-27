package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Elements that appear more than once in a list
 */
public class ElementsThatAppearMoreThanOnceInAList {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Input elements: ");
        var inputList = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            inputList.add(sc.nextInt());
        }

        elementsAppearingMoreThanOnce(inputList);
    }

    private static void elementsAppearingMoreThanOnce(ArrayList<Integer> inputList) {
        var res = inputList.isEmpty() ? new ArrayList<>() : inputList.stream().filter(x -> Collections.frequency(inputList, x) > 1).collect(Collectors.toSet());
        System.out.println(res);
    }
}
