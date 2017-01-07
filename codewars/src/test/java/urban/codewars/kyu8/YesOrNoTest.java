package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YesOrNoTest {

    @Test
    public void shouldCreateInstance() {
        YesOrNo instance = new YesOrNo();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testRetornarYes() {
        assertEquals("Yes", YesOrNo.boolToWord(true));
    }

    @Test
    public void testRetornarNo() {
        assertEquals("No", YesOrNo.boolToWord(false));
    }

}
