package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmashWordsTest {

    @Test
    public void shouldCreateInstance() {
        SmashWords instance = new SmashWords();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveJuntarDuasPalavras() {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
    }

    @Test
    public void deveValidarVazio() {
        assertEquals("", SmashWords.smash());
    }

}
