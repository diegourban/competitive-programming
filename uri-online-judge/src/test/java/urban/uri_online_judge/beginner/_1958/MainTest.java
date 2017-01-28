package urban.uri_online_judge.beginner._1958;

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
    public void shouldConvertURISample1() throws IOException {
        InputStream input = new SampleBuilder().append(3.141592).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("+3.1416E+00").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertURISample2() throws IOException {
        InputStream input = new SampleBuilder().append(1.618033).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("+1.6180E+00").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertURISample3() throws IOException {
        InputStream input = new SampleBuilder().append("602214085774747474747474").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("+6.0221E+23").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertURISample4() throws IOException {
        InputStream input = new SampleBuilder().append("-0.000027").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("-2.7000E-05").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConvertURISample5() throws IOException {
        InputStream input = new SampleBuilder().append("-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("-1.0000E+100").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeZero() throws IOException {
        InputStream input = new SampleBuilder().append("-0").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("-0.0000E+00").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveZero() throws IOException {
        InputStream input = new SampleBuilder().append("+0").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("+0.0000E+00").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(3.141592).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("+3.1416E+00").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
