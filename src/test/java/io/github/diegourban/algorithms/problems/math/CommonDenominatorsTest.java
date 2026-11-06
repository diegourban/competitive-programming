package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.math.NumberTheory;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * Common Denominators — Codewars (5 kyu).
 * <p>
 * https://www.codewars.com/kata/common-denominators
 * <p>
 * The common denominator is the lcm of all denominators; scale each numerator by {@code lcm / d}.
 * O(k log(max)) time for k fractions.
 */
class CommonDenominatorsTest {

    static String solve(final long[][] fractions) {
        if (fractions.length == 0) {
            return "";
        }
        final var lcm =
                NumberTheory.lcm(Arrays.stream(fractions).mapToLong(f -> f[1]).toArray());
        final var result = new StringBuilder();
        for (final var f : fractions) {
            result.append('(')
                    .append(f[0] * (lcm / f[1]))
                    .append(',')
                    .append(lcm)
                    .append(')');
        }
        return result.toString();
    }

    @Test
    void emptyListGivesEmptyString() {
        assertThat(solve(new long[][] {})).isEmpty();
    }

    @Test
    void unitFractions() {
        assertThat(solve(new long[][] {{1, 2}, {1, 3}, {1, 4}})).isEqualTo("(6,12)(4,12)(3,12)");
    }

    @Test
    void coprimeDenominators() {
        assertThat(solve(new long[][] {{1, 130}, {1, 131}, {1, 4}})).isEqualTo("(262,34060)(260,34060)(8515,34060)");
    }
}
