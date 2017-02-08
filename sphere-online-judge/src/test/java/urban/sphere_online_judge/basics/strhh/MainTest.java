package urban.sphere_online_judge.basics.strhh;

import org.junit.Test;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader sl = new SampleLoader("basics", "strhh");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSPOJSample() throws IOException {
        InputStream input = sl.loadAsInputStream("spoj.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("spoj.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = sl.loadAsInputStream("spoj.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = sl.loadAsString("spoj.out");
        assertEquals(expectedOutput, outContent.toString());
    }
}
