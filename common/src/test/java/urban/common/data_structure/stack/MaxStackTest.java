package urban.common.data_structure.stack;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class MaxStackTest {

    @Test
    public void shouldPush() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        Assert.assertThat(stack.pop(), Matchers.is(1));
    }

    @Test
    public void shouldPop() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(1);
        stack.push(2);

        Assert.assertThat(stack.pop(), Matchers.is(2));
        Assert.assertThat(stack.pop(), Matchers.is(1));
        Assert.assertThat(stack.pop(), Matchers.is(3));
    }

    @Test
    public void shouldGetMax() {
        MaxStack stack = new MaxStack();

        stack.push(1);
        stack.push(10);
        stack.push(3);

        Assert.assertThat(stack.getMax(), Matchers.is(10));
    }
}
