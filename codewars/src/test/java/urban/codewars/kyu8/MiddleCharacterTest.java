package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleCharacterTest {

    @Test
    public void shouldCreateInstance() {
        MiddleCharacter instance = new MiddleCharacter();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveEncontrarMeioUmaLetra() {
        assertEquals("A", MiddleCharacter.getMiddle("A"));
    }

    @Test
    public void deveEncontrarMeioDiasLetras() {
        assertEquals("Xo", MiddleCharacter.getMiddle("Xo"));
    }

    @Test
    public void deveEncontrarMeioTresLetras() {
        assertEquals("B", MiddleCharacter.getMiddle("aBa"));
    }

    @Test
    public void deveEncontrarMeioQuatroLetras() {
        assertEquals("oc", MiddleCharacter.getMiddle("coco"));
    }

    @Test
    public void deveEncontrarMeioCincoLetras() {
        assertEquals("dd", MiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void deveEncontrarMeioSeisLetras() {
        assertEquals("pe", MiddleCharacter.getMiddle("capeta"));
    }

    @Test
    public void deveEncontrarMeioSeteLetras() {
        assertEquals("t", MiddleCharacter.getMiddle("testing"));
    }

    @Test
    public void deveRetornarVazioComVazio() {
        assertEquals("", MiddleCharacter.getMiddle(""));
    }

}
