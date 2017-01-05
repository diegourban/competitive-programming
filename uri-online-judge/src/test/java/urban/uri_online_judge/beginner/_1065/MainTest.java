package urban.uri_online_judge.beginner._1065;

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
    public void shouldNotFindAnyEven() throws IOException {
        InputStream input = new SampleBuilder().append(-7).append(-5).append(1).append(-3).append(11)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 valores pares").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPositiveEvens() throws IOException {
        InputStream input = new SampleBuilder().append(-7).append(6).append(1).append(-3).append(12)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("2 valores pares").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindNegativeEvens() throws IOException {
        InputStream input = new SampleBuilder().append(-8).append(-12).append(1).append(-4).append(11)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("3 valores pares").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindEvenSample() throws IOException {
        InputStream input = new SampleBuilder().append(-7).append(-5).append(6).append(-4).append(12)
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("3 valores pares").build();

        assertEquals(expectedOutput, output);
    }

}
