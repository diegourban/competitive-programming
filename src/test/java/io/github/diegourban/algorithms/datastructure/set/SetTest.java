package io.github.diegourban.algorithms.datastructure.set;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SetTest {

    @Test
    void shouldAdd() {
        final Set set = new Set();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldRemove() {
        final Set set = new Set();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]");
        set.remove("André");
        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldIgnoreDuplicates() {
        final Set set = new Set();
        set.add("Diego");
        set.add("Diego");

        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldIgnoreRemovingAMissingWord() {
        final Set set = new Set();
        set.add("Diego");
        set.remove("Daniel");

        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Diego], [], [], []]");
    }
}
