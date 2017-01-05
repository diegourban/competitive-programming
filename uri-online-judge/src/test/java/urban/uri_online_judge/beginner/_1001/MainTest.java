package urban.uri_online_judge.beginner._1001;

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
    public void shouldAddOnesAndOnes() throws IOException {
        InputStream input = new SampleBuilder().appendln("4").appendln("1").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "X = 5" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldAddOnesAndTens() throws IOException {
        InputStream input = new SampleBuilder().appendln("9").appendln("11").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "X = 20" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("9").appendln("11").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "X = 20" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
