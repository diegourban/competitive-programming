package urban.uri_online_judge.beginner._2139;

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

    private final SampleLoader sl = new SampleLoader("beginner", "2139");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleChristmas() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).append(25).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("E natal!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleChristmasEve() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).append(24).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("E vespera de natal!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTwoDaysForChristmas() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).append(23).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Faltam 2 dias para o natal!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePassChristmas() throws IOException {
        int[] inputs = {26, 31};
        for (int day : inputs) {
            InputStream input = new SampleBuilder().appendln(12).append(day).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("Ja passou!").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = sl.loadAsInputStream("uri.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUDebugSample() throws IOException {
        InputStream input = sl.loadAsInputStream("udebug.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("udebug.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).append(25).buildAsInputStream();
        System.setIn(input);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("E natal!").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}