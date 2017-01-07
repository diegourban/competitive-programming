package urban.uri_online_judge.beginner._1837;

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

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleDivisionByZero() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "2 1" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveInputs() throws IOException {
        InputStream input = new SampleBuilder().append(7).append(3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "2 1" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeInputs() throws IOException {
        InputStream input = new SampleBuilder().append(-7).append(-3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "3 2" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeN() throws IOException {
        InputStream input = new SampleBuilder().append(-736).append(539).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "-2 342" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeD() throws IOException {
        InputStream input = new SampleBuilder().append(62).append(-59).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "-1 3" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUpperLimit() throws IOException {
        InputStream input = new SampleBuilder().append(999).append(999).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "1 0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLowerLimit() throws IOException {
        InputStream input = new SampleBuilder().append(-1000).append(-1000).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = "1 0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(-1000).append(-1000).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "1 0" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
