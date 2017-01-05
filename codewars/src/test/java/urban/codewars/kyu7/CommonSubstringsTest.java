package urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CommonSubstringsTest {

    @Test
    public void deveInstanciar() {
        CommonSubstrings instance = new CommonSubstrings();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveEncontrarSubstringEmStringsIdenticas() {
        assertEquals(true, CommonSubstrings.substringTest("me", "me"));
    }

    @Test
    public void deveEncontrarSubstring() {
        assertEquals(true, CommonSubstrings.substringTest("Something", "Home"));
    }

    @Test
    public void deveEncontrarSubstringComCaps() {
        assertEquals(true, CommonSubstrings.substringTest("AbCdEf", "bedelho"));
    }

    @Test
    public void naoDeveEncontrarSubstring() {
        assertEquals(false, CommonSubstrings.substringTest("Something", "Fun"));
    }

}
