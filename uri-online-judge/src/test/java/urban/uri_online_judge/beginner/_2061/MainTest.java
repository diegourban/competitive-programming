package urban.uri_online_judge.beginner._2061;

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
    public void shouldHandleOneClose() throws IOException {
        InputStream input = new SampleBuilder().appendln("1 1").append("fechou").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneClick() throws IOException {
        InputStream input = new SampleBuilder().appendln("1 1").append("clicou").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln("3 5").appendln("fechou").appendln("fechou").appendln("clicou").appendln("clicou").appendln("clicou").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln("3 5").appendln("fechou").appendln("fechou").appendln("clicou").appendln("clicou").appendln("clicou").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(2).build();

        assertEquals(expectedOutput, outContent.toString());
    }

}