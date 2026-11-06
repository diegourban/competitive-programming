package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.within;

import org.junit.jupiter.api.Test;

class StatisticsTest {

    @Test
    void shouldCalculateMean() {
        assertThat(Statistics.mean(new double[] {})).isCloseTo(0.0, within(0.1));
        assertThat(Statistics.mean(new double[] {1})).isCloseTo(1.0, within(0.1));
        assertThat(Statistics.mean(new double[] {1, 0})).isCloseTo(0.5, within(0.1));
        assertThat(Statistics.mean(new double[] {3, 2, 1})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.mean(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))
                .isCloseTo(5.5, within(0.1));
        assertThat(Statistics.mean(new double[] {2, 2, 3, 4, 14})).isCloseTo(5.0, within(0.1));
    }

    @Test
    void shouldCalculateMedian() {
        assertThat(Statistics.median(new double[] {1})).isCloseTo(1.0, within(0.1));
        assertThat(Statistics.median(new double[] {1, 0})).isCloseTo(0.5, within(0.1));
        assertThat(Statistics.median(new double[] {3, 2, 1})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new double[] {1, 2, 3})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new double[] {2, 1, 3})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new double[] {3, 1, 2})).isCloseTo(2.0, within(0.1));
        assertThat(Statistics.median(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))
                .isCloseTo(5.5, within(0.1));
        assertThat(Statistics.median(new double[] {2, 2, 3, 4, 14})).isCloseTo(3.0, within(0.1));
    }

    @Test
    void shouldCalculateMode() {
        assertThat(Statistics.mode(new double[] {1})).isEqualTo(1.0);
        assertThat(Statistics.mode(new double[] {1, 0, 1})).isEqualTo(1.0);
        assertThat(Statistics.mode(new double[] {1, 2, 2, 3, 3, 3, 4, 4, 5, 4, 4}))
                .isEqualTo(4.0);
        assertThat(Statistics.mode(new double[] {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 4, 4, 5}))
                .isEqualTo(5.0);
        assertThat(Statistics.mode(new double[] {2, 2, 3, 4, 14})).isEqualTo(2.0);
    }

    @Test
    void shouldCalculateAverageAbsoluteDeviation() {
        assertThat(Statistics.meanAbsoluteDeviation(new double[] {2, 2, 3, 4, 14}))
                .isCloseTo(3.6, within(0.1));
    }

    @Test
    void shouldRejectEmptyDataForMedianAndDeviation() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Statistics.median(new double[] {}))
                .withMessage("data must not be empty");
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Statistics.meanAbsoluteDeviation(new double[] {}))
                .withMessage("data must not be empty");
    }
}
