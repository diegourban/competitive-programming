package urban.uri_online_judge.beginner._1014;

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
    public void shouldCalculateConsumption1() throws IOException {
        InputStream input = new SampleBuilder().appendln(500).append(35.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("14.286 km/l").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateConsumption2() throws IOException {
        InputStream input = new SampleBuilder().appendln(2254).append(124.4).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("18.119 km/l").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateConsumption3() throws IOException {
        InputStream input = new SampleBuilder().appendln(4554).append(464.6).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("9.802 km/l").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln(4554).append(464.6).buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("9.802 km/l").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
