package io.github.diegourban.algorithms.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxStackTest {

    @Test
    void shouldPush() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    void shouldPop() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(3);
    }

    @Test
    void shouldGetMax() {
        MaxStack stack = new MaxStack();

        stack.push(1);
        stack.push(10);
        stack.push(3);

        assertThat(stack.getMax()).isEqualTo(10);
    }
}
