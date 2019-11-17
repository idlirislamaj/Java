package redischool.Lesson8JUnitTesting.ConvertRomanToNumbers;

import java.util.List;

public class ReverseRomanNumerals {
    private static final List<Mapping> MAPPINGS =
            List.of(
                    new Mapping(1000, "M"),
                    new Mapping(900, "CM"),
                    new Mapping(500, "D"),
                    new Mapping(400, "CD"),
                    new Mapping(100, "C"),
                    new Mapping(90, "XC"),
                    new Mapping(50, "L"),
                    new Mapping(40, "XL"),
                    new Mapping(10, "X"),
                    new Mapping(9, "IX"),
                    new Mapping(5, "V"),
                    new Mapping(4, "IV"),
                    new Mapping(1, "I"));

    private static final class Mapping {
        private final int number;
        private final String roman;

        private Mapping(int number, String roman) {
            this.number = number;
            this.roman = roman;
        }
    }

    public static int convert(String roman) {
        for (Mapping mapping : MAPPINGS) {
            if (roman.startsWith(mapping.roman)) {
                return mapping.number + convert(roman.substring(mapping.roman.length()));
            }
        }
        return 0;
    }
}
