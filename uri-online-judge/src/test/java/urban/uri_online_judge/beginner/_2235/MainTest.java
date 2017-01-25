package urban.uri_online_judge.beginner._2235;

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
    public void shouldHandleCreditsTharAreNotPossibleToGoBackToPresent() throws IOException {
        int[][] inputs = {{1, 2, 4}, {3, 10, 6}, {2, 3, 4}};
        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i][0]).append(inputs[i][1]).append(inputs[i][2]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("N").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleThreeTrips() throws IOException {
        int[][] inputs = {{1, 1, 2}, {1, 2, 1}, {2, 1, 1}};
        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i][0]).append(inputs[i][1]).append(inputs[i][2]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("S").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleTwoTrips() throws IOException {
        int[][] inputs = {{1, 1, 3}, {1, 3, 1}, {3, 1, 1}, {1, 1, 1}, {1, 2, 1}};
        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i][0]).append(inputs[i][1]).append(inputs[i][2]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("S").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        int[][] inputs = {{22, 5, 22}, {31, 110, 79}, {45, 8, 7}};
        String[] outputs = {"S", "S", "N"};
        for (int i = 0; i < inputs.length; i += 2) {
            InputStream input = new SampleBuilder().append(inputs[i][0]).append(inputs[i][1]).append(inputs[i][2]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(2).append(3).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("S").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
