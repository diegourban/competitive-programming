package urban.uri_online_judge.beginner._1180;

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
    public void shouldHandleLowestN() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(12).append(-12).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Menor valor: -12").appendln("Posicao: 1").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSameNumbers() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(1).append(1).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Menor valor: 1").appendln("Posicao: 0").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).append(1).append(2).append(3).append(4).append(-5)
                .append(6).append(7).append(8).append(9).append(10).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Menor valor: -5").appendln("Posicao: 4").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(10).append(1).append(2).append(3).append(4).append(-5)
                .append(6).append(7).append(8).append(9).append(10).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Menor valor: -5").appendln("Posicao: 4").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
