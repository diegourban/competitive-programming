package urban.uri_online_judge.beginner._2232;

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
    public void shouldHandleSumLine1() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSumLine31() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(31).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2147483647).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSumtwoLines() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(1).appendln(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(3).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).appendln(1).appendln(2).appendln(5).appendln(31).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(3).appendln(31).appendln(2147483647).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).appendln(1).appendln(2).appendln(5).appendln(31).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(1).appendln(3).appendln(31).appendln(2147483647).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
