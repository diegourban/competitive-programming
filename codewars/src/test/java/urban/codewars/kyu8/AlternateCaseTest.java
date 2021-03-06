package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternateCaseTest {

    @Test
    public void shouldCreateInstance() {
        AlternateCase instance = new AlternateCase();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveAlternarUmaLetraMaiuscula() {
        assertEquals("a", AlternateCase.toAlternativeString("A"));
    }

    @Test
    public void deveAlternarUmaLetraMinuscula() {
        assertEquals("B", AlternateCase.toAlternativeString("b"));
    }

    @Test
    public void deveAlternarPalavra() {
        assertEquals("aBaCaTe", AlternateCase.toAlternativeString("AbAcAtE"));
    }

    @Test
    public void naoDeveAlternarNumero() {
        assertEquals("123", AlternateCase.toAlternativeString("123"));
    }

    @Test
    public void naoDeveAlternarNumeroEntreLetras() {
        assertEquals("1A2b3", AlternateCase.toAlternativeString("1a2B3"));
    }

}
