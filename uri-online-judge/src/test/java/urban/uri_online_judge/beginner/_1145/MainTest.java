package urban.uri_online_judge.beginner._1145;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleOneNumberPerLine() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln(1)//
                .appendln(2)//
                .appendln(3)//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTwoNumbersPerLine() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 2")//
                .appendln("3")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleThreeNumbersPerLine() throws IOException {
        InputStream input = new SampleBuilder().append(3).append(12).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 2 3")//
                .appendln("4 5 6")//
                .appendln("7 8 9")//
                .appendln("10 11 12")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldPrint19NumberPerLine() throws IOException {
        InputStream input = new SampleBuilder().append(19).append(19).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19").build();

        assertEquals(expectedOutput, output);
    }

}
