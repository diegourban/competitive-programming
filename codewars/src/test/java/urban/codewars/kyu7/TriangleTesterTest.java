package urban.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TriangleTesterTest {

    @Test
    public void shouldCreateInstance() {
        TriangleTester instance = new TriangleTester();
        assertNotNull(instance);
    }

    @Test
    public void naoEhTriangulo() {
        assertEquals(false, TriangleTester.isTriangle(7, 2, 2));
    }

    @Test
    public void ehTriangulo() {
        assertEquals(true, TriangleTester.isTriangle(1, 2, 2));
    }

}
