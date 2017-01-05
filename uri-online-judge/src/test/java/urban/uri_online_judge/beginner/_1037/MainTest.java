package urban.uri_online_judge.beginner._1037;

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
    public void shouldConsiderBelowZeroOutOfInterval() throws IOException {
        InputStream input = new SampleBuilder().append(-0.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Fora de intervalo").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConsiderAboveOneHundredOutOfInterval() throws IOException {
        InputStream input = new SampleBuilder().append(100.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Fora de intervalo").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMinValueOfIntervalBetween0And25() throws IOException {
        InputStream input = new SampleBuilder().append(0.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo [0,25]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMaxValueOfIntervalBetween0And25() throws IOException {
        InputStream input = new SampleBuilder().append(25).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo [0,25]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMinValueOfIntervalBetween25And50() throws IOException {
        InputStream input = new SampleBuilder().append(25.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (25,50]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMaxValueOfIntervalBetween25And50() throws IOException {
        InputStream input = new SampleBuilder().append(50).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (25,50]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMinValueOfIntervalBetween50And75() throws IOException {
        InputStream input = new SampleBuilder().append(50.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (50,75]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMaxValueOfIntervalBetween50And75() throws IOException {
        InputStream input = new SampleBuilder().append(75).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (50,75]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMinValueOfIntervalBetween75And100() throws IOException {
        InputStream input = new SampleBuilder().append(75.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (75,100]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMaxValueOfIntervalBetween75And100() throws IOException {
        InputStream input = new SampleBuilder().append(100).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (75,100]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindIntervalSample1() throws IOException {
        InputStream input = new SampleBuilder().append(25.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (25,50]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindIntervalSample2() throws IOException {
        InputStream input = new SampleBuilder().append(25.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo [0,25]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindIntervalSample3() throws IOException {
        InputStream input = new SampleBuilder().append(100.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Intervalo (75,100]").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindIntervalSample4() throws IOException {
        InputStream input = new SampleBuilder().append(-25.02).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Fora de intervalo").build();

        assertEquals(expectedOutput, output);
    }

}
