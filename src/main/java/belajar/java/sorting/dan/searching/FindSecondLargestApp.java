package belajar.java.sorting.dan.searching;

public class FindSecondLargestApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 2, 3, 1, 5, 3, 7, 8, 10 };
        int[] numbers2 = new int[]{ 4, 3, 1, 2, 6, 7, 4, 2, 12 };
        int[] numbers3 = new int[]{ 10, 11, -2, -1, -21, 0 };

        System.out.println("Numbers 1");
        System.out.println(findSecondLargest(numbers1));

        System.out.println("Numbers 2");
        System.out.println(findSecondLargest(numbers2));

        System.out.println("Numbers 3");
        System.out.println(findSecondLargest(numbers3));
    }

    public static int findSecondLargest(int[] arr) {
        int max = 0;
        int secondMax = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number < max && number > secondMax) {
                secondMax = number;
            }
        }

        return secondMax;
    }
}
