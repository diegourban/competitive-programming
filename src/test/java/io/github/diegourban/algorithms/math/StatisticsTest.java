package io.github.diegourban.algorithms.math;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class StatisticsTest {

    @Test
    void shouldCreateInstance() {
        assertThat(new Statistics()).isNotNull();
    }

    @Test
    void shouldCalculateMean() {
        assertThat(Statistics.mean(new int[]{})).isCloseTo(0.0, within(0.1));
        assertThat(Statistics.mean(new int[]{1})).isCloseTo(1.0, within(0.1));
        assertThat(Statistics.mean(new int[]{1, 0})).isCloseTo(0.5, within(0.1));
        assertThat(Statistics.mean(new int[]{3, 2, 1})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.mean(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isCloseTo(5.5, within(0.1));
        assertThat(Statistics.mean(new int[]{2, 2, 3, 4, 14})).isCloseTo(5.0, within(0.1));
    }

    @Test
    void shouldCalculateMedian() {
        assertThat(Statistics.median(new int[]{1})).isCloseTo(1.0, within(0.1));
        assertThat(Statistics.median(new int[]{1, 0})).isCloseTo(0.5, within(0.1));
        assertThat(Statistics.median(new int[]{3, 2, 1})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new int[]{1, 2, 3})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new int[]{2, 1, 3})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new int[]{3, 1, 2})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isCloseTo(5.5, within(0.1));
        assertThat(Statistics.median(new int[]{2, 2, 3, 4, 14})).isCloseTo(3.0, within(0.1));
    }

    @Test
    void shouldCalculateMode() {
        assertThat(Statistics.mode(new int[]{1})).isOne();
        assertThat(Statistics.mode(new int[]{1, 0, 1})).isOne();
        assertThat(Statistics.mode(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5, 4, 4})).isEqualTo(4);
        assertThat(Statistics.mode(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 4, 4, 5})).isEqualTo(5);
        assertThat(Statistics.mode(new int[]{2, 2, 3, 4, 14})).isEqualTo(2);
    }

    @Test
    void shouldCalculateAverageAbsoluteDeviation() {
        assertThat(Statistics.meanAbsoluteDeviation(new int[]{2, 2, 3, 4, 14})).isCloseTo(3.6, within(0.1));
    }
}
