package io.github.diegourban.algorithms.problems.datastructure.set;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.TreeSet;
import org.junit.jupiter.api.Test;

/**
 * Twice Linear — Codewars (5 kyu).
 * <p>
 * https://www.codewars.com/kata/twice-linear
 * <p>
 * Sequence u starts at 1 and contains 2x+1 and 3x+1 for every x in u. Repeatedly take the smallest
 * element of a sorted set and add its two successors (the set removes duplicates); the n-th removal
 * is the answer. O(n log n) time, O(n) space.
 */
class TwiceLinearTest {

    static int solve(final int n) {
        final var pending = new TreeSet<Integer>();
        pending.add(1);
        for (var i = 0; i < n; i++) {
            final var x = pending.pollFirst();
            pending.add(2 * x + 1);
            pending.add(3 * x + 1);
        }
        return pending.first();
    }

    @Test
    void firstElementIsOne() {
        assertThat(solve(0)).isEqualTo(1);
    }

    @Test
    void countsDuplicateProductsOnce() {
        // 31 = 2*15+1 = 3*10+1 appears once in u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, 28, 31, 39, ...]
        assertThat(solve(13)).isEqualTo(31);
        assertThat(solve(14)).isEqualTo(39);
    }

    @Test
    void basicIndexes() {
        assertThat(solve(10)).isEqualTo(22);
        assertThat(solve(20)).isEqualTo(57);
        assertThat(solve(30)).isEqualTo(91);
        assertThat(solve(50)).isEqualTo(175);
    }

    @Test
    void largeIndexes() {
        assertThat(solve(100)).isEqualTo(447);
        assertThat(solve(6000)).isEqualTo(80914);
        assertThat(solve(60000)).isEqualTo(1511311);
    }
}
