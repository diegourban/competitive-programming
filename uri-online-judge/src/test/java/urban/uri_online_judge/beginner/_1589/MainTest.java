package urban.uri_online_judge.beginner._1589;

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

    private final SampleLoader scl = new SampleLoader("beginner", "1589");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleInvalidNegativeTestCaseInput() throws IOException {
        InputStream input = new SampleBuilder().append(-1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "";

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleInvalidZeroTestCaseInput() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "";

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLowerLimit() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleLowerLimit.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleLowerLimit.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHigherLimit() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleHigherLimit.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleHigherLimit.out");

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
