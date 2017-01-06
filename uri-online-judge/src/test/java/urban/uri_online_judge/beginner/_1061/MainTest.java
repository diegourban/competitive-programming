package urban.uri_online_judge.beginner._1061;

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
    public void shouldCalculateMinimumEventTime() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 3").appendln("08 : 12 : 23").appendln("Dia 3")
                .append("08 : 13 : 23").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 0 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("0 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate59Seconds() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 0 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("0 minuto(s)")
                .appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Minute() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 1 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Minute1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 1 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Minute59Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 1 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)")
                .appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate59Minutes() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 59 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("59 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate59Minutes59Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("0 : 59 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("59 minuto(s)")
                .appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Hour() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("1 : 0 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("0 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Hour1Minute() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("1 : 1 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Hour1Minute1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("1 : 1 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Hour59Minutes1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("1 : 59 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("59 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Hour59Minutes59Seconds() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("1 : 59 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("59 minuto(s)")
                .appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate23Hours() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("23 : 0 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("23 hora(s)").appendln("0 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate23Hours59minutes() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("23 : 59 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate23Hours59Minutes59Seconds() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1")
                .append("23 : 59 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)")
                .appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("0 : 0 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("0 hora(s)").appendln("0 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day1Hour() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("1 : 0 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("1 hora(s)").appendln("0 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day1Hour1Minute() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("1 : 1 : 0").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day1Hour1Minute1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("1 : 1 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day23Hours1Minute1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("23 : 1 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("23 hora(s)").appendln("1 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day23Hours59Minutes1Second() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("23 : 59 : 1").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)")
                .appendln("1 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate1Day23Hours59Minutes59Seconds() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2")
                .append("23 : 59 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)")
                .appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculate29Days23Hours59Minutes59Seconds() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 30")
                .append("23 : 59 : 59").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("29 dia(s)").appendln("23 hora(s)")
                .appendln("59 minuto(s)").appendln("59 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateEventTimeSample1() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 5").appendln("08 : 12 : 23").appendln("Dia 9")
                .append("06 : 13 : 23").buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("3 dia(s)").appendln("22 hora(s)").appendln("1 minuto(s)")
                .appendln("0 segundo(s)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 5").appendln("08 : 12 : 23").appendln("Dia 9")
                .append("06 : 13 : 23").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("3 dia(s)").appendln("22 hora(s)").appendln("1 minuto(s)")
                .appendln("0 segundo(s)").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
