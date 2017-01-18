package urban.uri_online_judge.beginner._1564;

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
    public void shouldHandleNoComplaint() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("vai ter copa!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleAnyComplaint() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(2).appendln(50).appendln(99).append(100).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("vai ter duas!").appendln("vai ter duas!").appendln("vai ter duas!").appendln("vai ter duas!").appendln("vai ter duas!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(0).appendln(1).appendln(0).appendln(2).appendln(100).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("vai ter copa!").appendln("vai ter duas!").appendln("vai ter copa!").appendln("vai ter duas!").appendln("vai ter duas!").appendln("vai ter copa!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(0).appendln(1).appendln(0).appendln(2).appendln(100).append(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("vai ter copa!").appendln("vai ter duas!").appendln("vai ter copa!").appendln("vai ter duas!").appendln("vai ter duas!").appendln("vai ter copa!").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
