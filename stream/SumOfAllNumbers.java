package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class SumOfAllNumbers {

    public static void main(String[] args) {

        int num = 12345;
        printSumOfAllNumbers(num);

        Integer number = num;
        printSumOfAllNum(number);

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        printSumOfAllIntegers(listOfIntegers);
    }

    private static void printSumOfAllIntegers(List<Integer> listOfIntegers) {
        Optional<Integer> sum = listOfIntegers.stream().reduce(Integer::sum);
        System.out.println(sum.get());
    }

    private static void printSumOfAllNum(Integer number) {
        OptionalInt reduce = number.toString().chars().map(Character::getNumericValue).reduce(Integer::sum);
        System.out.println(reduce.getAsInt());
    }

    private static void printSumOfAllNumbers(int num) {
        int sum = String.valueOf(num).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
}
