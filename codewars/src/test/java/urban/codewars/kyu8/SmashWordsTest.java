package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

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
