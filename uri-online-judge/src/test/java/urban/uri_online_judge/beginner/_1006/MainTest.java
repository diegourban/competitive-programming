package urban.uri_online_judge.beginner._1006;

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
    public void shouldCalculateTheMinimumAverage() throws IOException {
        InputStream input = new SampleBuilder().appendln("0").appendln("0").appendln("0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 0.0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateTheMaximumAverage() throws IOException {
        InputStream input = new SampleBuilder().appendln("10.0").appendln("10.0").appendln("10.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 10.0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAverage6Point3() throws IOException {
        InputStream input = new SampleBuilder().appendln("5.0").appendln("6.0").appendln("7.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 6.3" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAverage9() throws IOException {
        InputStream input = new SampleBuilder().appendln("5.0").appendln("10.0").appendln("10.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 9.0" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateAverage7Point5() throws IOException {
        InputStream input = new SampleBuilder().appendln("10.0").appendln("10.0").appendln("5.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "MEDIA = 7.5" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("0").appendln("0").appendln("0").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "MEDIA = 0.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
