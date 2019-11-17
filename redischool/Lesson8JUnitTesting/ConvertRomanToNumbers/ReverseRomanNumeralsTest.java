package redischool.Lesson8JUnitTesting.ConvertRomanToNumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseRomanNumeralsTest {
    @ParameterizedTest
    @MethodSource("conversionCases")
    void shouldConvertCorrectly(String roman, int number) {
        assertEquals(number, ReverseRomanNumerals.convert(roman));
    }

    private static List<Arguments> conversionCases() {
        return List.of(
                Arguments.arguments("I", 1),
                Arguments.arguments("II", 2),
                Arguments.arguments("III", 3),
                Arguments.arguments("IV", 4),
                Arguments.arguments("V", 5),
                Arguments.arguments("VI", 6),
                Arguments.arguments("IX", 9),
                Arguments.arguments("X", 10),
                Arguments.arguments("XI", 11),
                Arguments.arguments("XIV", 14),
                Arguments.arguments("XVI", 16),
                Arguments.arguments("XXI", 21),
                Arguments.arguments("XXXIX", 39),
                Arguments.arguments("XL", 40),
                Arguments.arguments("XLI", 41),
                Arguments.arguments("L", 50),
                Arguments.arguments("XC", 90),
                Arguments.arguments("C", 100),
                Arguments.arguments("CD", 400),
                Arguments.arguments("D", 500),
                Arguments.arguments("CM", 900),
                Arguments.arguments("M", 1000));
    }
}