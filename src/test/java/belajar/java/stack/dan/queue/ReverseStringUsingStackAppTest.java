package belajar.java.stack.dan.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringUsingStackAppTest {
    private final ReverseStringUsingStackApp reverseStringUsingStackApp = new ReverseStringUsingStackApp();

    @Test
    public void testReverseStringUsingStackSuccess() {
        String string1 = "Java";
        String string2 = "Katak";

        String expectedString1 = "avaJ";
        String expectedString2 = "kataK";

        String resultString1 = reverseStringUsingStackApp.reverseStringUsingStack(string1);
        String resultString2 =  reverseStringUsingStackApp.reverseStringUsingStack(string2);

        Assertions.assertEquals(expectedString1, resultString1);
        Assertions.assertEquals(expectedString2, resultString2);
    }
}
