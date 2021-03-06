package urban.uri_online_judge.beginner._1930;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader scl = new SampleLoader("beginner", "1930");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = scl.loadAsInputStream("sampleURI1.in");
        InputStream input2 = scl.loadAsInputStream("sampleURI2.in");
        InputStream input3 = scl.loadAsInputStream("sampleURI3.in");

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);
        String output3 = Main.main(input3);

        String expectedOutput1 = new SampleBuilder().appendln("8").build();
        String expectedOutput2 = new SampleBuilder().appendln("21").build();
        String expectedOutput3 = new SampleBuilder().appendln("5").build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleURI1.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("8").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}

