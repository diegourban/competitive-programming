package urban.uri_online_judge.beginner._1848;

import org.junit.Test;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader sl = new SampleLoader("beginner", "1848");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = sl.loadAsInputStream("uri1.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri1.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = sl.loadAsInputStream("uri2.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri2.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample() throws IOException {
        InputStream input = sl.loadAsInputStream("udebug.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("udebug.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = sl.loadAsInputStream("uri1.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = sl.loadAsString("uri1.out");

        assertEquals(expectedOutput, outContent.toString());
    }

}
