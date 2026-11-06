package io.github.diegourban.algorithms.problems.datastructure.stack;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayDeque;
import org.junit.jupiter.api.Test;

/**
 * Bracket Validator — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/bracket-validator
 * <p>
 * Push each opener on a stack; every closer must match the most recent unclosed opener, and the stack must be empty
 * at the end. O(n) time, O(n) space.
 */
class BracketValidatorTest {

    static boolean solve(String code) {
        var openers = new ArrayDeque<Character>();
        for (var c : code.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> openers.push(c);
                case ')', ']', '}' -> {
                    if (openers.isEmpty() || closerFor(openers.pop()) != c) {
                        return false;
                    }
                }
                default -> {}
            }
        }
        return openers.isEmpty();
    }

    private static char closerFor(char opener) {
        return switch (opener) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> throw new IllegalArgumentException("Not an opener: " + opener);
        };
    }

    @Test
    void properlyNestedBracketsAreValid() {
        assertThat(solve("{[]()}")).isTrue();
    }

    @Test
    void interleavedBracketsAreInvalid() {
        assertThat(solve("{[(])}")).isFalse();
    }

    @Test
    void mismatchedCloserIsInvalid() {
        assertThat(solve("{[}")).isFalse();
    }
}
