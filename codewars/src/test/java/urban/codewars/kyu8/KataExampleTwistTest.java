package urban.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KataExampleTwistTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new KataExampleTwist());
    }

    @Test
    public void deveRetornarArrayComMilCodewars() {
        String[] websites = KataExampleTwist.kataExampleTwist();
        assertNotNull(websites);
        assertEquals(1000, websites.length);
        for (int i = 0; i < websites.length; i++) {
            assertEquals("codewars", websites[i]);
        }
    }

}
