package io.github.diegourban.algorithms.datastructure.set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SetTest {

    @Test
    void shouldAdd() {
        Set set = new Set();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertThat(set).hasToString("[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldRemove() {
        Set set = new Set();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertThat(set).hasToString("[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]");
        set.remove("André");
        assertThat(set).hasToString("[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [], [], [], [Diego], [], [], []]");
    }
}
