package io.github.diegourban.algorithms.datastructure.stack;

import io.github.diegourban.algorithms.datastructure.Element;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackTest {

    @Test
    void shouldPush() {
        Stack stack = new Stack();
        stack.push(new Element("diego"));
        stack.push(new Element("leonardo"));
        stack.push(new Element("urban"));

        assertThat(stack).hasToString("[diego, leonardo, urban]");
    }

    @Test
    void shouldRemove() {
        Stack stack = new Stack();
        stack.push(new Element("diego"));
        stack.push(new Element("leonardo"));
        stack.push(new Element("urban"));
        Element pop = stack.pop();

        assertThat(pop.getName()).isEqualTo("urban");
        assertThat(stack).hasToString("[diego, leonardo]");
    }

    @Test
    void shouldHandleIsEmpty() {
        Stack stack = new Stack();
        assertThat(stack.empty()).isTrue();
        stack.push(new Element("diego"));
        stack.push(new Element("leonardo"));
        stack.push(new Element("urban"));
        assertThat(stack.empty()).isFalse();
    }
}
