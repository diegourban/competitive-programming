package urban.uri_online_judge.beginner._1149;

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
    public void shouldPrintOneLine() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReadAnotherNWhileNIsZeroOrNegative() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(0).append(-1).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(7).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldSumConsecutiveIntegers() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(7).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(2).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(7).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
