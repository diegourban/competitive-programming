package urban.uri_online_judge.beginner._1041;

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
    public void shouldFindPointAtOrigin() throws IOException {
        InputStream input = new SampleBuilder().append(0.0).append(0.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Origem").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtXAxis() throws IOException {
        InputStream input = new SampleBuilder().append(0.0).append(1.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Eixo Y").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtYAxis() throws IOException {
        InputStream input = new SampleBuilder().append(1.0).append(0.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Eixo X").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtQuadrant1() throws IOException {
        InputStream input = new SampleBuilder().append(1.0).append(1.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Q1").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtQuadrant2() throws IOException {
        InputStream input = new SampleBuilder().append(-1.0).append(1.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Q2").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtQuadrant3() throws IOException {
        InputStream input = new SampleBuilder().append(-1.0).append(-1.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Q3").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtQuadrant4() throws IOException {
        InputStream input = new SampleBuilder().append(1.0).append(-1.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Q4").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtSample1() throws IOException {
        InputStream input = new SampleBuilder().append(4.5).append(-2.2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Q4").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtSample2() throws IOException {
        InputStream input = new SampleBuilder().append(0.1).append(0.1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Q1").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPointAtSample3() throws IOException {
        InputStream input = new SampleBuilder().append(0.0).append(0.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Origem").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(0.0).append(0.0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Origem").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
