package belajar.java.dasar.algoritma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountEvenOddAppTest {
    private final CountEvenOddApp countEvenOddApp = new CountEvenOddApp();

    @Test
    public void testCountEvenSuccess() {
        int[] numbers1 = new int[]{ 1, 2, 3, 4, 5 };
        int[] numbers2 = new int[]{ 7, 3, 6, 7, 4, 12 };

        int resultNumbers1 = countEvenOddApp.countEven(numbers1);
        int resultNumbers2 = countEvenOddApp.countEven(numbers2);

        Assertions.assertEquals(2, resultNumbers1);
        Assertions.assertEquals(3, resultNumbers2);
    }

    @Test
    public void testCountOddSuccess() {
        int[] numbers1 = new int[]{ 1, 2, 3, 4, 5 };
        int[] numbers2 = new int[]{ 7, 3, 6, 7, 4, 12 };

        int resultNumbers1 = countEvenOddApp.countOdd(numbers1);
        int resultNumbers2 = countEvenOddApp.countOdd(numbers2);

        Assertions.assertEquals(3, resultNumbers1);
        Assertions.assertEquals(3, resultNumbers2);
    }
}
