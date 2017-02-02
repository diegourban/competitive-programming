package urban.uri_online_judge.beginner._2221;

import org.junit.Test;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader sl = new SampleLoader("beginner", "2221");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleDabrielWins() throws IOException {
        InputStream input = sl.loadAsInputStream("sample1.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("sample1.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleGuarteWins() throws IOException {
        InputStream input = sl.loadAsInputStream("sample2.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("sample2.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleDraws() throws IOException {
        InputStream input = sl.loadAsInputStream("sample3.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("sample3.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = sl.loadAsInputStream("uri.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = sl.loadAsInputStream("uri.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, outContent.toString());
    }

}
