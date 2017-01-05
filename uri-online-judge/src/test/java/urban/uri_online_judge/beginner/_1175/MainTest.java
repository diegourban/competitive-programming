package urban.uri_online_judge.beginner._1175;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample() throws IOException {
        int[] in = {-54, -78, -84, 89, 16, 28, 91, -4, 84, -95, -15, -23, 20, -17, 30, -75, 54, 85, 23, 5};

        SampleBuilder sbin = new SampleBuilder();
        for (int i = 0; i < in.length; i++) {
            sbin.appendln(in[i]);
        }
        InputStream input = sbin.buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sbout = new StringBuilder();
        for (int i = in.length - 1; i >= 0; i--) {
            sbout.append("N[").append((in.length - 1) - i).append("] = ").append(in[i]).append(System.lineSeparator());
        }
        String expectedOutput = sbout.toString();

        assertEquals(expectedOutput, output);
    }

}
