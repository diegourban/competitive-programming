package urban.uri_online_judge.beginner._1164;

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
    public void shouldHandleLowestXInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 nao eh perfeito").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestXInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(100000000).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("100000000 nao eh perfeito").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMultipleInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).appendln(50).appendln(496).appendln(29).appendln(8128)
                .appendln(91).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("50 nao eh perfeito").appendln("496 eh perfeito")
                .appendln("29 nao eh perfeito").appendln("8128 eh perfeito").appendln("91 nao eh perfeito").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("1 nao eh perfeito").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
