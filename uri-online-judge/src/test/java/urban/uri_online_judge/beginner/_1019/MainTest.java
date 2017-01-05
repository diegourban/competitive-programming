package urban.uri_online_judge.beginner._1019;

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
    public void shouldConvertTime1Second() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0:0:1").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertTime1Minute() throws IOException {
        InputStream input = new SampleBuilder().append(60).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0:1:0").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertTime1Hour() throws IOException {
        InputStream input = new SampleBuilder().append(60 * 60).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1:0:0").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertTime1Hour1Minute1Second() throws IOException {
        InputStream input = new SampleBuilder().append(60 * 60 + 60 + 1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1:1:1").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertTimeSample1() throws IOException {
        InputStream input = new SampleBuilder().append(556).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0:9:16").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertTimeSample2() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0:0:1").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertTimeSample3() throws IOException {
        InputStream input = new SampleBuilder().append(140153).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("38:55:53").build();
        assertEquals(expectedOutput, output);
    }

}
