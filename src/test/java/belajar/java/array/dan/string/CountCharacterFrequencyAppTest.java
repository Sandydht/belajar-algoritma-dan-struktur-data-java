package belajar.java.array.dan.string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CountCharacterFrequencyAppTest {
    private final CountCharacterFrequencyApp countCharacterFrequencyApp = new CountCharacterFrequencyApp();
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCountCharacterFrequencySuccess() {
        countCharacterFrequencyApp.countCharacterFrequency("Care");

        String expectedString1 =
                "a = 1\n" +
                "c = 1\n" +
                "e = 1\n" +
                "r = 1\n";

        Assertions.assertEquals(expectedString1, outputStream.toString());
    }
}
