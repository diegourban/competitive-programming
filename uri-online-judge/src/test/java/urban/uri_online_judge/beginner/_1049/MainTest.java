package urban.uri_online_judge.beginner._1049;

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
    public void shouldFindAguia() throws IOException {
        InputStream input = new SampleBuilder().appendln("vertebrado").appendln("ave").appendln("carnivoro")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("aguia").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPomba() throws IOException {
        InputStream input = new SampleBuilder().appendln("vertebrado").appendln("ave").appendln("onivoro")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("pomba").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindHomem() throws IOException {
        InputStream input = new SampleBuilder().appendln("vertebrado").appendln("mamifero").appendln("onivoro")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("homem").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindVaca() throws IOException {
        InputStream input = new SampleBuilder().appendln("vertebrado").appendln("mamifero").appendln("herbivoro")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("vaca").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindPulga() throws IOException {
        InputStream input = new SampleBuilder().appendln("invertebrado").appendln("inseto").appendln("hematofago")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("pulga").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindLagarta() throws IOException {
        InputStream input = new SampleBuilder().appendln("invertebrado").appendln("inseto").appendln("herbivoro")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("lagarta").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindSangessuga() throws IOException {
        InputStream input = new SampleBuilder().appendln("invertebrado").appendln("anelideo").appendln("hematofago")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("sanguessuga").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldFindMinhoca() throws IOException {
        InputStream input = new SampleBuilder().appendln("invertebrado").appendln("anelideo").appendln("onivoro")
                .buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("minhoca").build();

        assertEquals(expectedOutput, output);
    }

}
