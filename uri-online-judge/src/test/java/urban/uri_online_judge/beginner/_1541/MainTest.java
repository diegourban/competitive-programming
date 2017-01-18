package urban.uri_online_judge.beginner._1541;

import org.junit.Test;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader scl = new SampleLoader("beginner", "1541");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sample1.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample1.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sample2.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample2.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLimits() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleLimits.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleLimits.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleLimits.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = scl.loadAsString("sampleLimits.out");

        assertEquals(expectedOutput, outContent.toString());
    }

}
