package urban.uri_online_judge.beginner._1007;

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
    public void shouldCalculateDifferenceOfZero() throws IOException {
        InputStream input = new SampleBuilder().appendln("0").appendln("0").appendln("0").appendln("0")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "DIFERENCA = 0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDifferenceOfOne() throws IOException {
        InputStream input = new SampleBuilder().appendln("1").appendln("1").appendln("0").appendln("0")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "DIFERENCA = 1" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDifferenceOfTwo() throws IOException {
        InputStream input = new SampleBuilder().appendln("3").appendln("1").appendln("0").appendln("0")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "DIFERENCA = 3" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateNegativeDifference() throws IOException {
        InputStream input = new SampleBuilder().appendln("0").appendln("0").appendln("7").appendln("8")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "DIFERENCA = -56" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateTheDifferenceWithNegativeInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln("5").appendln("6").appendln("-7").appendln("8")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "DIFERENCA = 86" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("5").appendln("6").appendln("-7").appendln("8")
                .buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "DIFERENCA = 86" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
