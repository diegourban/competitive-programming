package urban.uri_online_judge.beginner._2162;

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
    public void shouldHandleFlatLandscapes() throws IOException {
        int[] inputsN = {2, 2, 2, 10};
        int[][] inputsH = {{1, 1}, {-1, -1}, {0, 0}, {7, 7, 7, 7, 7, 7, 7, 7, 7, 7}};
        int[] outputs = {0, 0, 0, 0};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleOnlyPeaks() throws IOException {
        int[] inputsN = {3, 3, 3, 10};
        int[][] inputsH = {{1, 2, 3}, {-2, -1, 0}, {-1, 0, 1}, {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4}};
        int[] outputs = {0, 0, 0, 0, 0};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleOnlyValleys() throws IOException {
        int[] inputsN = {3, 3, 3, 10};
        int[][] inputsH = {{-1, -2, -3}, {3, 2, 1}, {1, 0, -1}, {5, 4, 3, 2, 1, 0, -1, -2, -3, -4}};
        int[] outputs = {0, 0, 0, 0, 0};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleHalfPeaks() throws IOException {
        int[] inputsN = {2, 2, 2, 2, 2};
        int[][] inputsH = {{-2, -1}, {-1, 0}, {0, 1}, {1, 2}, {50, 60}};
        int[] outputs = {1, 1, 1, 1, 1};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleHalfValleys() throws IOException {
        int[] inputsN = {2, 2, 2, 2, 2};
        int[][] inputsH = {{-1, -2}, {0, -1}, {1, 0}, {2, 1}, {60, 50}};
        int[] outputs = {1, 1, 1, 1, 1};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleSimplePeaks() throws IOException {
        int[] inputsN = {3, 3, 3, 3, 3};
        int[][] inputsH = {{-2, -1, -2}, {-1, 0, -1}, {0, 1, 0}, {1, 2, 1}, {50, 60, 50}};
        int[] outputs = {1, 1, 1, 1, 1};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleSimpleValleys() throws IOException {
        int[] inputsN = {3, 3, 3, 3, 3};
        int[][] inputsH = {{-1, -2, -1}, {0, -1, 0}, {1, 0, 1}, {2, 1, 2}, {60, 50, 60}};
        int[] outputs = {1, 1, 1, 1, 1};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        int[] inputsN = {3, 5, 4};
        int[][] inputsH = {{1, 4, -2}, {100, 99, 112, -8, -7}, {1, 2, 2, 1}};
        int[] outputs = {1, 1, 0};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        int[] inputsN = {3, 5, 4};
        int[][] inputsH = {{1, 4, -2}, {100, 99, 112, -8, -7}, {1, 2, 2, 1}};
        int[] outputs = {1, 1, 0};

        for (int i = 0; i < inputsN.length; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(inputsN[i]);
            for (int j = 0; j < inputsH[i].length; j++) {
                sb.append(inputsH[i][j]);
            }
            InputStream input = sb.buildAsInputStream();
            System.setIn(input);

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            Main.main(new String[]{});

            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();

            assertEquals(expectedOutput, outContent.toString());
        }

    }

}
