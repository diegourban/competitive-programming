package urban.uri_online_judge.beginner._1101;

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
    public void shouldStopOnZeroAtM() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().append("").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldStopOnZeroAtN() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().append("").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSmallerFirst() throws IOException {
        InputStream input = new SampleBuilder().append(2).appendln(5).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleBiggerFirst() throws IOException {
        InputStream input = new SampleBuilder().append(5).appendln(2).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCountSample() throws IOException {
        InputStream input = new SampleBuilder().append(5).appendln(2).append(6).appendln(3).append(5).append(0)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").appendln("3 4 5 6 Sum=18").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(5).appendln(2).append(6).appendln(3).append(5).append(0)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").appendln("3 4 5 6 Sum=18").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
