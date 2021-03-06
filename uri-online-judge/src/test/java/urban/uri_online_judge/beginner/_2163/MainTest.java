package urban.uri_online_judge.beginner._2163;

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

    private final SampleLoader sl = new SampleLoader("beginner", "2163");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = sl.loadAsInputStream("uri1.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 4").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = sl.loadAsInputStream("uri2.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 0").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample3() throws IOException {
        InputStream input = sl.loadAsInputStream("uri3.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 2").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = sl.loadAsInputStream("udebug.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("480 20").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
