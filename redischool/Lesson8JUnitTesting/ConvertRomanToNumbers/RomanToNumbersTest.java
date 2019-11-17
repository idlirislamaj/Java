package redischool.Lesson8JUnitTesting.ConvertRomanToNumbers;

import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;

import static org.junit.jupiter.api.Assertions.*;
import static redischool.Lesson8JUnitTesting.ConvertRomanToNumbers.RomanToNumbers.convertRomanToNumberMethod;

class RomanToNumbersTest {


    @Test
    void shouldConvertIto1() {

        assertEquals(1, convertRomanToNumberMethod("I"));
    }

    @Test
    void shouldConvertIIto2() {

        assertEquals(2, convertRomanToNumberMethod("II"));
    }

    @Test
    void shouldConvertIVto4() {

        assertEquals(4, convertRomanToNumberMethod("IV"));
    }

    @Test
    void shouldConvertMCMLDVIIto2357() {

        assertEquals(2357, convertRomanToNumberMethod("MCMLDVII"));
    }

}