package urban.uri_online_judge.structure._1022;

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

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleUnexpectedOperation() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("1 / 4 . 1 / 4").buildAsInputStream();

        String output = Main.main(input);

        assertEquals("", output);
    }

    @Test
    public void shouldCalculateRationalSampleSum() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("1 / 4 + 1 / 4").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("8/16 = 1/2").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRationalSampleSubtraction() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("3 / 4 - 1 / 4").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("8/16 = 1/2").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRationalSampleMultiplication() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("1 / 2 * 2 / 5").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("2/10 = 1/5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRationalSampleDivision() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append("1 / 2 / 1 / 6").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("6/2 = 3/1").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRationalSample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).appendln("1 / 2 + 3 / 4").appendln("1 / 2 - 3 / 4")
                .appendln("2 / 3 * 6 / 6").append("1 / 2 / 3 / 4").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("10/8 = 5/4").appendln("-2/8 = -1/4")
                .appendln("12/18 = 2/3").appendln("4/6 = 2/3").build();
        assertEquals(expectedOutput, output);
    }

}
