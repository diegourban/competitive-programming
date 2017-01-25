package urban.uri_online_judge.beginner._1159;

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
    public void shouldCalculateHugeIntegers() throws IOException {
        InputStream input = new SampleBuilder().appendln(1000000000).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5000000020L).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).appendln(11).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(40).appendln(80).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).appendln(11).append(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(40).appendln(80).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
