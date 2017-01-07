package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormattingTest {

    @Test
    public void shouldCreateInstance() {
        Formatting instance = new Formatting();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveArredondarPraCima() {
        assertEquals(5.56, Formatting.twoDecimalPlaces(5.5589), 0.0);
    }

    @Test
    public void deveArredondarPraBaixo() {
        assertEquals(3.34, Formatting.twoDecimalPlaces(3.3429), 0.0);
    }

}
