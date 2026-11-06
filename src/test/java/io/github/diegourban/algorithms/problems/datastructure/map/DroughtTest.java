package io.github.diegourban.algorithms.problems.datastructure.map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Drought — beecrowd (formerly URI Online Judge) 1023.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1023
 * <p>
 * Group residents by per-capita consumption (integer division) in a sorted map, and compute the
 * city-wide average truncated to two decimals with exact arithmetic. O(n log n) per city.
 */
class DroughtTest {

    record Property(int residents, int consumption) {}

    /**
     * @param residentsByConsumption residents per per-capita consumption, ascending by consumption
     * @param averageConsumption     total consumption over total residents, truncated to 2 decimals
     */
    record City(SortedMap<Integer, Integer> residentsByConsumption, BigDecimal averageConsumption) {}

    static City solve(final List<Property> properties) {
        final var residentsByConsumption = new TreeMap<Integer, Integer>();
        var totalResidents = 0L;
        var totalConsumption = 0L;
        for (final var property : properties) {
            totalResidents += property.residents();
            totalConsumption += property.consumption();
            residentsByConsumption.merge(
                    property.consumption() / property.residents(), property.residents(), Integer::sum);
        }
        final var average =
                BigDecimal.valueOf(totalConsumption).divide(BigDecimal.valueOf(totalResidents), 2, RoundingMode.DOWN);
        return new City(residentsByConsumption, average);
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var cities = new ArrayList<String>();
        for (var n = reader.nextInt(); n != 0; n = reader.nextInt()) {
            final var properties = new ArrayList<Property>(n);
            for (var i = 0; i < n; i++) {
                properties.add(new Property(reader.nextInt(), reader.nextInt()));
            }
            final var city = solve(properties);
            final var groups = city.residentsByConsumption().entrySet().stream()
                    .map(e -> e.getValue() + "-" + e.getKey())
                    .collect(Collectors.joining(" "));
            cities.add("""
                    Cidade# %d:
                    %s
                    Consumo medio: %s m3.
                    """.formatted(
                            cities.size() + 1, groups, city.averageConsumption().toPlainString()));
        }
        return String.join("\n", cities);
    }

    @Test
    void groupsResidentsByPerCapitaConsumption() {
        final var city = solve(List.of(new Property(3, 22), new Property(2, 11), new Property(3, 39)));

        assertThat(city.residentsByConsumption()).containsExactly(entry(5, 2), entry(7, 3), entry(13, 3));
        assertThat(city.averageConsumption()).isEqualByComparingTo("9.00");
    }

    @Test
    void mergesPropertiesWithSamePerCapitaConsumption() {
        final var city = solve(List.of(new Property(1, 10), new Property(2, 20), new Property(3, 30)));

        assertThat(city.residentsByConsumption()).containsExactly(entry(10, 6));
    }

    @Test
    void truncatesAverageInsteadOfRounding() {
        final var city = solve(List.of(
                new Property(1, 25),
                new Property(2, 20),
                new Property(3, 31),
                new Property(2, 40),
                new Property(6, 70)));

        // 186 / 14 = 13.2857...
        assertThat(city.averageConsumption()).isEqualByComparingTo("13.28");
    }

    @Test
    void keepsTrailingZeroOfExactAverage() {
        final var city = solve(List.of(new Property(10, 156)));

        assertThat(city.averageConsumption().toPlainString()).isEqualTo("15.60");
        assertThat(city.residentsByConsumption()).containsExactly(Map.entry(15, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(final String name) throws IOException {
        final var samples = new SampleLoader("problems/datastructure/map/drought");
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(samples.loadAsString(name + ".out"));
    }
}
