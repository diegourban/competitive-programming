package io.github.diegourban.algorithms.problems.datastructure.stack;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Parenthesis Balance I — beecrowd (formerly URI Online Judge) 1068.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1068
 * <p>
 * With a single bracket type the stack degenerates to a depth counter: it must never go negative and
 * must end at zero. O(n) time, O(1) space.
 */
class ParenthesisBalanceTest {

    static boolean solve(String expression) {
        var depth = 0;
        for (var c : expression.toCharArray()) {
            switch (c) {
                case '(' -> depth++;
                case ')' -> {
                    if (--depth < 0) {
                        return false;
                    }
                }
                default -> { }
            }
        }
        return depth == 0;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var out = new StringBuilder();
        try {
            for (var line = reader.readLine(); !line.isEmpty(); line = reader.readLine()) {
                out.append(solve(line) ? "correct" : "incorrect").append('\n');
            }
        } catch (EOFException endOfInput) {
            // the last line had no trailing newline
        }
        return out.toString();
    }

    @Test
    void balancedExpressionsAreCorrect() {
        assertThat(solve("a+(b*c)-2-a")).isTrue();
        assertThat(solve("(a+b*(2-c)-2+a)*2")).isTrue();
        assertThat(solve("()")).isTrue();
    }

    @Test
    void expressionWithoutParenthesesIsCorrect() {
        assertThat(solve("a+b")).isTrue();
    }

    @Test
    void unclosedParenthesisIsIncorrect() {
        assertThat(solve("(a*b-(2+c)")).isFalse();
        assertThat(solve("(")).isFalse();
    }

    @Test
    void closingBeforeOpeningIsIncorrect() {
        assertThat(solve("2*(3-a))")).isFalse();
        assertThat(solve(")3+b*(2-c)(")).isFalse();
        assertThat(solve(")(")).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(String name) throws IOException {
        var samples = new SampleLoader("problems/datastructure/stack/parenthesis-balance");
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(samples.loadAsString(name + ".out"));
    }
}
