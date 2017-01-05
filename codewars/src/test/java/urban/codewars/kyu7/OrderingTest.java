package urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderingTest {

    private Ordering ordering;

    @Before
    public void before() {
        this.ordering = new Ordering();
    }

    @After
    public void after() {
        this.ordering = null;
    }

    @Test
    public void shouldCreateInstance() {
        Assert.assertNotNull(ordering);
    }

    @Test
    public void deveOrdernarJaOrdenado() {
        assertEquals("ab", ordering.orderWord("ab"));
    }

    @Test
    public void deveOrdernarDesordenado() {
        assertEquals("ab", ordering.orderWord("ba"));
    }

    @Test
    public void deveOrdernarHelloWorld() {
        assertEquals(" !,HWdellloor", ordering.orderWord("Hello, World!"));
    }

    @Test
    public void deveValidarNull() {
        assertEquals("Invalid String!", ordering.orderWord(null));
    }

    @Test
    public void deveValidarVazio() {
        assertEquals("Invalid String!", ordering.orderWord(""));
    }

}
