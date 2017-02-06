package urban.uri_online_judge.beginner._2334;

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
    public void shouldHandleLowestInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(0).append(-1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOne() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxInput() throws IOException {
        InputStream input = new SampleBuilder().appendln("10000000000000000000").append(-1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("9999999999999999999").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input = new SampleBuilder().appendln(0).appendln(1).append(-1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(0).appendln(1).append(-1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(0).appendln(0).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
