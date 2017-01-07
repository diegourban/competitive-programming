package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToStringTest {

    @Test
    public void shouldCreateInstance() {
        NumberToString instance = new NumberToString();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveConverterUnidadeNegativa() {
        assertEquals("-3", NumberToString.numberToString(-3));
    }

    @Test
    public void deveConverterUnidadePositiva() {
        assertEquals("2", NumberToString.numberToString(2));
    }

    @Test
    public void deveConverterDezenaNegativa() {
        assertEquals("-19", NumberToString.numberToString(-19));
    }

    @Test
    public void deveConverterDezenaPositiva() {
        assertEquals("35", NumberToString.numberToString(35));
    }

    @Test
    public void deveConverterZero() {
        assertEquals("0", NumberToString.numberToString(0));
    }

}
