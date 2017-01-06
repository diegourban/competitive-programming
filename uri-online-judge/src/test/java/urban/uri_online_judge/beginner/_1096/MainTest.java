package urban.uri_online_judge.beginner._1096;

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
    public void shouldCalculateSequenceIJ2() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i += 2) {
            sb.append("I=").append(i).append(" ").append("J=").append(7).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(6).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(5).append(System.lineSeparator());
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
        for (int i = 1; i <= 9; i += 2) {
            sb.append("I=").append(i).append(" ").append("J=").append(7).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(6).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(5).append(System.lineSeparator());
        }
        String expectedOutput = sb.toString();
        assertEquals(expectedOutput, outContent.toString());
    }

}
