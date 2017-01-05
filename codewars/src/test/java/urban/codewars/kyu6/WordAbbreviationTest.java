package urban.codewars.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordAbbreviationTest {

    @Test
    public void deveInstanciar() {
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
