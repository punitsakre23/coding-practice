package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddTwoArraysInSingleArrayWithAscendingOrder {
    public static void main(String[] args) {
        primitiveType();
        nonPrimitiveType();
    }

    private static void nonPrimitiveType() {
        Integer[] array1 = {5, 2, 9};
        Integer[] array2 = {8, 1, 3};

        Integer[] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray(Integer[]::new);

        System.out.println("Merged and sorted array: " + Arrays.toString(result));
    }

    private static void primitiveType() {
        int[] array1 = {5, 2, 9};
        int[] array2 = {8, 1, 3};

        int[] result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();

        System.out.println("Merged and sorted array: " + Arrays.toString(result));
    }
}
