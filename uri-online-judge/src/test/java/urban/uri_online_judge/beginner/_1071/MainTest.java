package urban.uri_online_judge.beginner._1071;

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
    public void shouldHandlePositiveOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(11).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(24).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(10).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(24).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveOddEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(13).appendln(20).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(51).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveEvenOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(30).appendln(35).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(64).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(-3).appendln(-27).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-165).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(-10).appendln(-20).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-75).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeOddEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(-7).appendln(-20).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-84).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeEvenOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(-2).appendln(-7).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-8).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSameNegativeOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(-3).appendln(-3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSameNegativeEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(-4).appendln(-4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSamePositiveOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(55).appendln(55).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSamePositiveEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(40).appendln(40).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveEvenNegativeOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln(-3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveOddNegativeEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(8).appendln(-4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(12).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeEvenPositiveOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(-4).appendln(15).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(45).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeOddPositiveEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(-9).appendln(10).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(9).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(6).appendln(-5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample2() throws IOException {
        InputStream input = new SampleBuilder().appendln(15).appendln(12).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(13).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample3() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).appendln(12).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).appendln(12).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
