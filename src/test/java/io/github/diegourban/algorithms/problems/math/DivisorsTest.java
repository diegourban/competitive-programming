package io.github.diegourban.algorithms.problems.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Divisors I — beecrowd (formerly URI Online Judge) 1157.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1157
 * <p>
 * Divisors come in pairs (d, n / d) with d &lt;= sqrt(n): collect the small ones in order and the
 * large ones in reverse, then concatenate. O(sqrt(n)).
 */
class DivisorsTest {

    static List<Integer> solve(int n) {
        var small = new ArrayList<Integer>();
        var large = new ArrayList<Integer>();
        for (var d = 1; (long) d * d <= n; d++) {
            if (n % d == 0) {
                small.add(d);
                if (d != n / d) {
                    large.add(n / d);
                }
            }
        }
        small.addAll(large.reversed());
        return small;
    }

    @Test
    void sample() {
        assertThat(solve(6)).containsExactly(1, 2, 3, 6);
    }

    @Test
    void oneHasOnlyItself() {
        assertThat(solve(1)).containsExactly(1);
    }

    @Test
    void primeHasOneAndItself() {
        assertThat(solve(2)).containsExactly(1, 2);
        assertThat(solve(5)).containsExactly(1, 5);
    }

    @Test
    void perfectSquareListsItsRootOnce() {
        assertThat(solve(100)).containsExactly(1, 2, 4, 5, 10, 20, 25, 50, 100);
    }
}
