package io.github.diegourban.algorithms.problems.math;

import io.github.diegourban.algorithms.math.NumberTheory;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Sum by Factors — Codewars (4 kyu).
 * <p>
 * https://www.codewars.com/kata/sum-by-factors
 * <p>
 * For every number, add it to the running sum of each of its distinct prime factors (of its absolute
 * value), kept in a sorted map. O(k * sqrt(max)) time for k numbers.
 */
class SumByFactorsTest {

    static String solve(int[] numbers) {
        var sums = new TreeMap<Integer, Integer>();
        for (var number : numbers) {
            for (var prime : NumberTheory.primeFactorsSet(Math.abs(number))) {
                sums.merge(prime, number, Integer::sum);
            }
        }
        var result = new StringBuilder();
        sums.forEach((prime, sum) -> result.append('(').append(prime).append(' ').append(sum).append(')'));
        return result.toString();
    }

    @Test
    void sumsEachPrimeFactorInAscendingOrder() {
        assertThat(solve(new int[]{12, 15})).isEqualTo("(2 12)(3 27)(5 15)");
    }

    @Test
    void negativeNumbersContributeTheirSignedValue() {
        assertThat(solve(new int[]{15, 30, -45})).isEqualTo("(2 30)(3 0)(5 0)");
    }

    @Test
    void emptyListGivesEmptyString() {
        assertThat(solve(new int[]{})).isEmpty();
    }
}
