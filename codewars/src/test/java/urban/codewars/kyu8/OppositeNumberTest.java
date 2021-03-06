package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OppositeNumberTest {

    @Test
    public void shouldCreateInstance() {
        Opposite instance = new Opposite();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveNegativarUmPositivo() {
        assertEquals(-1, Opposite.opposite(1));
    }

    @Test
    public void devePositivarUmNegativo() {
        assertEquals(1, Opposite.opposite(-1));
    }

    @Test
    public void zeroEhZero() {
        assertEquals(0, Opposite.opposite(0));
    }

    @Test
    public void opostoDe14Positivo() {
        assertEquals(-14, Opposite.opposite(14));
    }

    @Test
    public void opostoDe36Negativo() {
        assertEquals(36, Opposite.opposite(-36));
    }

}
