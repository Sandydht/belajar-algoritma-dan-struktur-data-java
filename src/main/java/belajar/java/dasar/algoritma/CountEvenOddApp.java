package belajar.java.dasar.algoritma;

public class CountEvenOddApp {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{ 1, 2, 3, 4, 5 };
        int[] numbers2 = new int[]{ 7, 3, 6, 7, 4, 12 };

        System.out.println("Numbers 1");
        System.out.println("total even = " + countEven(numbers1));
        System.out.println("total odd = " + countOdd(numbers1));

        System.out.println("Numbers 2");
        System.out.println("total even = " + countEven(numbers2));
        System.out.println("total odd = " + countOdd(numbers2));
    }

    public static int countEven(int[] arr) {
        int evenCount = 0;

        for (int number : arr) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public static int countOdd(int[] arr) {
        int oddCount = 0;

        for (int number : arr) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
    }
}
