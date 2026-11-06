package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import net.jqwik.api.ForAll;
import net.jqwik.api.GenerationMode;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

/**
 * Checks each Fibonacci variant against an exact reference, over the range its Javadoc says it supports.
 */
class SequencesPropertyTest {

    @Property(generation = GenerationMode.EXHAUSTIVE)
    void fibonacciIsExactUpTo46(@ForAll @IntRange(min = 0, max = 46) int n) {
        assertThat(BigInteger.valueOf(Sequences.fibonacci(n))).isEqualTo(exactFibonacci(n));
    }

    @Property(generation = GenerationMode.EXHAUSTIVE)
    void simpleBinetFormulaRoundsToTheExactValueUpTo67(@ForAll @IntRange(min = 0, max = 67) int n) {
        assertThat(BigInteger.valueOf(Math.round(Sequences.fibonacciSimpleBinetFormula(n))))
                .isEqualTo(exactFibonacci(n));
    }

    @Property(generation = GenerationMode.EXHAUSTIVE)
    void binetFormulaIsExactUpTo71(@ForAll @IntRange(min = 0, max = 71) int n) {
        assertThat(Sequences.fibonacciBinetFormula(n)).isEqualTo(exactFibonacci(n));
    }

    private static BigInteger exactFibonacci(int n) {
        var previous = BigInteger.ZERO;
        var current = BigInteger.ONE;
        for (var i = 0; i < n; i++) {
            var next = previous.add(current);
            previous = current;
            current = next;
        }
        return previous;
    }
}
