package urban.uri_online_judge.beginner._1858;

import org.junit.Test;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private SampleLoader scl = new SampleLoader("beginner", "1858");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleMinimumInput() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleMinimumInput.in");

        String output = Main.main(input);

        String expectedOutput = "1" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleRepeatingMinimalNumbersInput() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleRepeatingMinimalNumbers.in");

        String output = Main.main(input);

        String expectedOutput = "4" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI.in");

        String output = Main.main(input);

        String expectedOutput = "2" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaximumInput() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleMaximumInput.in");

        String output = Main.main(input);

        String expectedOutput = "9" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleMaximumInput.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "9" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
