package belajar.java.dasar.algoritma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayAppTest {
    private final ReverseArrayApp reverseArrayApp = new ReverseArrayApp();

    @Test
    public void testReverseArraySuccess() {
        int[] numbers1 = new int[]{ 1, 2, 3, 4, 5, 6 };
        int[] numbers2 = new int[]{ 5, 6, 4, 3, 2, 1 };

        int[] numbers1Extected = new int[]{ 6, 5, 4, 3, 2, 1};
        int[] numbers2Expected = new int[]{ 1, 2, 3, 4, 6, 5};

        int[] resultNumbers1 = reverseArrayApp.reverseArray(numbers1);
        int[] resultNumbers2 = reverseArrayApp.reverseArray(numbers2);

        Assertions.assertArrayEquals(numbers1Extected, resultNumbers1);
        Assertions.assertArrayEquals(numbers2Expected, resultNumbers2);
    }
}
