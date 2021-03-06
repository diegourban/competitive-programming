package urban.codewars.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CommonDenominatorsTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new CommonDenominators());
    }

    @Test
    public void testEmptyArray() {
        long[][] lst = new long[][]{};
        assertEquals("", CommonDenominators.convertFrac(lst));
    }

    @Test
    public void simpleTest() {
        assertEquals("(6,12)(4,12)(3,12)", CommonDenominators.convertFrac(new long[][]{{1, 2}, {1, 3}, {1, 4}}));
    }

    @Test
    public void advancedTest() {
        assertEquals("(262,34060)(260,34060)(8515,34060)", CommonDenominators.convertFrac(new long[][]{{1, 130}, {1, 131}, {1, 4}}));
    }

}
