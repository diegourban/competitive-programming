package io.github.diegourban.algorithms.datastructure.vector;

import io.github.diegourban.algorithms.datastructure.Element;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

        for(int i = 0; i < 300; i++) {
            Element e = new Element("Element " + i);
            vector.add(e);
        }
        System.out.println(vector);
    }
}
