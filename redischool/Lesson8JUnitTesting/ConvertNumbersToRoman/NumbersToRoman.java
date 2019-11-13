package redischool.Lesson8JUnitTesting.ConvertNumbersToRoman;

import java.util.List;

public class NumbersToRoman {
    private static final List<Mapping> MAPPINGS = List.of(
            new Mapping("M", 1000),
            new Mapping("CM", 900),
            new Mapping("D", 500),
            new Mapping("CD", 400),
            new Mapping("C", 100),
            new Mapping("XC", 90),
            new Mapping("L", 50),
            new Mapping("XL", 40),
            new Mapping("X", 10),
            new Mapping("IX", 9),
            new Mapping("V", 5),
            new Mapping("IV", 4),
            new Mapping("I", 1));

    private static class Mapping {
        final String roman;
        final int number;

        Mapping(String roman, int number) {
            this.roman = roman;
            this.number = number;
        }
    }

    public static String convert(int i) {
        for (Mapping mapping : MAPPINGS) {
            if (i >= mapping.number) {
                return mapping.roman + convert(i - mapping.number);
            }
        }
        return "";
    }
}
