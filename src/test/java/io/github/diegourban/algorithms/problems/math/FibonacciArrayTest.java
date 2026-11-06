package io.github.diegourban.algorithms.problems.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Fibonacci Array — beecrowd (formerly URI Online Judge) 1176.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1176
 * <p>
 * Iterate the recurrence in a {@code long} (Fib(60) needs 41 bits); exact, unlike Binet's formula
 * in doubles. O(n).
 */
class FibonacciArrayTest {

    static long solve(int n) {
        var previous = 0L;
        var current = 1L;
        for (var i = 0; i < n; i++) {
            var next = previous + current;
            previous = current;
            current = next;
        }
        return previous;
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "4, 3",
            "10, 55",
            "46, 1836311903",
            "47, 2971215073",
            "60, 1548008755920",
    })
    void nthFibonacci(int n, long expected) {
        assertThat(solve(n)).isEqualTo(expected);
    }
}
