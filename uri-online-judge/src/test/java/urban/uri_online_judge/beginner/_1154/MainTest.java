package urban.uri_online_judge.beginner._1154;

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
    public void shouldReadOneAge() throws IOException {
        InputStream input = new SampleBuilder().appendln(28).appendln(-1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("28.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReadTwoAges() throws IOException {
        InputStream input = new SampleBuilder().appendln(28).appendln(29).appendln(-1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("28.50").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReadThreeAges() throws IOException {
        InputStream input = new SampleBuilder().appendln(28).appendln(29).appendln(30).appendln(-1)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("29.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldStopOnNegativeInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(28).appendln(29).appendln(-221).appendln(30)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("28.50").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(34).appendln(56).appendln(44).appendln(23).appendln(-2)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("39.25").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(34).appendln(56).appendln(44).appendln(23).appendln(-2)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("39.25").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
