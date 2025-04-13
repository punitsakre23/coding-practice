package stream;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program in Java to filter a list of integers based on a specified starting digit. The program should:
 *
 * Take an integer (number) and a list of integers (inputList) as input.
 *
 * Output a list of integers that begin with the given integer.
 */
public class FindElementsThatStartsWithAParticularDigit {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Input the digit: ");
        var inputNum = sc.nextInt();
        System.out.println("Input elements: ");
        var inputList = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            inputList.add(sc.nextInt());
        }

        findTheElementsThatStartsWithAParticularDigit(inputList, inputNum);
    }

    private static void findTheElementsThatStartsWithAParticularDigit(ArrayList<Integer> inputList, int inputNum) {
//        var outList = inputList.stream().map(num -> num.toString()).filter(num -> num.startsWith(String.valueOf(inputNum))).toList();
        var outList = inputList.stream().filter(num -> num.toString().startsWith(String.valueOf(inputNum))).toList();
        System.out.println("Elements that starts with: " + inputNum + " are: " + outList);
    }
}
