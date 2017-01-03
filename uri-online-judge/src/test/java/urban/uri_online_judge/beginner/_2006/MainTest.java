package urban.uri_online_judge.beginner._2006;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleNoneCorrectAnswers() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("2 3 4 2 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(0).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneCorrectAnswer() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("1 3 4 2 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleAllCorrectAnswers() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln("3 3 3 3 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(5).build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        InputStream input1 = new SampleBuilder().appendln(1).appendln("1 2 3 2 1").buildAsInputStream();
        InputStream input2 = new SampleBuilder().appendln(3).appendln("4 1 1 2 1").buildAsInputStream();

        String output1 = Main.main(input1);
        String output2 = Main.main(input2);

        String expectedOutput1 = new SampleBuilder().appendln(2).build();
        String expectedOutput2 = new SampleBuilder().appendln(0).build();

        assertEquals(expectedOutput1, output1);
        assertEquals(expectedOutput2, output2);
    }

}
