package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> collected = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println("Even numbers: " + collected.get(true));
        System.out.println("Odd numbers: " + collected.get(false));
    }
}
