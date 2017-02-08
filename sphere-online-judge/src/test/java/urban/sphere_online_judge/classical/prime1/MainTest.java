package urban.sphere_online_judge.classical.prime1;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private final SampleLoader sl = new SampleLoader("classical", "prime1");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleOneTestCase() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1 100").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(5).appendln(7)
                .appendln(11).appendln(13).appendln(17).appendln(19)
                .appendln(23).appendln(29)
                .appendln(31).appendln(37)
                .appendln(41).appendln(43).appendln(47)
                .appendln(53).appendln(59)
                .appendln(61).appendln(67)
                .appendln(71).appendln(73).appendln(79)
                .appendln(83).appendln(89)
                .appendln(97)
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTenTestCases() throws IOException {
        InputStream input = new SampleBuilder().appendln(10)
                .appendln("1 2")
                .appendln("2 3")
                .appendln("3 4")
                .appendln("4 5")
                .appendln("5 6")
                .appendln("6 7")
                .appendln("7 8")
                .appendln("8 9")
                .appendln("9 10")
                .appendln("10 11").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()
                .appendln(2).appendln("")
                .appendln(2).appendln(3).appendln("")
                .appendln(3).appendln("")
                .appendln(5).appendln("")
                .appendln(5).appendln("")
                .appendln(7).appendln("")
                .appendln(7).appendln("")
                .appendln("")
                .appendln("")
                .appendln(11)
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("1 10").appendln("3 5").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(5).appendln(7).appendln("").appendln(3).appendln(5).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxDifSmallNumber() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1 100001").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("sampleMaxDifSmall.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxDifLargeNumber() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("999900000 1000000000").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("sampleMaxDifLarge.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("1 10").appendln("3 5").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(5).appendln(7).appendln("").appendln(3).appendln(5).build();

        assertEquals(expectedOutput, outContent.toString());
    }
}
