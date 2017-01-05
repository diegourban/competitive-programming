package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SlopeTest {

    @Test
    public void deveInstanciar() {
        Slope instance = new Slope();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveRetornarUndefined() {
        Slope slope = new Slope();
        assertEquals("undefined", slope.slope(new int[]{-7, 2, -7, 4}));
    }

    @Test
    public void deveRetornarPositivo() {
        Slope slope = new Slope();
        assertEquals("6", slope.slope(new int[]{10, 20, 20, 80}));
    }

    @Test
    public void deveRetornarNegativo() {
        Slope slope = new Slope();
        assertEquals("-5", slope.slope(new int[]{15, 45, 12, 60}));
    }

}
