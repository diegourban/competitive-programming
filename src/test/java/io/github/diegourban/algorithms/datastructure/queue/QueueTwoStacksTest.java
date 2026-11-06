package io.github.diegourban.algorithms.datastructure.queue;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class QueueTwoStacksTest {

    @Test
    void shouldNotDequeueEmptyQueue() {
        final QueueTwoStacks queue = new QueueTwoStacks();
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(queue::dequeue);
    }

    @Test
    void shouldEnqueue() {
        final QueueTwoStacks queue = new QueueTwoStacks();
        queue.enqueue(1);

        assertThat(queue.dequeue()).isEqualTo(1);
    }

    @Test
    void shouldDequeue() {
        final QueueTwoStacks queue = new QueueTwoStacks();
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);

        assertThat(queue.dequeue()).isEqualTo(3);
        assertThat(queue.dequeue()).isEqualTo(1);
        assertThat(queue.dequeue()).isEqualTo(4);
    }


}
