package urban.uri_online_judge.beginner._1015;

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
    public void shouldCalculateDistance1() throws IOException {
        InputStream input = new SampleBuilder().append(1.0).appendln(7.0).append(5.0).append(9.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("4.4721").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDistance2() throws IOException {
        InputStream input = new SampleBuilder().append(-2.5).appendln(0.4).append(12.1).append(7.3)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("16.1484").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateDistance3() throws IOException {
        InputStream input = new SampleBuilder().append(2.5).appendln(-0.4).append(-12.2).append(7.0)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("16.4575").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().append(2.5).appendln(-0.4).append(-12.2).append(7.0).buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("16.4575").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
