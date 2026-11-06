package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Perfect Number — beecrowd (formerly URI Online Judge) 1164.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1164
 * <p>
 * Sum the proper divisors by pairing each d &lt;= sqrt(x) with x / d and compare against x.
 * O(sqrt(x)).
 */
class PerfectNumberTest {

    static boolean solve(int x) {
        if (x < 2) {
            return false;
        }
        var sum = 1L;
        for (var d = 2; (long) d * d <= x; d++) {
            if (x % d == 0) {
                sum += d;
                if (d != x / d) {
                    sum += x / d;
                }
            }
        }
        return sum == x;
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 28, 496, 8128, 33550336})
    void perfectNumbers(int x) {
        assertThat(solve(x)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 29, 50, 91, 100000000})
    void nonPerfectNumbers(int x) {
        assertThat(solve(x)).isFalse();
    }
}
