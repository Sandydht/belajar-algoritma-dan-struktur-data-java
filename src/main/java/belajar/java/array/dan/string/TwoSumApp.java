package belajar.java.array.dan.string;

import java.util.Arrays;

public class TwoSumApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 2, 3, 4, 5, 1};
        int[] numbers2 = new int[]{ 1, 5, 6, 3, 8, 11 };

        System.out.println("Numbers 1");
        System.out.println(Arrays.toString(twoSum(numbers1, 9)));

        System.out.println("Numbers 2");
        System.out.println(Arrays.toString(twoSum(numbers2, 11)));
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[]{ i, j };
                }
            }
        }

        return new int[]{ -1, -1 };
    }
}
