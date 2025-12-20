package belajar.java.sorting.dan.search;

import belajar.java.sorting.dan.searching.BinarySearchApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchAppTest {
    private final BinarySearchApp binarySearchApp = new BinarySearchApp();

    @Test
    public void testBinarySearchSuccess() {
        int[] numbers1 = new int[]{ 3, 4, 2, 5, 1, 10, 11 };
        int[] numbers2 = new int[]{ -3, -2, -1, 0, 4, 5, 6};

        int resultNumbers1 = binarySearchApp.binarySearch(numbers1, 4);
        int resultNumbers2 = binarySearchApp.binarySearch(numbers2, 0);

        Assertions.assertEquals(1, resultNumbers1);
        Assertions.assertEquals(3, resultNumbers2);
    }
}
