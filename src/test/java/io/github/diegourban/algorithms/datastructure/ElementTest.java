package io.github.diegourban.algorithms.datastructure;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ElementTest {

    @Test
    void shouldEqualAnElementWithTheSameName() {
        assertThat(new Element("diego")).isEqualTo(new Element("diego"));
        assertThat(new Element("diego")).isNotEqualTo(new Element("paulo"));
    }

    @Test
    void shouldNotEqualNull() {
        assertThat(new Element("diego")).isNotEqualTo(null);
    }

    @Test
    void shouldPrintItsName() {
        assertThat(new Element("diego")).hasToString("diego");
    }

    @Test
    void shouldNotEqualAnObjectOfAnotherType() {
        assertThat(new Element("diego")).isNotEqualTo("diego");
    }

    @Test
    void shouldHashEqualElementsAlike() {
        assertThat(new Element("diego")).hasSameHashCodeAs(new Element("diego"));
        assertThat(new java.util.HashSet<>(java.util.List.of(new Element("diego"))))
                .contains(new Element("diego"));
    }
}
