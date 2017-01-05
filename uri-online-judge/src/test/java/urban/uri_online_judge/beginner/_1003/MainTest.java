package urban.uri_online_judge.beginner._1003;

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
    public void shouldAddOnesPlace() throws IOException {
        InputStream input = new SampleBuilder().appendln("4").appendln("1").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = 5" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddOnesPlaceWithNegative() throws IOException {
        InputStream input = new SampleBuilder().appendln("6").appendln("-3").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = 3" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddTensPlace() throws IOException {
        InputStream input = new SampleBuilder().appendln("11").appendln("12").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = 23" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddTensPlaceWithNegative() throws IOException {
        InputStream input = new SampleBuilder().appendln("-10").appendln("25").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = 15" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddZeros() throws IOException {
        InputStream input = new SampleBuilder().appendln("0").appendln("0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = 0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddNegatives() throws IOException {
        InputStream input = new SampleBuilder().appendln("-5").appendln("-12").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = -17" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddLargePositiveInteger() throws IOException {
        InputStream input = new SampleBuilder().appendln("123456789").appendln("987654321").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "SOMA = 1111111110" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("4").appendln("1").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "SOMA = 5" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
