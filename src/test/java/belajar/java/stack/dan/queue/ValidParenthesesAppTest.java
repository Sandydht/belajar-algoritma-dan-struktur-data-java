package belajar.java.stack.dan.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesAppTest {
    private final ValidParenthesesApp validParenthesesApp = new ValidParenthesesApp();

    @Test
    public void testIsValidSuccess() {
        String string1 = "(){}[]";
        String string2 = "({[";

        Boolean resultString1 = validParenthesesApp.isValid(string1);
        Boolean resultString2 = validParenthesesApp.isValid(string2);

        Assertions.assertTrue(resultString1);
        Assertions.assertFalse(resultString2);
    }
}
