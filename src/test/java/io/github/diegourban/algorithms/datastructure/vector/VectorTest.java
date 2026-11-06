package io.github.diegourban.algorithms.datastructure.vector;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import io.github.diegourban.algorithms.datastructure.Element;
import org.junit.jupiter.api.Test;

class VectorTest {

    @Test
    void test() {
        final Element e1 = new Element("Joao");
        final Element e2 = new Element("Jose");

        final Vector vector = new Vector();
        vector.add(e1);
        vector.add(e2);

        assertThat(vector.size()).isEqualTo(2);
        assertThat(vector.contains(e1)).isEqualTo(true);

        final Element e3 = new Element("Mario");
        vector.add(1, e3);
        assertThat(vector.contains(e3)).isEqualTo(true);
        assertThat(vector.size()).isEqualTo(3);

        vector.remove(1);

        for (int i = 0; i < 300; i++) {
            final Element e = new Element("Element " + i);
            vector.add(e);
        }
        System.out.println(vector);
    }

    @Test
    void shouldRejectAddingAtAnInvalidPosition() {
        final Vector vector = new Vector();
        vector.add(new Element("Joao"));

        assertThatIllegalArgumentException().isThrownBy(() -> vector.add(-1, new Element("Jose")));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.add(5, new Element("Jose")));
    }

    @Test
    void shouldRejectGettingAnInvalidPosition() {
        final Vector vector = new Vector();
        vector.add(new Element("Joao"));

        assertThat(vector.get(0)).isEqualTo(new Element("Joao"));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.get(1));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.get(-1));
    }

    @Test
    void shouldNotContainAMissingElement() {
        final Vector vector = new Vector();
        vector.add(new Element("Joao"));

        assertThat(vector.contains(new Element("Mario"))).isFalse();
    }

    @Test
    void shouldRemoveFromAFullVector() {
        final Vector vector = new Vector();
        for (int i = 0; i < 100; i++) {
            vector.add(new Element("Element " + i));
        }

        vector.remove(0);

        assertThat(vector.size()).isEqualTo(99);
        assertThat(vector.get(0)).isEqualTo(new Element("Element 1"));
    }

    @Test
    void shouldAddAtPositionEqualToSizeAsLast() {
        final Vector vector = new Vector();
        vector.add(new Element("Joao"));

        vector.add(1, new Element("Jose"));

        assertThat(vector.size()).isEqualTo(2);
        assertThat(vector.get(1)).isEqualTo(new Element("Jose"));
    }

    @Test
    void shouldAddAtPositionZeroOfEmptyVector() {
        final Vector vector = new Vector();

        vector.add(0, new Element("Joao"));

        assertThat(vector.size()).isEqualTo(1);
        assertThat(vector.get(0)).isEqualTo(new Element("Joao"));
    }

    @Test
    void shouldRejectRemovingAMissingPosition() {
        final Vector vector = new Vector();
        vector.add(new Element("Joao"));
        vector.add(new Element("Jose"));

        assertThatIllegalArgumentException().isThrownBy(() -> vector.remove(5));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.remove(-1));
        assertThat(vector.size()).isEqualTo(2);
    }

    @Test
    void shouldRejectRemovingFromEmptyVector() {
        final Vector vector = new Vector();

        assertThatIllegalArgumentException().isThrownBy(() -> vector.remove(0));
        assertThat(vector.size()).isZero();
    }
}
