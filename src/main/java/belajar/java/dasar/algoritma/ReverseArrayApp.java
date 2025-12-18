package belajar.java.dasar.algoritma;

import java.util.Arrays;

public class ReverseArrayApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 1, 2, 3, 4, 5, 6 };
        int[] numbers2 = new int[]{ 5, 6, 4, 3, 2, 1 };

        System.out.println("Numbers 1");
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(reverseArray(numbers1)));

        System.out.println("Numbers 2");
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(reverseArray(numbers2)));
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}
