package redischool.Lesson8JUnitTesting.ConvertRomanToNumbers;

import java.util.List;

public class RomanToNumbers {

    static int value(char romanNumeral) {
        if (romanNumeral == 'I')
            return 1;
        if (romanNumeral == 'V')
            return 5;
        if (romanNumeral == 'X')
            return 10;
        if (romanNumeral == 'L')
            return 50;
        if (romanNumeral == 'C')
            return 100;
        if (romanNumeral == 'D')
            return 500;
        if (romanNumeral == 'M')
            return 1000;
        return -1;
    }

    public static int convertRomanToNumberMethod(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }

        return res;
    }

}