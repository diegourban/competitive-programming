package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleTypeTest {

    @ParameterizedTest
    @CsvSource({"EQUILATERAL, Equilatero", "ISOSCELES, Isoceles", "ESCALENE, Escaleno"})
    void exposesDisplayName(final TriangleType type, final String expectedName) {
        assertThat(type.getName()).isEqualTo(expectedName);
    }
}
