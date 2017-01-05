package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class StringToNumberTest {

    @Test
    public void deveInstanciar() {
        StringToNumber instance = new StringToNumber();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveConverter0() {
        assertEquals(0, StringToNumber.stringToNumber("0"));
    }

    @Test
    public void deveConverterUnidadePositivo() {
        assertEquals(5, StringToNumber.stringToNumber("5"));
    }

    @Test
    public void deveConverterUnidadeNegativo() {
        assertEquals(-7, StringToNumber.stringToNumber("-7"));
    }

    @Test
    public void deveConverterDezenaPositivo() {
        assertEquals(19, StringToNumber.stringToNumber("19"));
    }

    @Test
    public void deveConverterDezenaNegativo() {
        assertEquals(-88, StringToNumber.stringToNumber("-88"));
    }

}
