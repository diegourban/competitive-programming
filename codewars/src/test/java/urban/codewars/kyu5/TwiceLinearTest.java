package urban.codewars.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TwiceLinearTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new TwiceLinear());
    }

    @Test
    public void basicTestes() {
        assertEquals(22, TwiceLinear.dblLinear(10));
        assertEquals(57, TwiceLinear.dblLinear(20));
        assertEquals(91, TwiceLinear.dblLinear(30));
        assertEquals(175, TwiceLinear.dblLinear(50));
    }

    @Test
    public void advancedTestes() {
        assertEquals(447, TwiceLinear.dblLinear(100));
        assertEquals(80914, TwiceLinear.dblLinear(6000));
        assertEquals(1511311, TwiceLinear.dblLinear(60000)); // Process was terminated. It took longer than 11000ms to complete
    }
}
