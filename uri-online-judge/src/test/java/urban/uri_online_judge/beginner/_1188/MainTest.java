package urban.uri_online_judge.beginner._1188;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader scl = new SampleLoader("beginner", "1188");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sample1.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(3675.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sample2.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(122.5).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample3() throws IOException {
        InputStream input = scl.loadAsInputStream("sample3.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(125.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample4() throws IOException {
        InputStream input = scl.loadAsInputStream("sample4.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(4.2).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample5() throws IOException {
        InputStream input = scl.loadAsInputStream("sample5.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(-29.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample6() throws IOException {
        InputStream input = scl.loadAsInputStream("sample6.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(-1.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sample6.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(-1.0).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
