package redischool.Lesson8JUnitTesting.ConvertNumbersToRoman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersToRomanTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", NumbersToRoman.convert(1));
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", NumbersToRoman.convert(2));
    }

    @Test
    void shouldConvert3ToIII() {
        assertEquals("III", NumbersToRoman.convert(3));
    }

    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV", NumbersToRoman.convert(4));
    }

    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX", NumbersToRoman.convert(9));
    }

    @Test
    void shouldConvert5ToV() {
        assertEquals("V", NumbersToRoman.convert(5));
    }

    @Test
    void shouldConvert6ToVI() {
        assertEquals("VI", NumbersToRoman.convert(6));
    }

    @Test
    void shouldConvert10ToX() {
        assertEquals("X", NumbersToRoman.convert(10));
    }

    @Test
    void shouldConvert11ToXI() {
        assertEquals("XI", NumbersToRoman.convert(11));
    }

    @Test
    void shouldConvert15ToXV() {
        assertEquals("XV", NumbersToRoman.convert(15));
    }

    @Test
    void shouldConvert40ToXL() {
        assertEquals("XL", NumbersToRoman.convert(40));
    }

    @Test
    void shouldConvert50ToL() {
        assertEquals("L", NumbersToRoman.convert(50));
    }

    @Test
    void shouldConvert90ToXC() {
        assertEquals("XC", NumbersToRoman.convert(90));
    }

    @Test
    void shouldConvert100ToC() {
        assertEquals("C", NumbersToRoman.convert(100));
    }

    @Test
    void shouldConvert400ToCD() {
        assertEquals("CD", NumbersToRoman.convert(400));
    }

    @Test
    void shouldConvert500ToD() {
        assertEquals("D", NumbersToRoman.convert(500));
    }

    @Test
    void shouldConvert900ToCM() {
        assertEquals("CM", NumbersToRoman.convert(900));
    }

    @Test
    void shouldConvert1000ToM() {
        assertEquals("M", NumbersToRoman.convert(1000));
    }

    @Test
    void shouldConvert1989ToXI() {
        assertEquals("MCMLXXXIX", NumbersToRoman.convert(1989));
    }

}