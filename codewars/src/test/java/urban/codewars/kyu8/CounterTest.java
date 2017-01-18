package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    private final Boolean[] array1 = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false,
            true, true, true, true, true, false, false, true, true};

    @Test
    public void shouldCreateInstance() {
        Counter instance = new Counter();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testEmpty() {
        assertEquals("There are 0 sheeps in total", 0, new Counter().countSheeps(new Boolean[]{}));
    }

    @Test
    public void deveContar1True() {
        assertEquals("There are 1 sheeps in total", 1, new Counter().countSheeps(new Boolean[]{true}));
    }

    @Test
    public void deveContar1False() {
        assertEquals("There are 0 sheeps in total", 0, new Counter().countSheeps(new Boolean[]{false}));
    }

    @Test
    public void deveContarNull() {
        assertEquals("There are 0 sheeps in total", 0, new Counter().countSheeps(new Boolean[]{null}));
    }

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }

}
