package urban.uri_online_judge.beginner._1079;

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
    public void shouldCalculateWeightedAveragesZero() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("0.0 0.0 0.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateWeightedAveragesOne() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1.0 1.0 1.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateWeightedAveragesSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln("6.5 4.3 6.2").appendln("5.1 4.2 8.1")
                .appendln("8.0 9.0 10.0").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5.7).appendln(6.3).appendln(9.3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln("6.5 4.3 6.2").appendln("5.1 4.2 8.1")
                .appendln("8.0 9.0 10.0").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(5.7).appendln(6.3).appendln(9.3).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
