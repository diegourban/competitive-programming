package urban.uri_online_judge.beginner._2028;

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
    public void shouldHandleZero() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso 1: 1 numero").appendln("0").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(0).appendln(1).appendln(2).append(3).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("Caso 1: 1 numero").appendln("0").appendln("")//
                .appendln("Caso 2: 2 numeros").appendln("0 1").appendln("")//
                .appendln("Caso 3: 4 numeros").appendln("0 1 2 2").appendln("")//
                .appendln("Caso 4: 7 numeros").appendln("0 1 2 2 3 3 3").appendln("")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Caso 1: 2 numeros").appendln("0 1").appendln("").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
