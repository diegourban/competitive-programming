package urban.uri_online_judge.beginner._1143;

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
        InputStream input = new SampleBuilder().appendln(1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 1 1")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintTwoLine() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 1 1")//
                .appendln("2 4 8")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintThreeLine() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 1 1")//
                .appendln("2 4 8")//
                .appendln("3 9 27")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrintSquaredCubicSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 1 1")//
                .appendln("2 4 8")//
                .appendln("3 9 27")//
                .appendln("4 16 64")//
                .appendln("5 25 125")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrint999Lines() throws IOException {
        InputStream input = new SampleBuilder().appendln(999).buildAsInputStream();

        String output = Main.main(input);
        SampleBuilder sb = new SampleBuilder();
        for (int i = 1; i <= 999; i++) {
            sb.append(i).append(i * i).appendln(i * i * i);
        }
        String expectedOutput = sb.build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("1 1 1")//
                .build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
