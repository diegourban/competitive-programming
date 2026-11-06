package io.github.diegourban.algorithms.problems.datastructure.set;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

/**
 * Inflight Entertainment — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/inflight-entertainment
 * <p>
 * One pass, checking whether {@code flightLength - length} was already seen before adding the current length,
 * so a movie is never paired with itself. O(n) time, O(n) space.
 */
class InflightEntertainmentTest {

    static boolean solve(final int[] movieLengths, final int flightLength) {
        final var lengthsSeen = new HashSet<Integer>();
        for (final var firstLength : movieLengths) {
            if (lengthsSeen.contains(flightLength - firstLength)) {
                return true;
            }
            lengthsSeen.add(firstLength);
        }
        return false;
    }

    @Test
    void twoMoviesOfTheSameLengthFillTheFlight() {
        assertThat(solve(new int[] {1, 1}, 2)).isTrue();
    }

    @Test
    void twoDifferentMoviesFillTheFlight() {
        assertThat(solve(new int[] {1, 1, 2}, 3)).isTrue();
    }

    @Test
    void noPairAddsUpToTheFlight() {
        assertThat(solve(new int[] {1, 1}, 3)).isFalse();
        assertThat(solve(new int[] {2, 3}, 2)).isFalse();
    }

    @Test
    void sameMovieCannotBeWatchedTwice() {
        assertThat(solve(new int[] {2, 3}, 4)).isFalse();
    }
}
