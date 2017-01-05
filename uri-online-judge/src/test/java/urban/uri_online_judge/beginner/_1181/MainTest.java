package urban.uri_online_judge.beginner._1181;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.common.SampleLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private SampleLoader scl = new SampleLoader("beginner", "1181");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample1() throws IOException {
        InputStream input = scl.loadAsInputStream("sample1.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(-202.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample2() throws IOException {
        InputStream input = scl.loadAsInputStream("sample2.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(-16.8).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample3() throws IOException {
        InputStream input = scl.loadAsInputStream("sample3.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(0.0).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReadFirstLine() throws IOException {
        InputStream input = scl.loadAsInputStream("sample4.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(-99.3).build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReadLastLine() throws IOException {
        InputStream input = scl.loadAsInputStream("sample5.in");

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln(-107.0).build();

        assertEquals(expectedOutput, output);
    }

}
