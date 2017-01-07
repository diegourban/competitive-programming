package urban.codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WordAbbreviationTest {

    @Test
    public void shouldCreateInstance() {
        WordAbbreviation instance = new WordAbbreviation();
        assertNotNull(instance);
    }

    @Test
    public void deveAbreviar() {
        assertEquals("i18n", new WordAbbreviation().abbreviate("internationalization"));
    }

    @Test
    public void naoDeveAbreviar() {
        assertEquals("ride", new WordAbbreviation().abbreviate("ride"));
    }

    @Test
    public void deveAbreviarMaisPalavras() {
        assertEquals("e6t-r2e", new WordAbbreviation().abbreviate("elephant ride"));
    }
}
