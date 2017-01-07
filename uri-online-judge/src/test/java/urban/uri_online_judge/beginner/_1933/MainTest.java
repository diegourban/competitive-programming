package urban.uri_online_judge.beginner._1933;

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
    public void shouldMaximizeToThreeOfAKind() throws IOException {
        for (int i = 1; i <= 13; i++) {
            InputStream input = new SampleBuilder().append(i).append(i).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(i).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldMaximizeToPair() throws IOException {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 13; j++) {
                if (i != j) {
                    InputStream input = new SampleBuilder().append(i).append(j).buildAsInputStream();
                    String output = Main.main(input);
                    String expectedOutput = new SampleBuilder().appendln(Math.max(i, j)).build();
                    assertEquals(expectedOutput, output);
                }
            }
        }
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 13; j++) {
                if (i != j) {
                    InputStream input = new SampleBuilder().append(i).append(j).buildAsInputStream();
                    System.setIn(input);

                    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outContent));

                    Main.main(new String[]{});

                    String expectedOutput = new SampleBuilder().appendln(Math.max(i, j)).build();

                    assertEquals(expectedOutput, outContent.toString());
                }
            }
        }
    }

}
