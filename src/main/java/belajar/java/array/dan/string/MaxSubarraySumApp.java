package belajar.java.array.dan.string;

public class MaxSubarraySumApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 3, 2, 4, 1, 6, 7 };
        int[] numbers2 = new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println("Numbers 1");
        System.out.println(maxSubarraySum(numbers1));

        System.out.println("Numbers 2");
        System.out.println(maxSubarraySum(numbers2));
    }

    public static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int number : arr) {
            currentSum = Math.max(number, currentSum + number);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
