package io.github.diegourban.algorithms.problems.recursion;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * Recursive String Permutations — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/recursive-string-permutations
 * <p>
 * Recursively permute all characters but the last, then insert the last character at every position of each of
 * those permutations. O(n * n!) time and space.
 */
class RecursiveStringPermutationsTest {

    static Set<String> solve(String input) {
        if (input.length() <= 1) {
            return Set.of(input);
        }
        var allButLast = input.substring(0, input.length() - 1);
        var last = input.charAt(input.length() - 1);
        var permutations = new HashSet<String>();
        for (var partial : solve(allButLast)) {
            for (var position = 0; position <= allButLast.length(); position++) {
                permutations.add(partial.substring(0, position) + last + partial.substring(position));
            }
        }
        return permutations;
    }

    @Test
    void findsAllPermutationsOfThreeCharacters() {
        assertThat(solve("ABC")).containsExactlyInAnyOrder("ABC", "CAB", "BAC", "ACB", "BCA", "CBA");
    }
}
