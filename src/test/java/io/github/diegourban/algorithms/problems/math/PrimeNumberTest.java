package io.github.diegourban.algorithms.problems.math;

import io.github.diegourban.algorithms.math.NumberTheory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Prime Number — beecrowd (formerly URI Online Judge) 1165.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1165
 * <p>
 * Trial division by 2, 3 and then 6k +/- 1 up to sqrt(x). O(sqrt(x)).
 */
class PrimeNumberTest {

    static boolean solve(int x) {
        return NumberTheory.isPrime(x);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 97, 7919, 9999991})
    void primes(int x) {
        assertThat(solve(x)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 8, 9, 25, 49, 51, 7917, 10000000})
    void nonPrimes(int x) {
        assertThat(solve(x)).isFalse();
    }
}
