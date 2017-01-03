package urban.uri_online_judge.beginner._2161;

import org.junit.Test;
import urban.uri_online_judge.SampleBuilder;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleLowerLimit() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("3.0000000000").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleUpperLimit() throws IOException {
        InputStream input = new SampleBuilder().append(100).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("3.1622776602").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        int[] inputs = {0, 1, 5};
        String[] outputs = {"3.0000000000", "3.1666666667", "3.1622776623"};

        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

}