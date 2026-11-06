package io.github.diegourban.algorithms.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class MeasurementTest {

    @Test
    void shouldConvertMilesToKilometers() {
        assertThat(Measurement.milesToKilometers(1)).isCloseTo(1.609344, within(0.1));
        assertThat(Measurement.milesToKilometers(2)).isCloseTo(3.218688, within(0.1));
    }

    @Test
    void shouldConvertKilometersToMiles() {
        assertThat(Measurement.kilometersToMiles(1)).isCloseTo(0.621371, within(0.1));
        assertThat(Measurement.kilometersToMiles(2)).isCloseTo(1.242742, within(0.1));
    }
}
