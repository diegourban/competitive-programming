package urban.uri_online_judge.beginner._1828;

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

    private final SampleLoader scl = new SampleLoader("beginner", "1828");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleAllDraw() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleAllDraw.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder()//
                .appendln("Caso #1: De novo!")//
                .appendln("Caso #2: De novo!")//
                .appendln("Caso #3: De novo!")//
                .appendln("Caso #4: De novo!")//
                .appendln("Caso #5: De novo!")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleAllWin() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleAllWin.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder()//
                .appendln("Caso #1: Bazinga!")//
                .appendln("Caso #2: Bazinga!")//
                .appendln("Caso #3: Bazinga!")//
                .appendln("Caso #4: Bazinga!")//
                .appendln("Caso #5: Bazinga!")//
                .appendln("Caso #6: Bazinga!")//
                .appendln("Caso #7: Bazinga!")//
                .appendln("Caso #8: Bazinga!")//
                .appendln("Caso #9: Bazinga!")//
                .appendln("Caso #10: Bazinga!")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleAllLose() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleAllLose.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder()//
                .appendln("Caso #1: Raj trapaceou!")//
                .appendln("Caso #2: Raj trapaceou!")//
                .appendln("Caso #3: Raj trapaceou!")//
                .appendln("Caso #4: Raj trapaceou!")//
                .appendln("Caso #5: Raj trapaceou!")//
                .appendln("Caso #6: Raj trapaceou!")//
                .appendln("Caso #7: Raj trapaceou!")//
                .appendln("Caso #8: Raj trapaceou!")//
                .appendln("Caso #9: Raj trapaceou!")//
                .appendln("Caso #10: Raj trapaceou!")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSampleURI() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder()//
                .appendln("Caso #1: Bazinga!")//
                .appendln("Caso #2: Raj trapaceou!")//
                .appendln("Caso #3: De novo!")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("Caso #1: Bazinga!")//
                .appendln("Caso #2: Raj trapaceou!")//
                .appendln("Caso #3: De novo!")//
                .build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
