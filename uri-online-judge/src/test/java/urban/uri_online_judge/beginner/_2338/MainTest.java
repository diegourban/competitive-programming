package urban.uri_online_judge.beginner._2338;

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
    public void shouldHandleLetterA() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("=.===").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("a").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLetterB() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("===.=.=.=").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("b").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLetterZ() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("===.===.=.=").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("z").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("===.===...===.===.===...=.===.=...=.=.=...=.......===.=.===.=...===.===.===...===.=.=...=").appendln("=.=.=...===.===.===...=.=.=").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("morse code").appendln("sos").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("===.===...===.===.===...=.===.=...=.=.=...=.......===.=.===.=...===.===.===...===.=.=...=").appendln("=.=.=...===.===.===...=.=.=").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("morse code").appendln("sos").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
