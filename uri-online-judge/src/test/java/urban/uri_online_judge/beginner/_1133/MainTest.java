package urban.uri_online_judge.beginner._1133;

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
    public void shouldHandleAscendingInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(13).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(7).appendln(8).appendln(12)
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleDescendingInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(13).append(1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(7).appendln(8).appendln(12)
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSameInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintRestOfDivisionSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).append(18).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(12).appendln(13).appendln(17).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).append(18).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(12).appendln(13).appendln(17).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
