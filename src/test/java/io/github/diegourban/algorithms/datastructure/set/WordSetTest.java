package io.github.diegourban.algorithms.datastructure.set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class WordSetTest {

    @Test
    void shouldAdd() {
        final WordSet set = new WordSet();
        set.add("Diego");
        set.add("André");
        set.add("Zuleika");
        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Zuleika], [André], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldRemove() {
        final WordSet set = new WordSet();
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
        final WordSet set = new WordSet();
        set.add("Diego");
        set.add("Diego");

        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldIgnoreRemovingAMissingWord() {
        final WordSet set = new WordSet();
        set.add("Diego");
        set.remove("Daniel");

        assertThat(set)
                .hasToString(
                        "[[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [Diego], [], [], []]");
    }

    @Test
    void shouldRejectAnEmptyWord() {
        final WordSet set = new WordSet();

        assertThatIllegalArgumentException().isThrownBy(() -> set.add("")).withMessage("word must not be empty");
        assertThatIllegalArgumentException().isThrownBy(() -> set.remove("")).withMessage("word must not be empty");
    }
}
