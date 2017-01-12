package urban.uri_online_judge.beginner._2172;

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
    public void shouldHandleEndOfRead() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().append("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseOfOneTimeTheMinExp() throws IOException {
        InputStream input = new SampleBuilder().append(1).appendln(10).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(10).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseOfTwoTimesTheMinExp() throws IOException {
        InputStream input = new SampleBuilder().append(2).appendln(10).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(20).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseOfThreeTimesTheMinExp() throws IOException {
        InputStream input = new SampleBuilder().append(3).appendln(10).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(30).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseOfOneTimeTheMaxExp() throws IOException {
        InputStream input = new SampleBuilder().append(1).appendln(4294967296l).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(4294967296l).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseOfTwoTimesTheMaxExp() throws IOException {
        InputStream input = new SampleBuilder().append(2).appendln(4294967296l).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(8589934592l).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseOfThreeTimesTheMaxExp() throws IOException {
        InputStream input = new SampleBuilder().append(3).appendln(4294967296l).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(12884901888l).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().append(1).appendln(544768710).append(2).appendln(538533133).append(3).appendln(38884958).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(544768710).appendln(1077066266).appendln(116654874).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1).appendln(544768710).append(2).appendln(538533133).append(3).appendln(38884958).append(0).append(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(544768710).appendln(1077066266).appendln(116654874).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
