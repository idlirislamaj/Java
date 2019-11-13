package redischool.Lesson8JUnitTesting.ConvertRomanToNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumbersTest {

    @Test
    void shouldConvertMCMLto1950() {
        assertEquals(1950, RomanToNumbers.convertRomanToNumberMethod("MCML"));
    }

}