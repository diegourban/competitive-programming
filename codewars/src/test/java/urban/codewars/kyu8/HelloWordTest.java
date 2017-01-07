package urban.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HelloWordTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new HelloWorld());
    }

    @Test
    public void testSomething() {
        assertEquals("hello world!", HelloWorld.greet());
    }

}
