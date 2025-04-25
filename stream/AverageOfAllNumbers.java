package stream;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbers {
    public static void main(String[] args) {
        int num = 12345;
        printAverageOfAllNumbers(num);

        Integer number = num;
        printAverageOfAllNum(number);

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        printAvgOfAllIntegers(listOfIntegers);
    }

    private static void printAvgOfAllIntegers(List<Integer> listOfIntegers) {
        double avg = listOfIntegers.stream().mapToInt(num -> num).average().orElse(-1);
        System.out.println(avg);
    }

    private static void printAverageOfAllNum(Integer number) {
        double average = number.toString().chars().map(Character::getNumericValue).average().orElse(-1);
        System.out.println(average);
    }

    private static void printAverageOfAllNumbers(int num) {
        double avg = String.valueOf(num).chars().map(Character::getNumericValue).average().orElse(-1);
        System.out.println(avg);
    }
}
