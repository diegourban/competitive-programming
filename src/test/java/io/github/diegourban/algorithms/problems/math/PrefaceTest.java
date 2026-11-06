package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Preface — beecrowd (formerly URI Online Judge) 1837.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1837
 * <p>
 * Euclidean division: the remainder is always 0 &lt;= r &lt; |b| ({@code Math.floorMod} by |b|), and
 * the quotient follows as (a - r) / b. O(1).
 */
class PrefaceTest {

    record Division(int quotient, int remainder) {}

    static Division solve(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("division by zero");
        }
        final var remainder = Math.floorMod(a, Math.abs(b));
        return new Division((a - remainder) / b, remainder);
    }

    @ParameterizedTest
    @CsvSource({
        "7, 3, 2, 1",
        "-7, -3, 3, 2",
        "-736, 539, -2, 342",
        "62, -59, -1, 3",
        "999, 999, 1, 0",
        "-1000, -1000, 1, 0",
        "-6, 3, -2, 0",
        "0, -5, 0, 0",
    })
    void remainderIsNeverNegative(final int a, final int b, final int quotient, final int remainder) {
        assertThat(solve(a, b)).isEqualTo(new Division(quotient, remainder));
    }

    @Test
    void divisionByZeroIsRejected() {
        assertThatIllegalArgumentException().isThrownBy(() -> solve(1, 0));
    }
}
