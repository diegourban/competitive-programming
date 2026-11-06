package io.github.diegourban.algorithms.math;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {

    @Test
    void shouldCreateInstance() {
        assertThat(new Numbers()).isNotNull();
    }

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
        assertThat(Numbers.toArray(123)).containsExactly(new int[]{3, 2, 1});
        assertThat(Numbers.toArray(321)).containsExactly(new int[]{1, 2, 3});
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
}
