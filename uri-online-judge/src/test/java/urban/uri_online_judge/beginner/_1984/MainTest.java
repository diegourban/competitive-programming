package urban.uri_online_judge.beginner._1984;

import org.junit.Test;
import urban.uri_online_judge.SampleBuilder;

import java.io.IOException;
import java.io.InputStream;

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
        InputStream input = new SampleBuilder().append(9999999998l).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(8999999999l).build();
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
        InputStream input2 = new SampleBuilder().append(9876543210l).buildAsInputStream();
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

}
