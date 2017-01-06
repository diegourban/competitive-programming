package urban.uri_online_judge.beginner._1146;

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
    public void shouldPrintOneLine() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintOneLineWithTenNumbers() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 2 3 4 5 6 7 8 9 10")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintTwoLines() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln(3).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 2 3 4 5")//
                .appendln("1 2 3")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln(10).appendln(3).append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 2 3 4 5")//
                .appendln("1 2 3 4 5 6 7 8 9 10")//
                .appendln("1 2 3")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln(10).appendln(3).append(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("1 2 3 4 5")//
                .appendln("1 2 3 4 5 6 7 8 9 10")//
                .appendln("1 2 3")//
                .build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
