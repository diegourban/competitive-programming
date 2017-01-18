package urban.uri_online_judge.beginner._1865;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader scl = new SampleLoader("beginner", "1865");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldAcceptThor() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("Thor").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "Y" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleInvalidThorSpelling() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleInvalidThorSpelling.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleInvalidThorSpelling.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleURI.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleUDebug.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = scl.loadAsString("sampleUDebug.out");

        assertEquals(expectedOutput, outContent.toString());
    }
}
