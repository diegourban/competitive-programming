package urban.uri_online_judge.beginner._1963;

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
        InputStream input = new SampleBuilder().appendln(0.01).appendln(0.01).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0.00%").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1000.00).appendln(1000.00).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0.00%").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleIncreaseWithDecimals() throws IOException {
        InputStream input = new SampleBuilder().appendln(0.01).appendln(0.02).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("100.00%").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxIncrease() throws IOException {
        InputStream input = new SampleBuilder().appendln(0.01).appendln(1000.00).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("9999900.00%").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMinIncrease() throws IOException {
        InputStream input = new SampleBuilder().appendln(999.95).appendln(1000.00).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0.01%").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = new SampleBuilder().appendln(20.00).appendln(30.00).buildAsInputStream();
        InputStream input2 = new SampleBuilder().appendln(50.00).appendln(100.00).buildAsInputStream();
        InputStream input3 = new SampleBuilder().appendln(10.00).appendln(10.00).buildAsInputStream();

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);
        String output3 = Main.main(input3);

        String expectedOutput1 = new SampleBuilder().appendln("50.00%").build();
        String expectedOutput2 = new SampleBuilder().appendln("100.00%").build();
        String expectedOutput3 = new SampleBuilder().appendln("0.00%").build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(0.01).appendln(0.01).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("0.00%").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
