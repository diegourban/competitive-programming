package urban.uri_online_judge.beginner._1134;

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
    public void shouldHandleTypeAlcool() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 1")//
                .appendln("Gasolina: 0")//
                .appendln("Diesel: 0")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTypeGasolina() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 0")//
                .appendln("Gasolina: 1")//
                .appendln("Diesel: 0")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTypeDiesel() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 0")//
                .appendln("Gasolina: 0")//
                .appendln("Diesel: 1")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleOneOfEachType() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(2).appendln(3).append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 1")//
                .appendln("Gasolina: 1")//
                .appendln("Diesel: 1")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldIgnoreTypesOutOfRange() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(0).appendln(2).appendln(5).appendln(3).appendln(-1)
                .append(4).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 1")//
                .appendln("Gasolina: 1")//
                .appendln("Diesel: 1")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCountTypesOfFuelSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(8).appendln(1).appendln(7).appendln(2).appendln(2).append(4)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 1")//
                .appendln("Gasolina: 2")//
                .appendln("Diesel: 0")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(8).appendln(1).appendln(7).appendln(2).appendln(2).append(4)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("MUITO OBRIGADO")//
                .appendln("Alcool: 1")//
                .appendln("Gasolina: 2")//
                .appendln("Diesel: 0")//
                .build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
