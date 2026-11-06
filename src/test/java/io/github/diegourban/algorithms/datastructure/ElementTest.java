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
        assertThat(new Element("diego").equals(null)).isFalse();
    }

    @Test
    void shouldPrintItsName() {
        assertThat(new Element("diego")).hasToString("diego");
    }
}
