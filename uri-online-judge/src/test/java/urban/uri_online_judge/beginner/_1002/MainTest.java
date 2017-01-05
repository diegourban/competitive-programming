package urban.uri_online_judge.beginner._1002;

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
    public void shouldCalculateAreaOfOneDigitR() throws IOException {
        InputStream input = new SampleBuilder().appendln("2.00").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "A=12.5664" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAreaOfTwoDigitR() throws IOException {
        InputStream input = new SampleBuilder().appendln("11.00").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "A=380.1324" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAreaOfThreeDigitR() throws IOException {
        InputStream input = new SampleBuilder().appendln("100.64").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "A=31819.3103" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("2.00").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "A=12.5664" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
