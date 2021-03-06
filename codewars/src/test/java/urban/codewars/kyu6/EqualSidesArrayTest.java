package urban.codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EqualSidesArrayTest {

    @Test
    public void shouldCreateInstance() {
        EqualSidesArray instance = new EqualSidesArray();
        assertNotNull(instance);
    }

    @Test
    public void deveEncontrarIndice1() {
        assertEquals(1, EqualSidesArray.findEvenIndex(new int[]{1, 1, 1}));
    }

    @Test
    public void deveEncontrarMenos1() {
        assertEquals(-1, EqualSidesArray.findEvenIndex(new int[]{1, 1, 2}));
    }

    @Test
    public void deveEncontrarMenos1ArrayVazio() {
        assertEquals(-1, EqualSidesArray.findEvenIndex(new int[]{}));
    }

    @Test
    public void deveEncontrarMenos1ArrayComDois() {
        assertEquals(-1, EqualSidesArray.findEvenIndex(new int[]{1, 1}));
    }

    @Test
    public void deveEncontrarIndice2ComSomasIguais() {
        assertEquals(2, EqualSidesArray.findEvenIndex(new int[]{2, 50, 3, 50, 2}));
    }

    @Test
    public void deveEncontrarIndice2ComSomasDiferentes() {
        assertEquals(2, EqualSidesArray.findEvenIndex(new int[]{20, 30, 3, 48, 2}));
    }

    @Test
    public void deveEncontrarIndice2ComSomasESubtracoesIguais() {
        assertEquals(2, EqualSidesArray.findEvenIndex(new int[]{20, -30, 3, -30, 20}));
    }

    @Test
    public void deveEncontrarIndice2ComSomasESubtracoes() {
        assertEquals(4, EqualSidesArray.findEvenIndex(new int[]{1, 2, 3, -30, 3, -30, 6}));
    }

}
