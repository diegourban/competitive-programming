package urban.codewars.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SumOfDividedTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new SumOfDivided());
    }

    @Test
    public void testOne() {
        int[] lst = new int[]{12, 15};
        assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(lst));
    }

    @Test
    public void testTwo() {
        int[] lst = new int[]{15, 30, -45};
        assertEquals("(2 30)(3 0)(5 0)", SumOfDivided.sumOfDivided(lst));
    }
}
