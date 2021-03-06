package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MilesPerGallonTest {

    @Test
    public void shouldCreateInstance() {
        MilesPerGallon instance = new MilesPerGallon();
        Assert.assertNotNull(instance);
    }

    @Test
    public void test1() {
        assertEquals(3.54f, MilesPerGallon.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        assertEquals(7.08f, MilesPerGallon.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        assertEquals(10.62f, MilesPerGallon.mpgToKPM(30), 0.001f);
    }

    @Test
    public void test4() {
        assertEquals(1296.02f, MilesPerGallon.mpgToKPM(3661), 0.001f);
    }


}
