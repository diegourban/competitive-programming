package urban.common.data_structure.linkedlist;

import org.junit.Test;
import urban.common.data_structure.Element;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void shouldAddAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtStart(new Element("diego"));
        linkedList.addAtStart(new Element("paulo"));
        linkedList.addAtStart(new Element("josé"));

        assertEquals("josé", linkedList.get(0).getName());
        assertEquals("paulo", linkedList.get(1).getName());
        assertEquals("diego", linkedList.get(2).getName());
    }

    @Test
    public void shouldAddAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));

        assertEquals("diego", linkedList.get(0).getName());
        assertEquals("paulo", linkedList.get(1).getName());
        assertEquals("josé", linkedList.get(2).getName());
    }

    @Test
    public void shouldAddAtTheMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.add(1, new Element("josé"));

        assertEquals("diego", linkedList.get(0).getName());
        assertEquals("josé", linkedList.get(1).getName());
        assertEquals("paulo", linkedList.get(2).getName());
    }

    @Test
    public void shouldShowSize() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.add(1, new Element("josé"));

        assertEquals(3, linkedList.size());
    }

    @Test
    public void shouldRemoveFromStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("diego"));
        linkedList.addAtEnd(new Element("paulo"));
        linkedList.addAtEnd(new Element("josé"));
        linkedList.removeFromStart();

        assertEquals(2, linkedList.size());
        assertEquals("paulo", linkedList.get(0).getName());
        assertEquals("josé", linkedList.get(1).getName());
    }
}
