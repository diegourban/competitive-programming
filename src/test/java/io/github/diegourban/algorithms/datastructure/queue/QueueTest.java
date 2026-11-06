package io.github.diegourban.algorithms.datastructure.queue;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.datastructure.Element;
import org.junit.jupiter.api.Test;

class QueueTest {

    @Test
    void shouldAdd() {
        final Queue queue = new Queue();
        queue.add(new Element("diego"));
        queue.add(new Element("leonardo"));
        queue.add(new Element("urban"));

        assertThat(queue).hasToString("[diego, leonardo, urban]");
    }

    @Test
    void shouldPoll() {
        final Queue queue = new Queue();
        queue.add(new Element("diego"));
        queue.add(new Element("leonardo"));
        queue.add(new Element("urban"));
        Element removed = queue.poll();

        assertThat(removed.getName()).isEqualTo("diego");
        assertThat(queue).hasToString("[leonardo, urban]");
    }
}
