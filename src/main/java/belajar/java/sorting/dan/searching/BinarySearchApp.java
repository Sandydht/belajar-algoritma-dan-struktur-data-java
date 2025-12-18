package belajar.java.sorting.dan.searching;

public class BinarySearchApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 3, 4, 2, 5, 1, 10, 11 };
        int[] numbers2 = new int[]{ -3, -2, -1, 0, 4, 5, 6};

        System.out.println("Numbers 1");
        System.out.println(binarySearch(numbers1, 10));

        System.out.println("Numbers 2");
        System.out.println(binarySearch(numbers2, -1));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
