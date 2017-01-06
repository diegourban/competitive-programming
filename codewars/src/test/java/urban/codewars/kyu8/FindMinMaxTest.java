package urban.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FindMinMaxTest {

    @Test
    public void shouldCreateInstance() {
        FindMinMax instance = new FindMinMax();
        assertNotNull(instance);
    }

    @Test
    public void deveEncontrarMaximoUmElemento() {
        FindMinMax instance = new FindMinMax();
        int max = instance.max(new int[]{5});
        assertEquals(5, max);
    }

    @Test
    public void deveEncontrarMainimoZero() {
        FindMinMax instance = new FindMinMax();
        int min = instance.min(new int[]{42, 54, 65, 87, 0});
        assertEquals(0, min);
    }

    @Test
    public void deveEncontrarMaximo() {
        FindMinMax instance = new FindMinMax();
        int max = instance.max(new int[]{4, 6, 2, 1, 9, 63, -134, 566});
        assertEquals(566, max);
    }

    @Test
    public void deveEncontrarMinimo() {
        FindMinMax instance = new FindMinMax();
        int min = instance.min(new int[]{-52, 56, 30, 29, -54, 0, -110});
        assertEquals(-110, min);
    }

    @Test
    public void deveEncontrarMaximoClever() {
        FindMinMax instance = new FindMinMax();
        int max = instance.maxClever(new int[]{4, 6, 2, 1, 9, 63, -134, 566});
        assertEquals(566, max);
    }

    @Test
    public void deveEncontrarMinimoClever() {
        FindMinMax instance = new FindMinMax();
        int min = instance.minClever(new int[]{-52, 56, 30, 29, -54, 0, -110});
        assertEquals(-110, min);
    }

}
