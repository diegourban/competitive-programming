package urban.common.data_structure.queue;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertThat;

public class QueueTwoStacksTest {

    @Test(expected = NoSuchElementException.class)
    public void shouldNotDequeueEmptyQueue() {
        final QueueTwoStacks queue = new QueueTwoStacks();

        assertThat(queue.dequeue(), Matchers.is(1));
    }

    @Test
    public void shouldEnqueue() {
        final QueueTwoStacks queue = new QueueTwoStacks();
        queue.enqueue(1);

        assertThat(queue.dequeue(), Matchers.is(1));
    }

    @Test
    public void shouldDequeue() {
        final QueueTwoStacks queue = new QueueTwoStacks();
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);

        assertThat(queue.dequeue(), Matchers.is(3));
        assertThat(queue.dequeue(), Matchers.is(1));
        assertThat(queue.dequeue(), Matchers.is(4));
    }


}
