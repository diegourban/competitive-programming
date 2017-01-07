package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleTroubleTest {

    @Test
    public void shouldCreateInstance() {
        TripleTrouble instance = new TripleTrouble();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveCombinarUnico() {
        assertEquals("abc", TripleTrouble.tripleTrouble("a", "b", "c"));
    }

    @Test
    public void deveCombinarDuplo() {
        assertEquals("abcabc", TripleTrouble.tripleTrouble("aa", "bb", "cc"));
    }

    @Test
    public void deveCombinarTriplo() {
        assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
    }

    @Test
    public void deveCombinarBatman() {
        assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
    }

    @Test
    public void deveCombinarLexLuthor() {
        assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh", "euo", "xtr"));
    }

    @Test
    public void deveCombinarVazio() {
        assertEquals("", TripleTrouble.tripleTrouble("", "", ""));
    }

}
