package belajar.java.sorting.dan.search;

import belajar.java.sorting.dan.searching.BubbleSortApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortAppTest {
    private final BubbleSortApp bubbleSortApp = new BubbleSortApp();

    @Test
    public void testBubbleSortSuccess() {
        int[] numbers1 = new int[]{ 3, 4, 1, 2, 7, 5, 4 };
        int[] numbers2 = new int[]{ -1, -2 , -3 , 5 , 4, 8, 7 };

        int[] expectedResultNumbers1 = new int[]{ 1, 2, 3, 4, 4, 5, 7 };
        int[] expectedResultNumbers2 = new int[]{ -3, -2, -1, 4, 5, 7, 8 };

        int[] resultNumbers1 = bubbleSortApp.bubbleSort(numbers1);
        int[] resultNumbers2 = bubbleSortApp.bubbleSort(numbers2);

        Assertions.assertArrayEquals(expectedResultNumbers1, resultNumbers1);
        Assertions.assertArrayEquals(expectedResultNumbers2, resultNumbers2);
    }
}
