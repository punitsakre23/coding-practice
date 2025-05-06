package stream;

import java.util.Arrays;
import java.util.List;

public class FlattenedArray {
    public static void main(String[] args) {
        flattenPrimitiveArray();
        flattenBoxedArray();
        flattenListOfLists();
    }

    private static void flattenListOfLists() {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flatList = nestedList.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flattened List: " + flatList);
    }

    private static void flattenBoxedArray() {
        Integer[][] nested = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        Integer[] flat = Arrays.stream(nested)
                .flatMap(Arrays::stream)
                .toArray(Integer[]::new);

        System.out.println("Flattened Integer[]: " + Arrays.toString(flat));
    }

    private static void flattenPrimitiveArray() {
        int[][] nested = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[] flat = Arrays.stream(nested)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println("Flattened int[]: " + Arrays.toString(flat));
    }
}
