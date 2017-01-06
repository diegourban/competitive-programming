package urban.uri_online_judge.beginner._1035;

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

    // B > C == false
    @Test
    public void shouldValidateSelectionTestBranch1() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(0).append(0).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    @Test
    public void shouldValidateSelectionTestBranch2() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(1).append(0).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == false
    @Test
    public void shouldValidateSelectionTestBranch3() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(1).append(0).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    @Test
    public void shouldValidateSelectionTestBranch4() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(1).append(0).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    // C + D > A + B == false
    @Test
    public void shouldValidateSelectionTestBranch5() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(1).append(0).append(1).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    // C + D > A + B == true
    @Test
    public void shouldValidateSelectionTestBranch6() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(1).append(0).append(2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    // C + D > A + B == true
    // C > 0 == false
    @Test
    public void shouldValidateSelectionTestBranch7() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(1).append(0).append(2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    // C + D > A + B == true
    // C > 0 == true
    @Test
    public void shouldValidateSelectionTestBranch8() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(2).append(1).append(3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    // C + D > A + B == true
    // C > 0 == true
    // D > 0 == false
    @Test
    public void shouldValidateSelectionTestBranch9() throws IOException {
        InputStream input = new SampleBuilder().append(-2).append(4).append(3).append(0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    // B > C == true
    // D > A == true
    // C + D > A + B == true
    // C > 0 == true
    // D > 0 == true
    // A % 2 == 0 == false
    @Test
    public void shouldValidateSelectionTestBranch10And11() throws IOException {
        InputStream input = new SampleBuilder().append(1).append(3).append(2).append(3).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldValidateSelectionTestBranch12() throws IOException {
        InputStream input = new SampleBuilder().append(0).append(2).append(1).append(2).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores aceitos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldValidateSelectionTestSample1() throws IOException {
        InputStream input = new SampleBuilder().append(5).append(6).append(7).append(8).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldValidateSelectionTestSample2() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(3).append(2).append(6).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Valores aceitos").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(2).append(3).append(2).append(6).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Valores aceitos").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
