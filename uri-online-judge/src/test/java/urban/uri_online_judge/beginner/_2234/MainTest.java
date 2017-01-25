package urban.uri_online_judge.beginner._2234;

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
    public void shouldHandleOneHotDogPerParticipant() throws IOException {
        int inputs[] = {1, 1, 2, 2, 1000, 1000};
        for (int i = 0; i < inputs.length / 2; i += 2) {
            InputStream input = new SampleBuilder().append(inputs[i]).append(inputs[i + 1]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("1.00").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleTwoHotDogsPerParticipant() throws IOException {
        int inputs[] = {2, 1, 6, 3, 1000, 500};
        for (int i = 0; i < inputs.length / 2; i += 2) {
            InputStream input = new SampleBuilder().append(inputs[i]).append(inputs[i + 1]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("2.00").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleHalfHotDogPerParticipant() throws IOException {
        int inputs[] = {1, 2, 2, 4, 500, 1000};
        for (int i = 0; i < inputs.length / 2; i += 2) {
            InputStream input = new SampleBuilder().append(inputs[i]).append(inputs[i + 1]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("0.50").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        int[][] inputs = {{10, 90}, {840, 11}, {1, 50}, {34, 1000}, {35, 1000}};
        String[] outputs = {"0.11", "76.36", "0.02", "0.03", "0.04"};
        for (int i = 0; i < inputs.length; i += 2) {
            InputStream input = new SampleBuilder().append(inputs[i][0]).append(inputs[i][1]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("1.00").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
