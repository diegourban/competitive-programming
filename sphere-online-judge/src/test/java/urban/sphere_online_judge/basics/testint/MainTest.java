package urban.sphere_online_judge.basics.testint;

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
    public void shouldHandleSumOfNegativeNumbers() throws IOException {
        InputStream input = new SampleBuilder().appendln(-5).append(-6).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-11).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSumOfPositiveNumbers() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(5).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(7).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSumOfPositiveAndNegativeNumbers() throws IOException {
        InputStream input = new SampleBuilder().appendln(-3).append(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-1).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSumOfMaxInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(200).appendln(200).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(400).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(3).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(3).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(5).build();

        assertEquals(expectedOutput, outContent.toString());
    }
}
