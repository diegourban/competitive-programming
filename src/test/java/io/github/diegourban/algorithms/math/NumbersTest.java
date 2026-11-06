package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void shouldHandleContainsDigit() {
        assertThat(Numbers.containsDigit(124, 4)).isTrue();
        assertThat(Numbers.containsDigit(124, 3)).isFalse();
        assertThat(Numbers.containsDigit(-417, 7)).isTrue();
    }

    @Test
    void shouldHandleContainsRepatingDigit() {
        assertThat(Numbers.containsRepeatingDigits(12334, 2)).isTrue();
        assertThat(Numbers.containsRepeatingDigits(11223344, 3)).isFalse();
    }

    @Test
    void shouldConvertNumberToArray() {
        assertThat(Numbers.toReversedDigits(123)).containsExactly(new int[] {3, 2, 1});
        assertThat(Numbers.toReversedDigits(321)).containsExactly(new int[] {1, 2, 3});
    }

    @Test
    void shouldCalculateNumberLength() {
        assertThat(Numbers.digitCount(1)).isEqualTo(1);
        assertThat(Numbers.digitCount(12)).isEqualTo(2);
        assertThat(Numbers.digitCount(123)).isEqualTo(3);
        assertThat(Numbers.digitCount(1234)).isEqualTo(4);
        assertThat(Numbers.digitCount(12345)).isEqualTo(5);
        assertThat(Numbers.digitCount(123456)).isEqualTo(6);
        assertThat(Numbers.digitCount(1234567)).isEqualTo(7);
        assertThat(Numbers.digitCount(12345678)).isEqualTo(8);
        assertThat(Numbers.digitCount(123456789)).isEqualTo(9);
        assertThat(Numbers.digitCount(1234567890)).isEqualTo(10);
    }

    @Test
    void shouldSplitNumbersBeyondTheIntRangeIntoDigits() {
        assertThat(Numbers.toReversedDigits(12345678901L)).containsExactly(1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertThat(Numbers.toReversedDigits(Long.MAX_VALUE)).hasSize(19).startsWith(7, 0, 8);
    }

    @Test
    void shouldSplitNegativeNumbersIntoTheDigitsOfTheirAbsoluteValue() {
        assertThat(Numbers.toReversedDigits(-12)).containsExactly(2, 1);
        assertThat(Numbers.toReversedDigits(Long.MIN_VALUE)).hasSize(19).startsWith(8, 0, 8);
    }

    @Test
    void shouldFindDigitZeroInZero() {
        assertThat(Numbers.containsDigit(0, 0)).isTrue();
        assertThat(Numbers.containsDigit(0, 1)).isFalse();
    }

    @Test
    void shouldCountDigitsOfNegativeNumbers() {
        assertThat(Numbers.digitCount(-123)).isEqualTo(3);
        assertThat(Numbers.digitCount(-7)).isEqualTo(1);
        assertThat(Numbers.digitCount(Integer.MIN_VALUE)).isEqualTo(10);
    }
}
