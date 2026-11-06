package io.github.diegourban.algorithms.problems.simulation;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Star Trek — beecrowd (formerly URI Online Judge) 1973.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1973
 * <p>
 * Simulate Kirk's raid: on each star steal one sheep (if any) and move forward when the star had an odd
 * count, backward when even, until leaving the galaxy. After the first even star every star behind it
 * is now even, so the walk takes at most 2n steps: O(n) time and space.
 */
class StarTrekTest {

    private final SampleLoader samples = new SampleLoader("problems/simulation/star-trek");

    record Raid(int starsAttacked, long sheepLeft) {
    }

    static Raid solve(int[] sheep) {
        var left = sheep.clone();
        var attacked = new boolean[left.length];
        var star = 0;
        while (star >= 0 && star < left.length) {
            attacked[star] = true;
            var odd = left[star] % 2 == 1;
            if (left[star] > 0) {
                left[star]--;
            }
            star += odd ? 1 : -1;
        }
        var starsAttacked = 0;
        for (var a : attacked) {
            if (a) {
                starsAttacked++;
            }
        }
        return new Raid(starsAttacked, Arrays.stream(left).asLongStream().sum());
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var sheep = new int[reader.nextInt()];
        for (var i = 0; i < sheep.length; i++) {
            sheep[i] = reader.nextInt();
        }
        var raid = solve(sheep);
        return raid.starsAttacked() + " " + raid.sheepLeft() + "\n";
    }

    @Test
    void singleStarWithOneSheep() {
        assertThat(solve(new int[]{1})).isEqualTo(new Raid(1, 0));
    }

    @Test
    void allOddStarsAreAttackedOnceOnTheWayOut() {
        assertThat(solve(new int[]{1, 1, 1, 1, 1})).isEqualTo(new Raid(5, 0));
        assertThat(solve(new int[]{3, 3, 3, 3, 3})).isEqualTo(new Raid(5, 10));
    }

    @Test
    void evenStarTurnsKirkBackAndEveryStarBehindIsRobbedAgain() {
        assertThat(solve(new int[]{1, 1, 2, 1, 1})).isEqualTo(new Raid(3, 3));
        assertThat(solve(new int[]{3, 3, 2, 3, 3})).isEqualTo(new Raid(3, 9));
    }

    @Test
    void evenLastStarTurnsKirkBack() {
        assertThat(solve(new int[]{1, 1, 1, 1, 2})).isEqualTo(new Raid(5, 1));
        assertThat(solve(new int[]{3, 3, 3, 3, 2})).isEqualTo(new Raid(5, 5));
    }

    @Test
    void emptyStarIsEvenAndHasNothingToSteal() {
        assertThat(solve(new int[]{3, 0, 5})).isEqualTo(new Raid(2, 6));
    }

    @Test
    void judgeSamples() {
        assertThat(solve(new int[]{1, 3, 5, 7, 11, 13, 17, 19})).isEqualTo(new Raid(8, 68));
        assertThat(solve(new int[]{1, 3, 5, 7, 11, 13, 16, 19})).isEqualTo(new Raid(7, 63));
    }

    @ParameterizedTest
    @CsvSource({
            "max, 10000 99990000",
            "max2, 16000 15999968000",
            "max3, 8000 15999968002",
    })
    void maxSamples(String name, String expected) throws IOException {
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(expected + "\n");
    }
}
