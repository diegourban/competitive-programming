package urban.uri_online_judge.beginner._1117;

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
    public void shouldHandleTwoValidScoresInSequence() throws IOException {
        InputStream input = new SampleBuilder().appendln(5.5).append(6.5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("media = 6.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldSkipInvalidScores() throws IOException {
        InputStream input = new SampleBuilder().appendln(-0.1).append(7.0).append(10.1).append(7.0)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("nota invalida")//
                .appendln("nota invalida")//
                .appendln("media = 7.00").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldValidateSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(-3.5).appendln(3.5).appendln(11.0).append(10.0)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("nota invalida")//
                .appendln("nota invalida")//
                .appendln("media = 6.75").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(-3.5).appendln(3.5).appendln(11.0).append(10.0)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("nota invalida")//
                .appendln("nota invalida")//
                .appendln("media = 6.75").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
