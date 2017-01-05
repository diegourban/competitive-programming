package urban.codewars.kyu8;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class IsDigitTest {

    @Test
    public void shouldCreateInstance() {
        IsDigit instance = new IsDigit();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveValidarVazio() {
        assertFalse(IsDigit.isDigit(""));
    }

    @Test
    public void deveValidarEspaco() {
        assertFalse(IsDigit.isDigit(" "));
    }

    @Test
    public void deveValidarLetra() {
        assertFalse(IsDigit.isDigit("a"));
    }

    @Test
    public void deveValidarLetras() {
        assertFalse(IsDigit.isDigit("abc"));
    }

    @Test
    public void deveValidarNumero() {
        assertTrue(IsDigit.isDigit("7"));
    }

    @Test
    public void deveValidarNumeros() {
        assertFalse(IsDigit.isDigit("123"));
    }

    @Test
    public void deveValidarNumerosELetras() {
        assertFalse(IsDigit.isDigit("3a2"));
    }

    @Test
    public void deveValidarNumeroZero() {
        assertTrue(IsDigit.isDigit("0"));
    }

    @Test
    public void deveValidarNumeroNove() {
        assertTrue(IsDigit.isDigit("9"));
    }

    @Test
    public void deveValidarNumeroDez() {
        assertFalse(IsDigit.isDigit("10"));
    }

    @Test
    public void deveValidarMatcher() {
        assertFalse(IsDigit.isDigit("\\d"));
    }

}
