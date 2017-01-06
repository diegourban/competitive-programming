package urban.uri_online_judge.beginner._1864;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleMinimumInput() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "L" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaximumInput() throws IOException {
        InputStream input = new SampleBuilder().append(34).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "LIFE IS NOT A PROBLEM TO BE SOLVED" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample() throws IOException {
        InputStream input = new SampleBuilder().append(33).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "LIFE IS NOT A PROBLEM TO BE SOLVE" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().append(7).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "LIFE IS" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(7).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "LIFE IS" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }

}
