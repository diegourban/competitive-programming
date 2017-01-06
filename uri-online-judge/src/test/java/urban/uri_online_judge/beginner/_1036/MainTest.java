package urban.uri_online_judge.beginner._1036;

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
    public void shouldBeImpossibleToCalculateWithAZero() throws IOException {
        InputStream input = new SampleBuilder().append(0.0).append(20.1).append(5.1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldBeImpossibleToCalculateWithDeltaNegative() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(1).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBhaskaraSample1() throws IOException {
        InputStream input = new SampleBuilder().append(10.0).append(20.1).append(5.1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("R1 = -0.29788").appendln("R2 = -1.71212").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBhaskaraSample2() throws IOException {
        InputStream input = new SampleBuilder().append(0.0).append(20.0).append(5.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBhaskaraSample3() throws IOException {
        InputStream input = new SampleBuilder().append(10.3).append(203.0).append(5.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("R1 = -0.02466").appendln("R2 = -19.68408").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBhaskaraSample4() throws IOException {
        InputStream input = new SampleBuilder().append(10.0).append(3.0).append(5.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(10.0).append(3.0).append(5.0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();
        assertEquals(expectedOutput, outContent.toString());
    }
}
