package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.within;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SequencesTest {

    @Test
    void shouldCalculateFibonacci() {
        assertThat(Sequences.fibonacci(0)).isZero();
        assertThat(Sequences.fibonacci(1)).isOne();
        assertThat(Sequences.fibonacci(2)).isOne();
        assertThat(Sequences.fibonacci(3)).isEqualTo(2);
        assertThat(Sequences.fibonacci(4)).isEqualTo(3);
        assertThat(Sequences.fibonacci(5)).isEqualTo(5);
        assertThat(Sequences.fibonacci(11)).isEqualTo(89);
        assertThat(Sequences.fibonacci(46)).isEqualTo(1836311903);
    }

    @Test
    void shouldCalculateFibonacciWithSimpleBinetFormula() {
        assertThat(Sequences.fibonacciSimpleBinetFormula(0)).isCloseTo(0, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(1)).isCloseTo(1, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(2)).isCloseTo(1, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(3)).isCloseTo(2, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(4)).isCloseTo(3, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(5)).isCloseTo(5, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(11)).isCloseTo(89, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(50)).isCloseTo(12586269025d, within(0.1));
        assertThat(Sequences.fibonacciSimpleBinetFormula(67)).isCloseTo(44945570212853d, within(0.1));
    }

    @Test
    void shouldCalculateFibonacciWithBinetFormula() {
        assertThat(Sequences.fibonacciBinetFormula(0)).isEqualTo(new BigInteger("0"));
        assertThat(Sequences.fibonacciBinetFormula(1)).isEqualTo(new BigInteger("1"));
        assertThat(Sequences.fibonacciBinetFormula(2)).isEqualTo(new BigInteger("1"));
        assertThat(Sequences.fibonacciBinetFormula(3)).isEqualTo(new BigInteger("2"));
        assertThat(Sequences.fibonacciBinetFormula(4)).isEqualTo(new BigInteger("3"));
        assertThat(Sequences.fibonacciBinetFormula(5)).isEqualTo(new BigInteger("5"));
        assertThat(Sequences.fibonacciBinetFormula(11)).isEqualTo(new BigInteger("89"));
        assertThat(Sequences.fibonacciBinetFormula(50)).isEqualTo(new BigInteger("12586269025"));
        assertThat(Sequences.fibonacciBinetFormula(71)).isEqualTo(new BigInteger("308061521170129"));
    }

    @Test
    void shouldRejectNegativeFibonacciIndex() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Sequences.fibonacci(-1))
                .withMessage("Index was negative. No such thing as a negative index in a series.");
    }
}
