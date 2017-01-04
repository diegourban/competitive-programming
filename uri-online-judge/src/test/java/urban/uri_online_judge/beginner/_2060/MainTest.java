package urban.uri_online_judge.beginner._2060;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleMultipleOf2() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(2).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 Multiplo(s) de 2").appendln("0 Multiplo(s) de 3").appendln("0 Multiplo(s) de 4").appendln("0 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMultipleOf3() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(3).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 Multiplo(s) de 2").appendln("1 Multiplo(s) de 3").appendln("0 Multiplo(s) de 4").appendln("0 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMultipleOf4And2() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(4).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 Multiplo(s) de 2").appendln("0 Multiplo(s) de 3").appendln("1 Multiplo(s) de 4").appendln("0 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleMultipleOf5() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(5).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 Multiplo(s) de 2").appendln("0 Multiplo(s) de 3").appendln("0 Multiplo(s) de 4").appendln("1 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle1MultipleOfEach() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(3).append(4).append(5).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 Multiplo(s) de 2").appendln("1 Multiplo(s) de 3").appendln("1 Multiplo(s) de 4").appendln("1 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(5).append("2 5 4 20 10").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("4 Multiplo(s) de 2").appendln("0 Multiplo(s) de 3").appendln("2 Multiplo(s) de 4").appendln("3 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleLowestL() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("0 Multiplo(s) de 2").appendln("0 Multiplo(s) de 3").appendln("0 Multiplo(s) de 4").appendln("0 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestL() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(100).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("1 Multiplo(s) de 2").appendln("0 Multiplo(s) de 3").appendln("1 Multiplo(s) de 4").appendln("1 Multiplo(s) de 5").build();
        assertEquals(expectedOutput, output);
    }

}