package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Roman Numerals for Page Numbers — beecrowd (formerly URI Online Judge) 1960.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1960
 * <p>
 * Greedy: repeatedly emit the largest symbol (including the subtractive pairs CM, CD, XC, XL, IX,
 * IV) that still fits. O(1) for n &lt; 1000.
 */
class RomanNumeralsTest {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    static String solve(int n) {
        var roman = new StringBuilder();
        var remaining = n;
        for (var i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }
        return roman.toString();
    }

    @ParameterizedTest
    @CsvSource({
        "666, DCLXVI",
        "83, LXXXIII",
        "1, I",
        "5, V",
        "10, X",
        "50, L",
        "100, C",
        "500, D",
        "4, IV",
        "49, XLIX",
        "444, CDXLIV",
        "999, CMXCIX",
    })
    void convertsToRoman(int n, String expected) {
        assertThat(solve(n)).isEqualTo(expected);
    }
}
