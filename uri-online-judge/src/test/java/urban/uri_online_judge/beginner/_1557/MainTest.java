package urban.uri_online_judge.beginner._1557;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader sl = new SampleLoader("beginner", "1557");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleOne() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTwo() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("two.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleThree() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("three.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleFour() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("four.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleFive() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("five.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleFifteen() throws IOException {
        InputStream input = new SampleBuilder().appendln(15).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("fifteen.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln(4).appendln(5).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(1).appendln("").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
