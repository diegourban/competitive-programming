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
        assertThat(Numbers.toArray(123)).containsExactly(new int[] {3, 2, 1});
        assertThat(Numbers.toArray(321)).containsExactly(new int[] {1, 2, 3});
    }

    @Test
    void shouldCalculateNumberLength() {
        assertThat(Numbers.length(1)).isEqualTo(1);
        assertThat(Numbers.length(12)).isEqualTo(2);
        assertThat(Numbers.length(123)).isEqualTo(3);
        assertThat(Numbers.length(1234)).isEqualTo(4);
        assertThat(Numbers.length(12345)).isEqualTo(5);
        assertThat(Numbers.length(123456)).isEqualTo(6);
        assertThat(Numbers.length(1234567)).isEqualTo(7);
        assertThat(Numbers.length(12345678)).isEqualTo(8);
        assertThat(Numbers.length(123456789)).isEqualTo(9);
        assertThat(Numbers.length(1234567890)).isEqualTo(10);
    }

    @Test
    void shouldSplitNumbersBeyondTheIntRangeIntoDigits() {
        assertThat(Numbers.toArray(12345678901L)).containsExactly(1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertThat(Numbers.toArray(Long.MAX_VALUE)).hasSize(19).startsWith(7, 0, 8);
    }

    @Test
    void shouldSplitNegativeNumbersIntoTheDigitsOfTheirAbsoluteValue() {
        assertThat(Numbers.toArray(-12)).containsExactly(2, 1);
        assertThat(Numbers.toArray(Long.MIN_VALUE)).hasSize(19).startsWith(8, 0, 8);
    }

    @Test
    void shouldFindDigitZeroInZero() {
        assertThat(Numbers.containsDigit(0, 0)).isTrue();
        assertThat(Numbers.containsDigit(0, 1)).isFalse();
    }

    @Test
    void shouldCountDigitsOfNegativeNumbers() {
        assertThat(Numbers.length(-123)).isEqualTo(3);
        assertThat(Numbers.length(-7)).isEqualTo(1);
        assertThat(Numbers.length(Integer.MIN_VALUE)).isEqualTo(10);
    }
}
