package belajar.java.array.dan.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramCheckAppTest {
    private final AnagramCheckApp anagramCheckApp = new AnagramCheckApp();

    @Test
    public void testIsAnagramSuccess() {
        String string1 = "silent";
        String string2 = "race";

        String targetString1 = "listen";
        String targetString2 = "care";

        Boolean resultString1 = anagramCheckApp.isAnagram(string1, targetString1);
        Boolean resultString2 = anagramCheckApp.isAnagram(string2, targetString2);

        Assertions.assertTrue(resultString1);
        Assertions.assertTrue(resultString2);
    }
}
