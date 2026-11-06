package io.github.diegourban.algorithms.datastructure.vector;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import io.github.diegourban.algorithms.datastructure.Element;
import org.junit.jupiter.api.Test;

class VectorTest {

    @Test
    void test() {
        Element e1 = new Element("Joao");
        Element e2 = new Element("Jose");

        Vector vector = new Vector();
        vector.add(e1);
        vector.add(e2);

        assertThat(vector.size()).isEqualTo(2);
        assertThat(vector.contains(e1)).isEqualTo(true);

        Element e3 = new Element("Mario");
        vector.add(1, e3);
        assertThat(vector.contains(e3)).isEqualTo(true);
        assertThat(vector.size()).isEqualTo(3);

        vector.remove(1);

        for (int i = 0; i < 300; i++) {
            Element e = new Element("Element " + i);
            vector.add(e);
        }
        System.out.println(vector);
    }

    @Test
    void shouldRejectAddingAtAnInvalidPosition() {
        Vector vector = new Vector();
        vector.add(new Element("Joao"));

        assertThatIllegalArgumentException().isThrownBy(() -> vector.add(-1, new Element("Jose")));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.add(5, new Element("Jose")));
    }

    @Test
    void shouldRejectGettingAnInvalidPosition() {
        Vector vector = new Vector();
        vector.add(new Element("Joao"));

        assertThat(vector.get(0)).isEqualTo(new Element("Joao"));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.get(1));
        assertThatIllegalArgumentException().isThrownBy(() -> vector.get(-1));
    }

    @Test
    void shouldNotContainAMissingElement() {
        Vector vector = new Vector();
        vector.add(new Element("Joao"));

        assertThat(vector.contains(new Element("Mario"))).isFalse();
    }

    @Test
    void shouldRemoveFromAFullVector() {
        Vector vector = new Vector();
        for (int i = 0; i < 100; i++) {
            vector.add(new Element("Element " + i));
        }

        vector.remove(0);

        assertThat(vector.size()).isEqualTo(99);
        assertThat(vector.get(0)).isEqualTo(new Element("Element 1"));
    }
}
