package belajar.java.array.dan.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumAppTest {
    private final TwoSumApp twoSumApp = new TwoSumApp();

    @Test
    public void testTwoSumSuccess() {
        int[] numbers1 = new int[]{ 2, 3, 4, 5, 1};
        int[] numbers2 = new int[]{ 1, 5, 6, 3, 8, 11 };

        int[] expectedNumbers1 = new int[]{ 2, 3 };
        int[] expectedNumbers2 = new int[]{ 1, 2 };

        int[] resultNumbers1 = twoSumApp.twoSum(numbers1, 9);
        int[] resultNumbers2 = twoSumApp.twoSum(numbers2, 11);

        Assertions.assertArrayEquals(expectedNumbers1, resultNumbers1);
        Assertions.assertArrayEquals(expectedNumbers2, resultNumbers2);
    }
}
