package urban.uri_online_judge.beginner._2313;

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
    public void shouldHandleURISample1() throws IOException {
        InputStream input = new SampleBuilder().append("4 6 2").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Invalido").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = new SampleBuilder().append("4 3 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Valido-Isoceles").appendln("Retangulo: N").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample3() throws IOException {
        InputStream input = new SampleBuilder().append("3 4 5").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Valido-Escaleno").appendln("Retangulo: S").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append("4 6 2").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Invalido").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
