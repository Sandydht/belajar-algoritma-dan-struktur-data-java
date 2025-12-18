package belajar.java.dasar.algoritma;

public class LinearSearchApp {
    public static void main(String[] args) {
        int[] numbers = new int[]{ 2, 3, 7, 5, 6, 4 };
        System.out.println(linearSearch(numbers, 7));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
