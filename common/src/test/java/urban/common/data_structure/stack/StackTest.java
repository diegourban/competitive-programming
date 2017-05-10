package urban.common.data_structure.stack;

import org.junit.Test;
import urban.common.data_structure.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void shouldPush() {
        Stack stack = new Stack();
        stack.push(new Element("diego"));
        stack.push(new Element("leonardo"));
        stack.push(new Element("urban"));

        assertEquals("[diego, leonardo, urban]", stack.toString());
    }

    @Test
    public void shouldRemove() {
        Stack stack = new Stack();
        stack.push(new Element("diego"));
        stack.push(new Element("leonardo"));
        stack.push(new Element("urban"));
        Element pop = stack.pop();

        assertEquals("urban", pop.getName());
        assertEquals("[diego, leonardo]", stack.toString());
    }

    @Test
    public void shouldHandleIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.empty());
        stack.push(new Element("diego"));
        stack.push(new Element("leonardo"));
        stack.push(new Element("urban"));
        assertFalse(stack.empty());
    }
}
