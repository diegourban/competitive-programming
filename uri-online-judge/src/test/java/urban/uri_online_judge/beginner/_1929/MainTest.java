package urban.uri_online_judge.beginner._1929;

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

    private final SampleLoader scl = new SampleLoader("beginner", "1929");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI1.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI2.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("N").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug1.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug2.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample3() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug3.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample4() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug4.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample5() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug5.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample6() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug6.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample7() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(2).append(1).append(2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug6.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, outContent.toString());
    }
}
