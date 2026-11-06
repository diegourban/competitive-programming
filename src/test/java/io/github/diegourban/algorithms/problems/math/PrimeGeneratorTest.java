package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Prime Generator — SPOJ PRIME1.
 * <p>
 * https://www.spoj.com/problems/PRIME1/
 * <p>
 * Segmented sieve: sieve the base primes up to sqrt(n), then cross off their multiples inside [m, n].
 * O(sqrt(n) log log n + (n - m) log log n) time, O(sqrt(n) + (n - m)) space.
 */
class PrimeGeneratorTest {

    static List<Integer> solve(int m, int n) {
        var low = Math.max(m, 2);
        var primes = new ArrayList<Integer>();
        if (low > n) {
            return primes;
        }
        var limit = (int) Math.sqrt(n);
        var composite = new boolean[limit + 1];
        var segment = new boolean[n - low + 1];
        for (var p = 2; p <= limit; p++) {
            if (composite[p]) {
                continue;
            }
            for (var multiple = (long) p * p; multiple <= limit; multiple += p) {
                composite[(int) multiple] = true;
            }
            var first = Math.max((long) p * p, (low + p - 1L) / p * p);
            for (var multiple = first; multiple <= n; multiple += p) {
                segment[(int) (multiple - low)] = true;
            }
        }
        for (var i = 0; i < segment.length; i++) {
            if (!segment[i]) {
                primes.add(low + i);
            }
        }
        return primes;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var t = reader.nextInt();
        var out = new StringBuilder();
        for (var i = 0; i < t; i++) {
            if (i > 0) {
                out.append('\n');
            }
            for (var prime : solve(reader.nextInt(), reader.nextInt())) {
                out.append(prime).append('\n');
            }
        }
        return out.toString();
    }

    private final SampleLoader samples = new SampleLoader("problems/math/prime-generator");

    private static InputStream input(String text) {
        return new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void primesUpToOneHundred() {
        assertThat(solve(1, 100))
                .containsExactly(
                        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
    }

    @Test
    void rangeWithoutPrimes() {
        assertThat(solve(8, 10)).isEmpty();
        assertThat(solve(1, 1)).isEmpty();
    }

    @Test
    void rangeBoundsAreInclusive() {
        assertThat(solve(2, 2)).containsExactly(2);
        assertThat(solve(10, 11)).containsExactly(11);
    }

    @Test
    void largeRangeNearUpperLimit() {
        assertThat(solve(999_999_900, 1_000_000_000)).containsExactly(999_999_929, 999_999_937);
    }

    @Test
    void judgeSample() throws IOException {
        assertThat(run(input("""
                2
                1 10
                3 5
                """))).isEqualTo("""
                2
                3
                5
                7

                3
                5
                """);
    }

    @Test
    void separatesEmptyTestCasesWithBlankLines() throws IOException {
        assertThat(run(input("""
                3
                8 9
                9 10
                10 11
                """))).isEqualTo("\n\n11\n");
    }

    @Test
    void maxDifferenceFromOne() throws IOException {
        assertThat(run(input("1\n1 100001\n"))).isEqualTo(samples.loadAsString("sampleMaxDifSmall.out"));
    }

    @Test
    void maxDifferenceNearOneBillion() throws IOException {
        assertThat(run(input("1\n999900000 1000000000\n"))).isEqualTo(samples.loadAsString("sampleMaxDifLarge.out"));
    }
}
