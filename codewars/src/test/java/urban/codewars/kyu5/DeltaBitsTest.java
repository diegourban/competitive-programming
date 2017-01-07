package urban.codewars.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeltaBitsTest {

    @Test
    public void shouldCreateInstance() {
        DeltaBits instance = new DeltaBits();
        assertNotNull(instance);
    }

    @Test
    public void convert0to0() {
        assertEquals(0, DeltaBits.convertBits(0, 0));
    }

    @Test
    public void convert0to1() {
        assertEquals(1, DeltaBits.convertBits(0, 1));
    }

    @Test
    public void convert0to2() {
        assertEquals(1, DeltaBits.convertBits(0, 2));
    }

    @Test
    public void convert0to3() {
        assertEquals(2, DeltaBits.convertBits(0, 3));
    }

    @Test
    public void convert0to4() {
        assertEquals(1, DeltaBits.convertBits(0, 4));
    }

    @Test
    public void convert0to5() {
        assertEquals(2, DeltaBits.convertBits(0, 5));
    }

    @Test
    public void convert0to6() {
        assertEquals(2, DeltaBits.convertBits(0, 6));
    }

    @Test
    public void convert0to7() {
        assertEquals(3, DeltaBits.convertBits(0, 7));
    }

    @Test
    public void convert0to8() {
        assertEquals(1, DeltaBits.convertBits(0, 8));
    }

    @Test
    public void convert0to9() {
        assertEquals(2, DeltaBits.convertBits(0, 9));
    }

    @Test
    public void convert0to10() {
        assertEquals(2, DeltaBits.convertBits(0, 10));
    }

    @Test
    public void convert31to14() {
        assertEquals(2, DeltaBits.convertBits(31, 14));
    }

    @Test
    public void convert31to31() {
        assertEquals(0, DeltaBits.convertBits(31, 31));
    }

    @Test
    public void convert7to17() {
        assertEquals(3, DeltaBits.convertBits(7, 17));
    }

    @Test
    public void convert330274332to199260599() {
        assertEquals(19, DeltaBits.convertBits(330274332, 199260599));
    }

    @Test
    public void convert31to14Simple() {
        assertEquals(2, DeltaBits.convertBitsSimple(31, 14));
    }

}
