package urban.uri_online_judge.beginner._1005;

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
    public void shouldCalculateAverageOnesPlace() throws IOException {
        InputStream input = new SampleBuilder().appendln("5.0").appendln("7.1").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 6.43182" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAverageZero() throws IOException {
        InputStream input = new SampleBuilder().appendln("0").appendln("0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 0.00000" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAverageTen() throws IOException {
        InputStream input = new SampleBuilder().appendln("10").appendln("10").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 10.00000" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("10").appendln("10").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "MEDIA = 10.00000" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
