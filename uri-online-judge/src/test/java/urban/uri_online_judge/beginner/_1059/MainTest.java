package urban.uri_online_judge.beginner._1059;

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
    public void shouldPrintEvenNumbersFrom1To100() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        assertEquals(sb.toString(), outContent.toString());
    }

}
