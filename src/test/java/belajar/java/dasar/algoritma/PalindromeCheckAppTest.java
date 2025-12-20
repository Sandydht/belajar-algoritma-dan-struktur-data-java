package belajar.java.dasar.algoritma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckAppTest {
    private final PalindromeCheckApp palindromeCheckApp = new PalindromeCheckApp();

    @Test
    public void testIsPalindromeSuccess() {
        String originalString1 = "katak";
        String originalString2 = "java";

        boolean resultString1 = palindromeCheckApp.isPalindrome(originalString1);
        boolean resultString2 = palindromeCheckApp.isPalindrome(originalString2);

        Assertions.assertTrue(resultString1);
        Assertions.assertFalse(resultString2);
    }
}
