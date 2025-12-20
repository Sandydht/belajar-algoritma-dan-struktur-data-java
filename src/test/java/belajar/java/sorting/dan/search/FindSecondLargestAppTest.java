package belajar.java.sorting.dan.search;

import belajar.java.sorting.dan.searching.FindSecondLargestApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindSecondLargestAppTest {
    private final FindSecondLargestApp findSecondLargestApp = new FindSecondLargestApp();

    @Test
    public void testFindSecondLargestSuccess() {
        int[] numbers1 = new int[]{ 2, 3, 1, 5, 3, 7, 8, 10 };
        int[] numbers2 = new int[]{ 4, 3, 1, 2, 6, 7, 4, 2, 12 };

        int expectedResultNumbers1 = 8;
        int expectedResultNumbers2 = 7;

        int resultNumbers1 = findSecondLargestApp.findSecondLargest(numbers1);
        int resultNumbers2 = findSecondLargestApp.findSecondLargest(numbers2);

        Assertions.assertEquals(expectedResultNumbers1, resultNumbers1);
        Assertions.assertEquals(expectedResultNumbers2, resultNumbers2);
    }
}
