package urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareSumCharTest {

    @Test
    public void shouldCreateInstance() {
        CompareSumChar instance = new CompareSumChar();
        assertNotNull(instance);
    }

    @Test
    public void deveSerIgualAmbosNull() {
        assertTrue(CompareSumChar.compare(null, null));
    }

    @Test
    public void deveSerIgualAmbosVazio() {
        assertTrue(CompareSumChar.compare("", ""));
    }

    @Test
    public void deveSerIgualUmNullOutroVazio() {
        assertTrue(CompareSumChar.compare(null, ""));
    }

    @Test
    public void deveSerIgualUmVazioOutroNull() {
        assertTrue(CompareSumChar.compare("", null));
    }

    @Test
    public void deveSerDiferenteUmNaoVAzioOutroNull() {
        assertFalse(CompareSumChar.compare("asd", null));
    }

    @Test
    public void deveSerIgualADBC() {
        assertTrue(CompareSumChar.compare("AD", "BC"));
    }

    @Test
    public void deveSerDiferenteADDD() {
        assertFalse(CompareSumChar.compare("AD", "DD"));
    }

    @Test
    public void deveSerIgualMinusculoMaiusculo() {
        assertTrue(CompareSumChar.compare("gf", "FG"));
    }

    @Test
    public void deveSerIgual() {
        assertTrue(CompareSumChar.compare("ZzZz", "ffPFF"));
    }

    @Test
    public void deveConsideraVazioComNumero() {
        assertTrue(CompareSumChar.compare("zz1", ""));
    }

    @Test
    public void deveConsideraVazioComCaracterEspecial() {
        assertTrue(CompareSumChar.compare("z!z", ""));
    }

}
