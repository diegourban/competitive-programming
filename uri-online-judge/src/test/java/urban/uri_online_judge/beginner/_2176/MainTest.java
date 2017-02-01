package urban.uri_online_judge.beginner._2176;

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
    public void shouldHandleOneBitOfEach() throws IOException {
        int[] inputs = {0,1};
        String[] outputs = {"00", "11"};

        for(int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleEvenAmountOfOnes() throws IOException {
        InputStream input = new SampleBuilder().append(1010101).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("10101010").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOddAmountOfOnes() throws IOException {
        InputStream input = new SampleBuilder().append(10101).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("101011").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneHundredBits() throws IOException {
        InputStream input = new SampleBuilder().append("0101011001101010011001010101001010101010101010101011010010101010101011010110101010000101010101010101").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("01010110011010100110010101010010101010101010101010110100101010101010110101101010100001010101010101011").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("00").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("11").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
