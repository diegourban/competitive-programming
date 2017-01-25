package urban.uri_online_judge.beginner._1157;

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
    public void shouldCalculateDivisorsOf1() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDivisorsOf2() throws IOException {
        InputStream input = new SampleBuilder().append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(2).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDivisorsOf3() throws IOException {
        InputStream input = new SampleBuilder().append(3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDivisorsOf5() throws IOException {
        InputStream input = new SampleBuilder().append(5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(5).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDivisorsOf100() throws IOException {
        InputStream input = new SampleBuilder().append(100).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(4).appendln(5).appendln(10)
                .appendln(20).appendln(25).appendln(50).appendln(100).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDivisorsSample() throws IOException {
        InputStream input = new SampleBuilder().append(6).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln(6).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(6).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln(6).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
