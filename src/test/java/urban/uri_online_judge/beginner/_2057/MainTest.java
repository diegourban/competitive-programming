package urban.uri_online_judge.beginner._2057;

import org.junit.Test;
import urban.uri_online_judge.SampleBuilder;

import java.io.IOException;
import java.io.InputStream;
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
    public void shouldHandleLimits() throws IOException {
        List<int[]> inputs = new ArrayList<>();
        inputs.add(new int[]{0, 1, -5});
        inputs.add(new int[]{0, 1, 5});
        inputs.add(new int[]{0, 12, -5});
        inputs.add(new int[]{0, 12, 5});
        inputs.add(new int[]{23, 1, -5});
        inputs.add(new int[]{23, 1, 5});
        inputs.add(new int[]{23, 12, -5});
        inputs.add(new int[]{23, 12, 5});

        List<Integer> outputs = new ArrayList<>();
        outputs.add(20);
        outputs.add(6);
        outputs.add(7);
        outputs.add(17);
        outputs.add(19);
        outputs.add(5);
        outputs.add(6);
        outputs.add(16);

        for (int i = 0; i < inputs.size(); i++) {
            InputStream input = new SampleBuilder().append(inputs.get(i)[0]).append(inputs.get(i)[1]).append(inputs.get(i)[2]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs.get(i)).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldConsider24as0() throws IOException {
        InputStream input = new SampleBuilder().append(23).append(1).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = new SampleBuilder().append(10).append(7).append(3).buildAsInputStream();
        InputStream input2 = new SampleBuilder().append(22).append(6).append(-2).buildAsInputStream();
        InputStream input3 = new SampleBuilder().append(0).append(3).append(-4).buildAsInputStream();

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);
        String output3 = Main.main(input3);

        String expectedOutput1 = new SampleBuilder().appendln(20).build();
        String expectedOutput2 = new SampleBuilder().appendln(2).build();
        String expectedOutput3 = new SampleBuilder().appendln(23).build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
        assertEquals(expectedOutput3, output3);
    }

}