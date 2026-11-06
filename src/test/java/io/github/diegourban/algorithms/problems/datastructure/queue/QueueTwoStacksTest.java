package io.github.diegourban.algorithms.problems.datastructure.queue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

/**
 * Queue Two Stacks — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/queue-two-stacks
 * <p>
 * Enqueue pushes onto an in-stack; dequeue pops from an out-stack, refilling it (reversing the order) from the
 * in-stack only when empty. O(1) amortised per operation: each item is moved between stacks at most once.
 */
class QueueTwoStacksTest {

    static class QueueTwoStacks {

        private final Deque<Integer> inStack = new ArrayDeque<>();
        private final Deque<Integer> outStack = new ArrayDeque<>();

        void enqueue(int item) {
            inStack.push(item);
        }

        int dequeue() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
                if (outStack.isEmpty()) {
                    throw new NoSuchElementException("Can't dequeue from empty queue!");
                }
            }
            return outStack.pop();
        }
    }

    @Test
    void dequeueOnEmptyQueueFails() {
        var queue = new QueueTwoStacks();

        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(queue::dequeue);
    }

    @Test
    void dequeuesWhatWasEnqueued() {
        var queue = new QueueTwoStacks();
        queue.enqueue(1);

        assertThat(queue.dequeue()).isEqualTo(1);
    }

    @Test
    void dequeuesInFirstInFirstOutOrder() {
        var queue = new QueueTwoStacks();
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);

        assertThat(queue.dequeue()).isEqualTo(3);
        assertThat(queue.dequeue()).isEqualTo(1);
        assertThat(queue.dequeue()).isEqualTo(4);
    }

    @Test
    void keepsOrderWhenEnqueuesAndDequeuesInterleave() {
        var queue = new QueueTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        assertThat(queue.dequeue()).isEqualTo(1);
        queue.enqueue(3);

        assertThat(queue.dequeue()).isEqualTo(2);
        assertThat(queue.dequeue()).isEqualTo(3);
    }
}
