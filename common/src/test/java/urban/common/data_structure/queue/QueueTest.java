package urban.common.data_structure.queue;

import org.junit.Test;
import urban.common.data_structure.Element;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void shouldAdd(){
        final Queue queue = new Queue();
        queue.add(new Element("diego"));
        queue.add(new Element("leonardo"));
        queue.add(new Element("urban"));

        assertEquals("[diego, leonardo, urban]", queue.toString());
    }

    @Test
    public void shouldPoll(){
        final Queue queue = new Queue();
        queue.add(new Element("diego"));
        queue.add(new Element("leonardo"));
        queue.add(new Element("urban"));
        Element removed = queue.poll();

        assertEquals("diego", removed.getName());
        assertEquals("[leonardo, urban]", queue.toString());
    }


}
