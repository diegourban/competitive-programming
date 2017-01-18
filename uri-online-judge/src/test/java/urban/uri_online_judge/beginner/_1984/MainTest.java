package urban.uri_online_judge.beginner._1984;

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
    public void shouldHandleMinInput() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxInput() throws IOException {
        InputStream input = new SampleBuilder().append(9999999998L).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(8999999999L).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleReverseTen() throws IOException {
        InputStream input = new SampleBuilder().append(10).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("01").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleReverseWithZeroes() throws IOException {
        InputStream input = new SampleBuilder().append(102030400).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("004030201").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = new SampleBuilder().append(1234).buildAsInputStream();
        InputStream input2 = new SampleBuilder().append(9876543210L).buildAsInputStream();
        InputStream input3 = new SampleBuilder().append(12).buildAsInputStream();

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);
        String output3 = Main.main(input3);

        String expectedOutput1 = new SampleBuilder().appendln(4321).build();
        String expectedOutput2 = new SampleBuilder().appendln("0123456789").build();
        String expectedOutput3 = new SampleBuilder().appendln(21).build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1234).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(4321).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
