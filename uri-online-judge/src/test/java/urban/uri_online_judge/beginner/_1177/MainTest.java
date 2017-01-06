package urban.uri_online_judge.beginner._1177;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private String generateExpectedOutputFor(int t) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            sb.append("N[").append(i).append("] = ").append(count).append(System.lineSeparator());
            count++;
            if (count == t) {
                count = 0;
            }
        }
        return sb.toString();
    }

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleLowestInput() throws IOException {
        int t = 2;
        InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = generateExpectedOutputFor(t);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestInput() throws IOException {
        int t = 50;
        InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = generateExpectedOutputFor(t);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample() throws IOException {
        int t = 3;
        InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = generateExpectedOutputFor(t);

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        int t = 3;
        InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = generateExpectedOutputFor(t);
        assertEquals(expectedOutput, outContent.toString());
    }
}

