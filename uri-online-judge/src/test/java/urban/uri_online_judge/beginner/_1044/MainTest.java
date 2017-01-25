package urban.uri_online_judge.beginner._1044;

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
    public void shouldFindMultiplesAGreaterThanB() throws IOException {
        InputStream input = new SampleBuilder().append(8).append(4).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Sao Multiplos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMultiplesBGreaterThanA() throws IOException {
        InputStream input = new SampleBuilder().append(4).append(8).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Sao Multiplos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNotMultiples() throws IOException {
        InputStream input = new SampleBuilder().append(5).append(3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Nao sao Multiplos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMultiplesSample1() throws IOException {
        InputStream input = new SampleBuilder().append(6).append(24).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Sao Multiplos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMultiplesSample2() throws IOException {
        InputStream input = new SampleBuilder().append(6).append(25).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Nao sao Multiplos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(6).append(25).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Nao sao Multiplos").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
