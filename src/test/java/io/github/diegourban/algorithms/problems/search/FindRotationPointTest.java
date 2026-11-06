package io.github.diegourban.algorithms.problems.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Find Rotation Point — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/find-rotation-point
 * <p>
 * Binary search against the first word: go right while the guess sorts at or after it, left otherwise, until floor
 * and ceiling are adjacent; the ceiling is then the alphabetically first word. O(lg n) time, O(1) space.
 */
class FindRotationPointTest {

    static int solve(String[] words) {
        var firstWord = words[0];
        if (firstWord.compareTo(words[words.length - 1]) <= 0) {
            return 0; // not rotated (or a single word): the first word is already the earliest
        }
        var floorIndex = 0;
        var ceilingIndex = words.length - 1;
        while (floorIndex + 1 < ceilingIndex) {
            var guessIndex = floorIndex + (ceilingIndex - floorIndex) / 2;
            if (words[guessIndex].compareTo(firstWord) >= 0) {
                floorIndex = guessIndex;
            } else {
                ceilingIndex = guessIndex;
            }
        }
        return ceilingIndex;
    }

    @Test
    void findsRotationPointInSingleLetterWords() {
        assertThat(solve(new String[]{"k", "v", "a", "b", "c", "d", "e", "g", "i"})).isEqualTo(2);
    }

    @Test
    void findsRotationPointInDictionaryWords() {
        assertThat(solve(new String[]{
                "ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
                "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"
        })).isEqualTo(5);
    }

    @Test
    void findsRotationPointRightAfterTheFirstWord() {
        assertThat(solve(new String[]{"z", "a", "b", "c", "d"})).isOne();
    }

    @Test
    void unrotatedListStartsAtZero() {
        assertThat(solve(new String[]{"a", "b", "c", "d"})).isZero();
    }

    @Test
    void singleWordStartsAtZero() {
        assertThat(solve(new String[]{"a"})).isZero();
    }

    @Test
    void findsRotationPointAtTheEnd() {
        assertThat(solve(new String[]{"b", "c", "d", "a"})).isEqualTo(3);
    }
}
