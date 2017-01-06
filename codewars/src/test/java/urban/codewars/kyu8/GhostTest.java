package urban.codewars.kyu8;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GhostTest {

    private static final List<String> COLORS = Arrays.asList("white", "yellow", "purple", "red");

    @Test
    public void shouldCreateInstance() {
        Ghost instance = new Ghost();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveGerarUmaDasCoresPermitidas() {
        Ghost ghost = new Ghost();
        Assert.assertTrue(COLORS.contains(ghost.getColor()));
    }

}
