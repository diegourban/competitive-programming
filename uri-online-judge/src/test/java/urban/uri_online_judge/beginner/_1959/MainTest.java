package urban.uri_online_judge.beginner._1959;

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
    public void shouldConvertLowestInput() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertHighestInput() throws IOException {
        InputStream input = new SampleBuilder().append(1000000).append(4000).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(4000000000L).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(3).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
