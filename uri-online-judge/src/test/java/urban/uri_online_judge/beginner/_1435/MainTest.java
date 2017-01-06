package urban.uri_online_judge.beginner._1435;

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

    private SampleLoader scl = new SampleLoader("beginner", "1435");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSquareMatrixOfSize1() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("  1").appendln("").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSquareMatrixOfSize2() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample2SquareMatrix.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSquareMatrixOfSize3() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample3SquareMatrix.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSquareMatrixOfSize4() throws IOException {
        InputStream input = new SampleBuilder().appendln(4).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample4SquareMatrix.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSquareMatrixOfSize5() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample5SquareMatrix.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSquareMatrixOfSize100() throws IOException {
        InputStream input = new SampleBuilder().appendln(100).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sample100SquareMatrix.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSequenceOfMatrixes() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleSequenceOfMatrixes.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleSequenceOfMatrixes.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSequenceOfMatrixes2() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleSequenceOfMatrixes2.in");

        String output = Main.main(input);

        String expectedOutput = scl.loadAsString("sampleSequenceOfMatrixes2.out");

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = scl.loadAsInputStream("sampleSequenceOfMatrixes2.in");
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = scl.loadAsString("sampleSequenceOfMatrixes2.out");

        assertEquals(expectedOutput, outContent.toString());
    }

}
