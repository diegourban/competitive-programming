package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.math.NumberTheory;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Primes in numbers — Codewars (5 kyu).
 * <p>
 * Trial-divide into prime factors (ascending), count multiplicities and format as
 * {@code (p**k)} or {@code (p)} when {@code k == 1}. O(sqrt(n)) time.
 */
class PrimesInNumbersTest {

    static String solve(final int n) {
        final var counts = NumberTheory.primeFactorsList(n).stream()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        final var result = new StringBuilder();
        counts.forEach((prime, k) -> {
            result.append('(').append(prime);
            if (k > 1) {
                result.append("**").append(k);
            }
            result.append(')');
        });
        return result.toString();
    }

    @ParameterizedTest
    @CsvSource({
        "2, (2)",
        "3, (3)",
        "4, (2**2)",
        "5, (5)",
        "6, (2)(3)",
        "7, (7)",
        "8, (2**3)",
        "9, (3**2)",
        "10, (2)(5)",
        "11, (11)",
        "12, (2**2)(3)",
        "13, (13)",
        "86240, (2**5)(5)(7**2)(11)",
        "7775460, (2**2)(3**3)(5)(7)(11**2)(17)",
    })
    void decomposesIntoPrimePowers(final int n, final String expected) {
        assertThat(solve(n)).isEqualTo(expected);
    }
}
