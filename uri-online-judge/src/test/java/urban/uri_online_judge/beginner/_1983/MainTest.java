package urban.uri_online_judge.beginner._1983;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private SampleLoader scl = new SampleLoader("beginner", "1983");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sample1.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Minimum note not reached").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sample2.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Minimum note not reached").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample3() throws IOException {
        InputStream input = scl.loadAsInputStream("sample3.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("3").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample4() throws IOException {
        InputStream input = scl.loadAsInputStream("sample4.in");
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = scl.loadAsInputStream("sampleURI1.in");
        InputStream input2 = scl.loadAsInputStream("sampleURI2.in");
        InputStream input3 = scl.loadAsInputStream("sampleURI3.in");

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);
        String output3 = Main.main(input3);

        String expectedOutput1 = new SampleBuilder().appendln("1001").build();
        String expectedOutput2 = new SampleBuilder().appendln("Minimum note not reached").build();
        String expectedOutput3 = new SampleBuilder().appendln("999999").build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

    @Test
    public void shouldHandleUDebugSamples() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleUDebug1.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("125881").build();

        assertEquals(expectedOutput, output);
    }
}
