package urban.uri_online_judge.beginner._1070;

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
    public void shouldPrintSixConsecutiveOddsStartingAtEven() throws IOException {
        InputStream input = new SampleBuilder().append(2).buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        sb.append(3).append(System.lineSeparator());
        sb.append(5).append(System.lineSeparator());
        sb.append(7).append(System.lineSeparator());
        sb.append(9).append(System.lineSeparator());
        sb.append(11).append(System.lineSeparator());
        sb.append(13).append(System.lineSeparator());

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldPrintSixConsecutiveOddsStartingAtOdd() throws IOException {
        InputStream input = new SampleBuilder().append(3).buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        sb.append(3).append(System.lineSeparator());
        sb.append(5).append(System.lineSeparator());
        sb.append(7).append(System.lineSeparator());
        sb.append(9).append(System.lineSeparator());
        sb.append(11).append(System.lineSeparator());
        sb.append(13).append(System.lineSeparator());

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldPrintSixConsecutiveSample() throws IOException {
        InputStream input = new SampleBuilder().append(8).buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        sb.append(9).append(System.lineSeparator());
        sb.append(11).append(System.lineSeparator());
        sb.append(13).append(System.lineSeparator());
        sb.append(15).append(System.lineSeparator());
        sb.append(17).append(System.lineSeparator());
        sb.append(19).append(System.lineSeparator());

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
        sb.append(9).append(System.lineSeparator());
        sb.append(11).append(System.lineSeparator());
        sb.append(13).append(System.lineSeparator());
        sb.append(15).append(System.lineSeparator());
        sb.append(17).append(System.lineSeparator());
        sb.append(19).append(System.lineSeparator());

        assertEquals(sb.toString(), outContent.toString());
    }

}
