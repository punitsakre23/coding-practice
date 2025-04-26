package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        findMaxDidit(list);
        findMinDigit(list);
    }

    private static void findMinDigit(List<Integer> list) {
        Integer min = list.stream().min(Comparator.comparingInt(x -> x)).get();
        System.out.println(min);
    }

    private static void findMaxDidit(List<Integer> list) {
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
    }
}
