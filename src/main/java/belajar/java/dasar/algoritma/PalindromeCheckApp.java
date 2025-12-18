package belajar.java.dasar.algoritma;

public class PalindromeCheckApp {
    public static void main(String[] args) {
        String originalString = "katak";
        System.out.println(isPalindrome(originalString));
    }

    public static boolean isPalindrome(String s) {
        String reversedString = new StringBuilder(s).reverse().toString();
        return s.equals(reversedString);
    }
}
