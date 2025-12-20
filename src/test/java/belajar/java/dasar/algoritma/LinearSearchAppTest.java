package belajar.java.dasar.algoritma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchAppTest {
    private final LinearSearchApp linearSearchApp = new LinearSearchApp();

    @Test
    public void testLinearSearchSuccess() {
        int[] numbers1 = new int[]{ 2, 3, 7, 5, 6, 4 };
        int[] numbers2 = new int[]{ 1, 2, 3, 4, 5, 6, 10 };

        int resultNumbers1 = linearSearchApp.linearSearch(numbers1, 2);
        int resultNumbers2 = linearSearchApp.linearSearch(numbers2, 11);

        Assertions.assertEquals(0, resultNumbers1);
        Assertions.assertEquals(-1, resultNumbers2);
    }
}
