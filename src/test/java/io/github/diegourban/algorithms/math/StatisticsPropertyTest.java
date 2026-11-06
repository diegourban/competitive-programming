package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.util.Arrays;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Size;

class StatisticsPropertyTest {

    @Property
    void meanLiesBetweenMinAndMax(
            @ForAll @Size(min = 1, max = 50) final List<@DoubleRange(min = -1e6, max = 1e6) Double> values) {
        final var data = values.stream().mapToDouble(Double::doubleValue).toArray();
        final var min = Arrays.stream(data).min().orElseThrow();
        final var max = Arrays.stream(data).max().orElseThrow();

        assertThat(Statistics.mean(data)).isBetween(min - 1e-6, max + 1e-6);
    }

    @Property
    void medianIsTheMiddleOfTheSortedData(
            @ForAll @Size(min = 1, max = 50) final List<@DoubleRange(min = -1e6, max = 1e6) Double> values) {
        final var data = values.stream().mapToDouble(Double::doubleValue).toArray();
        final var sorted = data.clone();
        Arrays.sort(sorted);
        final var middle = sorted.length / 2;
        final var expected = sorted.length % 2 == 1 ? sorted[middle] : (sorted[middle - 1] + sorted[middle]) / 2.0;

        assertThat(Statistics.median(data.clone())).isCloseTo(expected, within(1e-9));
    }

    @Property
    void modeIsOneOfTheValues(
            @ForAll @Size(min = 1, max = 50) final List<@DoubleRange(min = -5, max = 5) Double> values) {
        final var data = values.stream().mapToDouble(Double::doubleValue).toArray();
        final var rounded = Arrays.stream(data).map(Math::rint).toArray(); // few distinct values, so repeats are likely

        assertThat(rounded).contains(Statistics.mode(rounded));
    }
}
