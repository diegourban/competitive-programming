package urban.uri_online_judge.beginner._1962;

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
    public void shouldHandleLowestInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2015 D.C.").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(2147483648L).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2147481634 A.C.").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleDCInputs() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln(5)//
                .appendln(0)//
                .appendln(1)//
                .appendln(1007)//
                .appendln(2013)//
                .appendln(2014).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("2015 D.C.")//
                .appendln("2014 D.C.")//
                .appendln("1008 D.C.")//
                .appendln("2 D.C.")//
                .appendln("1 D.C.").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleACInputs() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln(5)//
                .appendln(2015)//
                .appendln(2016)//
                .appendln(1073740816L)//
                .appendln(2147483647L)//
                .appendln(2147483648L).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 A.C.")//
                .appendln("2 A.C.")//
                .appendln("1073738802 A.C.")//
                .appendln("2147481633 A.C.")//
                .appendln("2147481634 A.C.").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("2015 D.C.").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
