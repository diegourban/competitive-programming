package urban.uri_online_judge.beginner._1158;

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
    public void shouldCalculateSample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(4).append(5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(45).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample2() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(7).append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(40).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample3() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(4).appendln(3).append(11).append(2)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(21).appendln(24).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(4).appendln(3).append(11).append(2)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(21).appendln(24).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
