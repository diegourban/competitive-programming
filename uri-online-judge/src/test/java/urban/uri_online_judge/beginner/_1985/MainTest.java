package urban.uri_online_judge.beginner._1985;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private SampleLoader scl = new SampleLoader("beginner", "1985");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleProduct1001() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1001 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1.50").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleProduct1002() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1002 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2.50").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleProduct1003() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1003 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("3.50").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleProduct1004() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1004 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("4.50").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleProduct1005() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1005 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("5.50").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMinOfEachProduct() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln("1001 1").appendln("1002 1").appendln("1003 1").appendln("1004 1").appendln("1005 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("17.50").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxOfEachProduct() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln("1001 500").appendln("1002 500").appendln("1003 500").appendln("1004 500").appendln("1005 500").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("8750.00").build();
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

        String expectedOutput1 = new SampleBuilder().appendln("19.50").build();
        String expectedOutput2 = new SampleBuilder().appendln("1750.00").build();
        String expectedOutput3 = new SampleBuilder().appendln("2808.50").build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

}
