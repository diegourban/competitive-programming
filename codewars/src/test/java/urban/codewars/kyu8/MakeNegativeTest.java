package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MakeNegativeTest {

    @Test
    public void shouldCreateInstance() {
        MakeNegative instance = new MakeNegative();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testPositive() {
        assertEquals(-42, MakeNegative.makeNegative(42));
    }

    @Test
    public void testNegative() {
        assertEquals(-9, MakeNegative.makeNegative(-9));
    }

    @Test
    public void testZero() {
        assertEquals(0, MakeNegative.makeNegative(0));
    }

}
