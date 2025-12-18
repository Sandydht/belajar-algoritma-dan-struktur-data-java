package belajar.java.sorting.dan.searching;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 3, 4, 1, 2, 7, 5, 4 };
        int[] numbers2 = new int[]{ -1, -2 , -3 , 5 , 4, 8, 7 };
        int[] numbers3 = new int[]{ 0, 4, 1, -1, -4, 2, 9, 10 };

        System.out.println("Numbers 1");
        System.out.println(Arrays.toString(bubbleSort(numbers1)));

        System.out.println("Numbers 2");
        System.out.println(Arrays.toString(bubbleSort(numbers2)));

        System.out.println("Numbers 3");
        System.out.println(Arrays.toString(bubbleSort(numbers3)));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
