package urban.uri_online_judge.beginner._1072;

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
    public void shouldHandle0Input() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 in").appendln("0 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle1InputLowestValue() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-10000000).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 in").appendln("1 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle1InputHighestValue() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(10000000).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 in").appendln("1 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle1LowerInterval() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(10).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 in").appendln("0 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle1HigherInterval() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(20).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 in").appendln("0 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleBothInInterval() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(10).appendln(20).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 in").appendln("0 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleBothOutInterval() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(9).appendln(21).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 in").appendln("2 out").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateIntervalSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).appendln(14).appendln(123).appendln(10).append(-25)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 in").appendln("2 out").build();

        assertEquals(expectedOutput, output);
    }

}
