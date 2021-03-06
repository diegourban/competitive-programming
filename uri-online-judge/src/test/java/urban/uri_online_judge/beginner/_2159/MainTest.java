package urban.uri_online_judge.beginner._2159;

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
    public void shouldHandleLowerLimit() throws IOException {
        InputStream input = new SampleBuilder().append(17).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("6.0 7.5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUpperLimit() throws IOException {
        InputStream input = new SampleBuilder().append(1000000000).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("48254942.4 60562848.1").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        int[] inputs = {17, 50, 100};
        String[] outputs = {"6.0 7.5", "12.8 16.0", "21.7 27.3"};

        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1000000000).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("48254942.4 60562848.1").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
