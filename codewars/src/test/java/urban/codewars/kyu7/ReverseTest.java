package urban.codewars.kyu7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void shouldCreateInstance() {
        Reverse instance = new Reverse();
        Assert.assertNotNull(instance);
    }

    @Test
    public void shouldHandleNullString() {
        Reverse instance = new Reverse();
        assertEquals(null, instance.reverse(null));
    }

    @Test
    public void shouldHandleEmptyString() {
        Reverse instance = new Reverse();
        assertEquals("", instance.reverse(""));
    }

    @Test
    public void shouldHandleOneChar() {
        Reverse instance = new Reverse();
        assertEquals("a", instance.reverse("a"));
    }

    @Test
    public void testBasicTrue() {
        Reverse instance = new Reverse();
        assertEquals("etset", instance.reverse("teste"));
    }
}
