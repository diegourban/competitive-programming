package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LarioAndMuigiTest {

    @Test
    public void shouldCreateInstance() {
        LarioAndMuigi instance = new LarioAndMuigi();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveAdicionar4() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, LarioAndMuigi.pipeFix(new int[]{1, 2, 3, 5}));
    }

    @Test
    public void deveConsiderarNegativos() {
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3}, LarioAndMuigi.pipeFix(new int[]{-1, 3}));
    }

}
