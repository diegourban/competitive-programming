package urban.uri_online_judge.beginner._1038;

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
    public void shouldCalculateSnackCode1() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 4.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackCode2() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 4.50").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackCode3() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 5.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackCode4() throws IOException {
        InputStream input = new SampleBuilder().append(4).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 2.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackCode5() throws IOException {
        InputStream input = new SampleBuilder().append(5).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 1.50").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackSample1() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 10.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackSample2() throws IOException {
        InputStream input = new SampleBuilder().append(4).append(3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 6.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSnackSample3() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 13.50").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(3).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Total: R$ 13.50").build();
        assertEquals(expectedOutput, outContent.toString());
    }
}
