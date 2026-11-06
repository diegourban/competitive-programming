package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.math.Combinatorics;
import java.math.BigInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Easy Line — Codewars (7 kyu).
 * <p>
 * The sum of the squares of row {@code n} of Pascal's triangle is C(2n, n) (Vandermonde's identity),
 * computed with BigInteger. O(n^2) additions.
 */
class EasyLineTest {

    static BigInteger solve(final int n) {
        return Combinatorics.binomialCoefficient(2 * n, n);
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 2",
        "2, 6",
        "3, 20",
        "4, 70",
        "5, 252",
        "6, 924",
        "7, 3432",
        "13, 10400600",
        "17, 2333606220",
        "19, 35345263800",
        "50, 100891344545564193334812497256",
    })
    void sumsSquaresOfPascalRow(final int n, final BigInteger expected) {
        assertThat(solve(n)).isEqualTo(expected);
    }
}
