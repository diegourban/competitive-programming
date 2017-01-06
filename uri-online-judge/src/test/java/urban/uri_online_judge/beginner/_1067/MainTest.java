package urban.uri_online_judge.beginner._1067;

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
    public void shouldHandleLowerLimit() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldHandleUpperLimit() throws IOException {
        InputStream input = new SampleBuilder().append(1000).buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldPrintOddsSample1() throws IOException {
        InputStream input = new SampleBuilder().append(8).buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(8).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        assertEquals(sb.toString(), outContent.toString());
    }

}
