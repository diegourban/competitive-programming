package urban.uri_online_judge.beginner._1080;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldCalculateRandomHighestAndPosition() throws IOException {
        SampleBuilder sb = new SampleBuilder();
        int highest = 0;
        int position = 0;
        for (int i = 1; i <= 100; i++) {
            int n = new Random().nextInt();
            if (n > highest) {
                highest = n;
                position = i;
            }
            if (i == 100) {
                sb.append(n);
            } else {
                sb.appendln(n);
            }
        }
        InputStream input = sb.buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(highest).appendln(position).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        SampleBuilder sb = new SampleBuilder();
        int highest = 0;
        int position = 0;
        for (int i = 1; i <= 100; i++) {
            int n = new Random().nextInt();
            if (n > highest) {
                highest = n;
                position = i;
            }
            if (i == 100) {
                sb.append(n);
            } else {
                sb.appendln(n);
            }
        }
        InputStream input = sb.buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(highest).appendln(position).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
