package urban.uri_online_judge.beginner._1866;

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

    private final SampleLoader scl = new SampleLoader("beginner", "1866");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample() throws IOException {
        InputStream input = scl.loadAsInputStream("sample.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(1).appendln(0).appendln(1).appendln(0).appendln(1)
                .appendln(0).appendln(1).appendln(0).appendln(1).appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(1).appendln(1).appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(1).appendln(1).appendln(0).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
