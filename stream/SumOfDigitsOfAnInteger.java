package stream;

import java.util.Scanner;

/**
 * The SumOfDigitsOfAnInteger class provides a method to calculate the sum of the digits of an integer.
 */
public class SumOfDigitsOfAnInteger {

    private static final String SUM_OF_INTEGERS = "Sum of Integers: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        if (input < 11) {
            System.out.println("Invalid Input");
            return;
        }

        sumOfIntegersUsingString(input);

        sumOfIntegersUsingPercentile(input);

        sumOfIntegersUsingStreams(input);
    }

    private static void sumOfIntegersUsingStreams(Integer input) {
//        int sum = String.valueOf(input).chars().map(Character::getNumericValue).sum();
        int sum = input.toString().chars().map(Character::getNumericValue).sum();
        System.out.println(SUM_OF_INTEGERS + sum);
    }

    private static void sumOfIntegersUsingPercentile(Integer input) {
        int sum = 0;
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        System.out.println(SUM_OF_INTEGERS + sum);
    }

    private static void sumOfIntegersUsingString(Integer input) {
        int sum = 0;
        String str = input.toString();
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(SUM_OF_INTEGERS + sum);
    }
}
