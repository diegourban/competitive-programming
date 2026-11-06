package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Triple trouble — Codewars (6 kyu).
 * <p>
 * https://www.codewars.com/kata/triple-trouble-1
 * <p>
 * Return 1 if some digit appears as a straight triple in {@code num1} and the same digit as a straight
 * double in {@code num2}, else 0. Checks each of the 10 digits with substring search: O(digits) time.
 * {@code Numbers.containsRepeatingDigits} is not reused because it does not tie the two runs to the same digit.
 */
class TripleDoubleTest {

    static int solve(final long num1, final long num2) {
        final var a = Long.toString(num1);
        final var b = Long.toString(num2);
        return IntStream.rangeClosed(0, 9)
                        .mapToObj(Integer::toString)
                        .anyMatch(d -> a.contains(d.repeat(3)) && b.contains(d.repeat(2)))
                ? 1
                : 0;
    }

    @ParameterizedTest
    @CsvSource({
        "451999277, 41177722899, 1",
        "1222345, 12345, 0",
        "12345, 12345, 0",
        "666789, 12345667, 1",
        "10560002, 100, 1",
        "111, 22, 0",
        "1112, 122, 0",
    })
    void requiresTripleAndDoubleOfTheSameDigit(final long num1, final long num2, final int expected) {
        assertThat(solve(num1, num2)).isEqualTo(expected);
    }
}
