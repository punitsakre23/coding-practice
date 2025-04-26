package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareFilterAndAverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 10, 20, 30, 15);
        compute(listOfIntegers);
    }

    private static void compute(List<Integer> listOfIntegers) {
        OptionalDouble average = listOfIntegers.stream()
                .map(num -> num * num)
                .filter(num -> num > 100)
                .mapToInt(n -> n)
                .average();
        System.out.println(average.getAsDouble());
    }
}
