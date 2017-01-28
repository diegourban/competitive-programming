package urban.uri_online_judge.beginner._2126;

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

    private final SampleLoader sl = new SampleLoader("beginner", "2126");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleNoSubsequence() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(23456789).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Nao existe subsequencia").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneDigitSequence() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 1").appendln("Pos: 1").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneDigitSubsequenceAtTheBeginning() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(123).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 1").appendln("Pos: 1").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneDigitSubsequenceAtTheMiddle() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(213).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 1").appendln("Pos: 2").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneDigitSubsequenceAtTheEnd() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(231).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 1").appendln("Pos: 3").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTwoDigitSequence() throws IOException {
        InputStream input = new SampleBuilder().appendln(12).append(12).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 1").appendln("Pos: 1").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleRepeatingSequenceOneDigit() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1111).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 4").appendln("Pos: 4").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleRepeatingSequenceTwoDigits() throws IOException {
        InputStream input = new SampleBuilder().appendln(11).append(1111).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 3").appendln("Pos: 3").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMaxSequence() throws IOException {
        InputStream input = new SampleBuilder().appendln("100000000000000000000000000000000").append("100000000000000000000000000000000").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Qtd.Subsequencias: 1").appendln("Pos: 1").appendln("").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = sl.loadAsInputStream("uri.in");
        String output = Main.main(input);
        String expectedOutput = sl.loadAsString("uri.out");
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(23456789).buildAsInputStream();
        System.setIn(input);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Caso #1:").appendln("Nao existe subsequencia").appendln("").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}