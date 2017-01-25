package urban.uri_online_judge.beginner._1534;

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

    private static final SampleLoader sl = new SampleLoader("beginner", "1534");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleLowestInput() throws IOException {
        InputStream input = new SampleBuilder().append(3).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("lowestInput.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestInput() throws IOException {
        InputStream input = new SampleBuilder().append(69).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("highestInput.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).append(7).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).append(7).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, outContent.toString());
    }

}