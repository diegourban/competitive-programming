package urban.uri_online_judge.beginner._1045;

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
    public void shouldHandleTriangleSample1() throws IOException {
        InputStream input = new SampleBuilder().append(7.0).append(5.0).append(7.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("TRIANGULO ACUTANGULO").appendln("TRIANGULO ISOSCELES")
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTriangleSample2() throws IOException {
        InputStream input = new SampleBuilder().append(6.0).append(6.0).append(10.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("TRIANGULO OBTUSANGULO").appendln("TRIANGULO ISOSCELES")
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTriangleSample3() throws IOException {
        InputStream input = new SampleBuilder().append(6.0).append(6.0).append(6.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("TRIANGULO ACUTANGULO").appendln("TRIANGULO EQUILATERO")
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTriangleSample4() throws IOException {
        InputStream input = new SampleBuilder().append(5.0).append(7.0).append(2.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("NAO FORMA TRIANGULO").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTriangleSample5() throws IOException {
        InputStream input = new SampleBuilder().append(6.0).append(8.0).append(10.0).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("TRIANGULO RETANGULO").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(6.0).append(8.0).append(10.0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("TRIANGULO RETANGULO").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
