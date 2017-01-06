package urban.uri_online_judge.beginner._1018;

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
    public void shouldCalculateExactly100Note() throws IOException {
        InputStream input = new SampleBuilder().append(100).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("100").appendln("1 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly50Note() throws IOException {
        InputStream input = new SampleBuilder().append(50).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("50").appendln("0 nota(s) de R$ 100,00")
                .appendln("1 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly20Note() throws IOException {
        InputStream input = new SampleBuilder().append(20).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("20").appendln("0 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("1 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly10Note() throws IOException {
        InputStream input = new SampleBuilder().append(10).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("10").appendln("0 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("1 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly5Note() throws IOException {
        InputStream input = new SampleBuilder().append(5).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("5").appendln("0 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("1 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly2Note() throws IOException {
        InputStream input = new SampleBuilder().append(2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("2").appendln("0 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly1Note() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1").appendln("0 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateExactly1OfEach() throws IOException {
        InputStream input = new SampleBuilder().append(188).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("188").appendln("1 nota(s) de R$ 100,00")
                .appendln("1 nota(s) de R$ 50,00").appendln("1 nota(s) de R$ 20,00").appendln("1 nota(s) de R$ 10,00")
                .appendln("1 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBanknotesSample1() throws IOException {
        InputStream input = new SampleBuilder().append(576).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("576").appendln("5 nota(s) de R$ 100,00")
                .appendln("1 nota(s) de R$ 50,00").appendln("1 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("1 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBanknotesSample2() throws IOException {
        InputStream input = new SampleBuilder().append(11257).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("11257").appendln("112 nota(s) de R$ 100,00")
                .appendln("1 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("1 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateBanknotesSample3() throws IOException {
        InputStream input = new SampleBuilder().append(503).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("503").appendln("5 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateMinEntry() throws IOException {
        InputStream input = new SampleBuilder().append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("0").appendln("0 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateMaxEntry() throws IOException {
        InputStream input = new SampleBuilder().append(1000000).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("1000000").appendln("10000 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(1000000).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("1000000").appendln("10000 nota(s) de R$ 100,00")
                .appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
                .appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
                .build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
