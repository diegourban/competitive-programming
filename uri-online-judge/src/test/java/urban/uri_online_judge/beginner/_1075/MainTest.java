package urban.uri_online_judge.beginner._1075;

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
    public void shouldHandleHighestInput() throws IOException {
        InputStream input = new SampleBuilder().append(9999).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRemainingSample() throws IOException {
        InputStream input = new SampleBuilder().append(13).buildAsInputStream();

        String output = Main.main(input);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (i % 13 == 2) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        String expectedOutput = sb.toString();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(13).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (i % 13 == 2) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        String expectedOutput = sb.toString();

        assertEquals(expectedOutput, outContent.toString());
    }

}
