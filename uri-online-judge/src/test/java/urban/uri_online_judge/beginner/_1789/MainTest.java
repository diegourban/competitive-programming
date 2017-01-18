package urban.uri_online_judge.beginner._1789;

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
    public void shouldHandleLevel1() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(1).append(5).append(9).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLevel2() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(10).append(15).append(19).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLevel3() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(20).append(21).append(50).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).appendln("10 10 10 10 15 18 20 15 11 10")//
                .appendln(10).appendln("1 5 2 9 5 5 8 4 4 3")//
                .appendln(10).append("19 9 1 4 5 8 6 11 9 7").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).appendln(1).appendln(2).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).appendln("10 10 10 10 15 18 20 15 11 10")//
                .appendln(10).appendln("1 5 2 9 5 5 8 4 4 3")//
                .appendln(10).append("19 9 1 4 5 8 6 11 9 7").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(3).appendln(1).appendln(2).build();
        assertEquals(expectedOutput, outContent.toString());
    }
}
