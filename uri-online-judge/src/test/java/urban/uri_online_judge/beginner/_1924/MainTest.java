package urban.uri_online_judge.beginner._1924;

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

    private SampleLoader scl = new SampleLoader("beginner", "1924");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI1.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Ciencia da Computacao").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI2.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Ciencia da Computacao").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI2.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Ciencia da Computacao").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
