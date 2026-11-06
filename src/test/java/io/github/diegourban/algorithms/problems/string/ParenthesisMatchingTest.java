package io.github.diegourban.algorithms.problems.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * Parenthesis Matching — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/matching-parens
 * <p>
 * Scan right of the opener counting nested openers; the first closer seen with no nested opener left is the match.
 * O(n) time, O(1) space.
 */
class ParenthesisMatchingTest {

    static int solve(String sentence, int openingParenthesisIndex) {
        var openNested = 0;
        for (var position = openingParenthesisIndex + 1; position < sentence.length(); position++) {
            switch (sentence.charAt(position)) {
                case '(' -> openNested++;
                case ')' -> {
                    if (openNested == 0) {
                        return position;
                    }
                    openNested--;
                }
                default -> { }
            }
        }
        throw new IllegalArgumentException("No closing parenthesis :(");
    }

    @Test
    void findsAdjacentClosingParenthesis() {
        assertThat(solve("()", 0)).isOne();
    }

    @Test
    void skipsNestedPairs() {
        assertThat(solve("(())", 0)).isEqualTo(3);
        assertThat(solve("a(b(c)d)e", 1)).isEqualTo(7);
    }

    @Test
    void rejectsUnclosedParenthesis() {
        assertThatIllegalArgumentException().isThrownBy(() -> solve("a(bc", 1));
    }
}
