package urban.uri_online_judge.beginner._1150;

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
    public void shouldSkipInvalidInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln(4).appendln(0).appendln(-1).appendln(5).appendln(5)
                .appendln(12).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldSumOnlyOnce() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln(6).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSumsEqualToZ() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln(7).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldSumExceedingZSample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln(1).appendln(20).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldSumExceedingZSample2() throws IOException {
        InputStream input = new SampleBuilder().appendln(21).appendln(21).appendln(15).appendln(30)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(21).appendln(21).appendln(15).appendln(30)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(2).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
