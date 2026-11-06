package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.math.Combinatorics;
import java.math.BigInteger;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Pascal's Triangle — beecrowd (formerly URI Online Judge) 2232.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2232
 * <p>
 * Row k of Pascal's triangle sums to 2^k, so the first n rows sum to 2^n - 1. O(1).
 */
class PascalsTriangleTest {

    static long solve(int n) {
        return (1L << n) - 1;
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1",
        "2, 3",
        "5, 31",
        "31, 2147483647",
        "50, 1125899906842623",
    })
    void sumOfFirstRows(int n, long expected) {
        assertThat(solve(n)).isEqualTo(expected);
    }

    @Test
    void closedFormMatchesSummingTheBinomialCoefficients() {
        for (var n = 1; n <= 20; n++) {
            var sum = IntStream.range(0, n)
                    .boxed()
                    .flatMap(row ->
                            IntStream.rangeClosed(0, row).mapToObj(k -> Combinatorics.binomialCoefficient(row, k)))
                    .reduce(BigInteger.ZERO, BigInteger::add);
            assertThat(solve(n)).as("n = %d", n).isEqualTo(sum.longValueExact());
        }
    }
}
