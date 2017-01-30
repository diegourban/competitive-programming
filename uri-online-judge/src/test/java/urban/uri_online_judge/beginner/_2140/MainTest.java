package urban.uri_online_judge.beginner._2140;

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
    public void shouldStopWithZero() throws IOException {
        InputStream input = new SampleBuilder().append("0 0").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().append("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append("0 0").buildAsInputStream();
        System.setIn(input);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().append("").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}