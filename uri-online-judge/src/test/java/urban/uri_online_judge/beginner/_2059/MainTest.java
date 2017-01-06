package urban.uri_online_judge.beginner._2059;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandlePlayer1Wins() throws IOException {
        List<int[]> inputs = new ArrayList<>();
        // fair win of p1 without cheating
        inputs.add(new int[]{0, 1, 2, 0, 0});
        inputs.add(new int[]{1, 1, 1, 0, 0});

        // p2 accusing a fair win of p1
        inputs.add(new int[]{0, 1, 2, 0, 1});
        inputs.add(new int[]{1, 1, 1, 0, 1});

        // p1 cheating a fair win without p2 accusing
        inputs.add(new int[]{0, 1, 2, 1, 0});
        inputs.add(new int[]{1, 1, 1, 1, 0});

        // p1 cheating an unfair win without p2 accusing
        inputs.add(new int[]{0, 1, 1, 1, 0});
        inputs.add(new int[]{1, 1, 2, 1, 0});

        for (int[] in : inputs) {
            InputStream input = new SampleBuilder().append(in[0]).append(in[1]).append(in[2]).append(in[3]).append(in[4]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("Jogador 1 ganha!").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandlePlayer2Wins() throws IOException {
        List<int[]> inputs = new ArrayList<>();
        // fair win of p2
        inputs.add(new int[]{0, 1, 1, 0, 0});
        inputs.add(new int[]{1, 1, 2, 0, 0});

        // p1 cheating on a fair game and p2 accusing it
        inputs.add(new int[]{0, 1, 2, 1, 1});
        inputs.add(new int[]{1, 1, 1, 1, 1});

        // p1 cheating on a unfair game and p2 accusing it
        inputs.add(new int[]{0, 1, 1, 1, 1});
        inputs.add(new int[]{1, 1, 2, 1, 1});

        for (int[] in : inputs) {
            InputStream input = new SampleBuilder().append(in[0]).append(in[1]).append(in[2]).append(in[3]).append(in[4]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("Jogador 2 ganha!").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = new SampleBuilder().append("1 4 5 0 0").buildAsInputStream();
        InputStream input2 = new SampleBuilder().append("1 4 5 1 0").buildAsInputStream();
        InputStream input3 = new SampleBuilder().append("1 4 5 1 1").buildAsInputStream();

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);
        String output3 = Main.main(input3);

        String expectedOutput1 = new SampleBuilder().appendln("Jogador 2 ganha!").build();
        String expectedOutput2 = new SampleBuilder().appendln("Jogador 1 ganha!").build();
        String expectedOutput3 = new SampleBuilder().appendln("Jogador 2 ganha!").build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append("1 4 5 0 0").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Jogador 2 ganha!").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}