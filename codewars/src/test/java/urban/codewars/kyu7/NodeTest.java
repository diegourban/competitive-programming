package urban.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NodeTest {

    @Test
    public void mustInstantiate() {
        assertNotNull(new Node());
    }

    @Test(expected = Exception.class)
    public void shouldHandleNullNode() throws Exception {
        Node.getNth(null, 0);
    }

    @Test(expected = Exception.class)
    public void shouldHandleNegativeIndex() throws Exception {
        Node.getNth(new Node(), -1);
    }

    @Test(expected = Exception.class)
    public void shouldHandleWringIndex() throws Exception {
        Node.getNth(new Node(), 1);
    }

    @Test
    public void test2Nodes() throws Exception {
        Node n = new Node();
        n.data = 1337;
        n.next = new Node();
        n.next.data = 42;
        n.next.next = new Node();
        n.next.next.data = 23;

        assertEquals(Node.getNth(n, 0), 1337);
        assertEquals(Node.getNth(n, 1), 42);
        assertEquals(Node.getNth(n, 2), 23);
    }

}
