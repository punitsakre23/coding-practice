package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateARandomListOfIntegers {

    private static final Random random = new Random();

    private GenerateARandomListOfIntegers() {}

    /**
     * Method to generate a random list of integers
     *
     * @param n number of elements in the list
     * @return List of Integers
     */
    public static List<Integer> generateARandomListOfIntegers(int n) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        return randomNumbers;
    }
}
