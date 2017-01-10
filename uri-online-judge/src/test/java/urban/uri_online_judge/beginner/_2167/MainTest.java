package urban.uri_online_judge.beginner._2167;

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
    public void shouldHandleIncreasingSpeed() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(1).append(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleConstantSpeed() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(1).append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleDecreasingSpeed() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(3).append(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(1).append(4).append(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).append(100).append(199).append(199).append(198).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(4).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample3() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).append(1).append(2).append(2).append(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(1).append(4).append(2).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(3).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
