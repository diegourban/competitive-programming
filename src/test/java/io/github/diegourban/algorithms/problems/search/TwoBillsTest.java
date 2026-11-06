package io.github.diegourban.algorithms.problems.search;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Two Bills — beecrowd (formerly URI Online Judge) 2140.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2140
 * <p>
 * Search every unordered pair of bills (the same denomination may appear twice, e.g. 2 + 2) for one that
 * adds up to the change {@code paid - price}. Six denominations, so O(1) per query.
 */
class TwoBillsTest {

    private static final int[] BILLS = {2, 5, 10, 20, 50, 100};

    private final SampleLoader samples = new SampleLoader("problems/search/two-bills");

    static boolean solve(int price, int paid) {
        var change = paid - price;
        for (var i = 0; i < BILLS.length; i++) {
            for (var j = i; j < BILLS.length; j++) {
                if (BILLS[i] + BILLS[j] == change) {
                    return true;
                }
            }
        }
        return false;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var out = new StringBuilder();
        for (int price = reader.nextInt(), paid = reader.nextInt(); price != 0 || paid != 0;
             price = reader.nextInt(), paid = reader.nextInt()) {
            out.append(solve(price, paid) ? "possible" : "impossible").append('\n');
        }
        return out.toString();
    }

    @ParameterizedTest
    @CsvSource({
            "11, 23",
            "500, 650",
            "9948, 9963",
            "1, 5",
            "0, 200",
    })
    void changeMadeOfTwoBillsIsPossible(int price, int paid) {
        assertThat(solve(price, paid)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "100, 600",
            "1, 2",
            "1, 3",
            "1, 7",
            "5, 5",
            "0, 201",
    })
    void otherChangeIsImpossible(int price, int paid) {
        assertThat(solve(price, paid)).isFalse();
    }

    @Test
    void zeroZeroEndsTheInput() throws IOException {
        assertThat(run(new ByteArrayInputStream("0 0\n".getBytes(StandardCharsets.UTF_8)))).isEmpty();
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void samples(String name) throws IOException {
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(samples.loadAsString(name + ".out"));
    }
}
