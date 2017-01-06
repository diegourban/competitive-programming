package urban.uri_online_judge.beginner._1011;

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
    public void shouldCalculateZero() throws IOException {
        InputStream input = new SampleBuilder().appendln("0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "VOLUME = 0.000" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateOneDigitInput() throws IOException {
        InputStream input = new SampleBuilder().appendln("3").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "VOLUME = 113.097" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateTwoDigitInput() throws IOException {
        InputStream input = new SampleBuilder().appendln("15").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "VOLUME = 14137.155" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateThreeDigitInput() throws IOException {
        InputStream input = new SampleBuilder().appendln("999").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "VOLUME = 4176232868.838" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateFourDigitInput() throws IOException {
        InputStream input = new SampleBuilder().appendln("1523").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "VOLUME = 14797486501.627" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("1523").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "VOLUME = 14797486501.627" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
