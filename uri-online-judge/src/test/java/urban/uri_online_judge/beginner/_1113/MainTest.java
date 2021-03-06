package urban.uri_online_judge.beginner._1113;

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
    public void shouldStopEqualInputs() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().append("").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleAscendingOrder() throws IOException {
        InputStream input = new SampleBuilder().append(0).appendln(1).append(2).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Crescente").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleDescendingOrder() throws IOException {
        InputStream input = new SampleBuilder().append(1).appendln(0).append(2).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Decrescente").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample() throws IOException {
        InputStream input = new SampleBuilder().append(5).appendln(4).append(7).appendln(2).append(3).appendln(8)
                .append(2).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Decrescente").appendln("Decrescente")
                .appendln("Crescente").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(5).appendln(4).append(7).appendln(2).append(3).appendln(8)
                .append(2).append(2).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Decrescente").appendln("Decrescente")
                .appendln("Crescente").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
