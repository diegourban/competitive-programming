package urban.uri_online_judge.beginner._1118;

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
    public void shouldValidateSample() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln(-3.5)//
                .appendln(3.5)//
                .appendln(11.0)//
                .appendln(10.0)//
                .appendln(4)//
                .appendln(1)//
                .appendln(8.0)//
                .appendln(9.0)//
                .appendln(2).buildAsInputStream();


        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("nota invalida")//
                .appendln("nota invalida")//
                .appendln("media = 6.75")//
                .appendln("novo calculo (1-sim 2-nao)")//
                .appendln("novo calculo (1-sim 2-nao)")//
                .appendln("media = 8.50")//
                .appendln("novo calculo (1-sim 2-nao)").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln(-3.5)//
                .appendln(3.5)//
                .appendln(11.0)//
                .appendln(10.0)//
                .appendln(4)//
                .appendln(1)//
                .appendln(8.0)//
                .appendln(9.0)//
                .appendln(2).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("nota invalida")//
                .appendln("nota invalida")//
                .appendln("media = 6.75")//
                .appendln("novo calculo (1-sim 2-nao)")//
                .appendln("novo calculo (1-sim 2-nao)")//
                .appendln("media = 8.50")//
                .appendln("novo calculo (1-sim 2-nao)").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
