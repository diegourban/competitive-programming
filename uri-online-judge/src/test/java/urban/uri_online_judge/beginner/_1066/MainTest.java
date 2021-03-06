package urban.uri_online_judge.beginner._1066;

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
    public void shouldFindEvenOddPositiveNegativeSample() throws IOException {
        InputStream input = new SampleBuilder().append(-5).append(0).append(-3).append(-4).append(12)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("3 valor(es) par(es)").appendln("2 valor(es) impar(es)")
                .appendln("1 valor(es) positivo(s)").appendln("3 valor(es) negativo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindEvenOddPositiveNegativeSample2() throws IOException {
        InputStream input = new SampleBuilder().append(-2).append(-1).append(0).append(1).append(2)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("3 valor(es) par(es)").appendln("2 valor(es) impar(es)")
                .appendln("2 valor(es) positivo(s)").appendln("2 valor(es) negativo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(-2).append(-1).append(0).append(1).append(2)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("3 valor(es) par(es)").appendln("2 valor(es) impar(es)")
                .appendln("2 valor(es) positivo(s)").appendln("2 valor(es) negativo(s)").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
