package io.github.diegourban.algorithms.problems.datastructure.stack;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayDeque;
import java.util.Deque;
import org.junit.jupiter.api.Test;

/**
 * Largest Stack — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/largest-stack
 * <p>
 * Keep a second stack of maxima: push onto it when the item is {@code >=} the current max, pop from it when the
 * popped item equals the current max. O(1) time for push, pop and getMax; O(m) extra space for m operations.
 */
class LargestStackTest {

    static class MaxStack {

        private final Deque<Integer> stack = new ArrayDeque<>();
        private final Deque<Integer> maxesStack = new ArrayDeque<>();

        void push(final int item) {
            stack.push(item);
            if (maxesStack.isEmpty() || item >= maxesStack.peek()) {
                maxesStack.push(item);
            }
        }

        int pop() {
            final int item = stack.pop();
            if (item == maxesStack.peek()) {
                maxesStack.pop();
            }
            return item;
        }

        int getMax() {
            return maxesStack.peek();
        }
    }

    @Test
    void popsWhatWasPushed() {
        final var stack = new MaxStack();
        stack.push(1);

        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    void popsInLastInFirstOutOrder() {
        final var stack = new MaxStack();
        stack.push(3);
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(3);
    }

    @Test
    void getMaxReturnsTheLargestItem() {
        final var stack = new MaxStack();
        stack.push(1);
        stack.push(10);
        stack.push(3);

        assertThat(stack.getMax()).isEqualTo(10);
    }

    @Test
    void getMaxTracksPopsIncludingDuplicateMaxima() {
        final var stack = new MaxStack();
        stack.push(5);
        stack.push(7);
        stack.push(7);

        stack.pop();
        assertThat(stack.getMax()).isEqualTo(7);
        stack.pop();
        assertThat(stack.getMax()).isEqualTo(5);
    }
}
