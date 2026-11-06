package io.github.diegourban.algorithms.problems.bit;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * To Carry or not to Carry — beecrowd (formerly URI Online Judge) 1026.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1026
 * <p>
 * Binary addition without carry is exactly XOR. Inputs are unsigned 32-bit, so use {@code long}. O(1).
 */
class ToCarryOrNotToCarryTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/bit/to-carry-or-not-to-carry");

    static long solve(long a, long b) {
        return a ^ b;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var out = new StringBuilder();
        while (true) {
            long a;
            long b;
            try {
                a = reader.nextLong();
                b = reader.nextLong();
            } catch (EOFException e) {
                break;
            }
            out.append(solve(a, b)).append('\n');
        }
        return out.toString();
    }

    @Test
    void matchesOfficialSample() {
        assertThat(solve(4, 6)).isEqualTo(2);
        assertThat(solve(6, 9)).isEqualTo(15);
    }

    @Test
    void equalOperandsCancelOut() {
        assertThat(solve(0, 0)).isZero();
        assertThat(solve(4294967295L, 4294967295L)).isZero();
    }

    @Test
    void handlesUnsigned32BitValues() {
        assertThat(solve(2863311530L, 1431655765L)).isEqualTo(4294967295L);
    }

    @ParameterizedTest
    @ValueSource(strings = {"udebug"})
    void matchesSample(String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
