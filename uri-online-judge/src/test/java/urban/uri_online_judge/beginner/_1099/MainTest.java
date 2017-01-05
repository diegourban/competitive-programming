package urban.uri_online_judge.beginner._1099;

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
    public void shouldHandlePositiveOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).append(5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(4).append(6).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveOddEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(5).append(8).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(7).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveEvenOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(10).append(12).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(11).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-1).append(-5).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-4).append(-6).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-5).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeOddEvenInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-5).append(-8).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-7).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeEvenOddInputs() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-10).append(-12).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(-11).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSameNegativeOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-3).append(3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSameNegativeEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-4).append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSamePositiveOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(55).append(55).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSamePositiveEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(40).append(40).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveEvenNegativeOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(2).append(-3).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePositiveOddNegativeEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(8).append(-4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(12).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeEvenPositiveOdd() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-4).append(15).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(45).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNegativeOddPositiveEven() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(-9).append(10).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(9).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSample() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln(7)//
                .appendln("4 5")//
                .appendln("13 10")//
                .appendln("6 4")//
                .appendln("3 3")//
                .appendln("3 5")//
                .appendln("3 4")//
                .append("3 8").buildAsInputStream();


        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln(0)//
                .appendln(11)//
                .appendln(5)//
                .appendln(0)//
                .appendln(0)//
                .appendln(0)//
                .appendln(12)//
                .build();

        assertEquals(expectedOutput, output);
    }

}
