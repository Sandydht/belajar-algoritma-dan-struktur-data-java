package belajar.java.array.dan.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSubarraySumAppTest {
    private final MaxSubarraySumApp maxSubarraySumApp = new MaxSubarraySumApp();

    @Test
    public void testMaxSubarraySumSuccess() {
        int[] numbers1 = new int[]{ 3, 2, 4, 1, 6, 7 };
        int[] numbers2 = new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int expectedNumbers1 = 26;
        int expectedNumbers2 = 6;

        int resultNumbers1 = maxSubarraySumApp.maxSubarraySum(numbers1);
        int resultNumbers2 = maxSubarraySumApp.maxSubarraySum(numbers2);

        Assertions.assertEquals(expectedNumbers1, resultNumbers1);
        Assertions.assertEquals(expectedNumbers2, resultNumbers2);
    }
}
