package urban.uri_online_judge.beginner._1961;

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
        InputStream input = new SampleBuilder().appendln("1 2").appendln("2 2").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YOU WIN").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = new SampleBuilder().appendln("1 2").appendln("1 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("GAME OVER").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample3() throws IOException {
        InputStream input = new SampleBuilder().appendln("5 10").appendln("1 3 6 9 7 2 4 5 8 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YOU WIN").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln("5 10").appendln("1 3 6 9 7 2 4 5 8 3").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("YOU WIN").build();

        assertEquals(expectedOutput, outContent.toString());
    }
}