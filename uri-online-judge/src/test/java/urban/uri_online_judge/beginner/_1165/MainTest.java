package urban.uri_online_judge.beginner._1165;

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
    public void shouldHandle1() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 nao eh primo").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLowestXInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("2 eh primo").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestXInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(10000000).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("10000000 nao eh primo").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculatePrimeNumberSample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln(8).appendln(51).appendln(7).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("8 nao eh primo").appendln("51 nao eh primo")
                .appendln("7 eh primo").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConsiderAllPrimesNumbers() throws IOException {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 79, 137, 193, 257, 317, 389, 457, 523, 601};
        SampleBuilder sb = new SampleBuilder();
        sb.appendln(primes.length);
        for (int i = 0; i < primes.length; i++) {
            sb.appendln(primes[i]);
        }
        InputStream input = sb.buildAsInputStream();


        String output = Main.main(input);

        SampleBuilder osb = new SampleBuilder();
        for (int i = 0; i < primes.length; i++) {
            osb.append(primes[i]).appendln("eh primo");
        }
        String expectedOutput = osb.build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldConsiderAllNonPrimeNumbers() throws IOException {
        int[] primes = {4, 6, 8, 12, 14, 18, 20, 24, 30, 32, 80, 138, 194, 258, 318, 390, 458, 524, 602};

        SampleBuilder sb = new SampleBuilder();
        sb.appendln(primes.length);
        for (int i = 0; i < primes.length; i++) {
            sb.appendln(primes[i]);
        }
        InputStream input = sb.buildAsInputStream();


        String output = Main.main(input);

        SampleBuilder osb = new SampleBuilder();
        for (int i = 0; i < primes.length; i++) {
            osb.append(primes[i]).appendln("nao eh primo");
        }
        String expectedOutput = osb.build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("1 nao eh primo").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
