package urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ParallelResistorsTest {

    @Test
    public void shouldCreateInstance() {
        ParallelResistors instance = new ParallelResistors();
        Assert.assertNotNull(instance);
    }

    @Test
    public void resistanceTest1() {
        assertEquals(10.0, ParallelResistors.resistance(20, 20), 1e-10);
    }

    @Test
    public void resistanceTest2() {
        assertEquals(8.0, ParallelResistors.resistance(20, 20, 40), 1e-10);
    }
}
