package urban.uri_online_judge.beginner._1131;

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
    public void shouldHandleDraw() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln("1 1")//
                .appendln(2)//
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("1 grenais")//
                .appendln("Inter:0")//
                .appendln("Gremio:0")//
                .appendln("Empates:1")//
                .appendln("Não houve vencedor").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleInterWin() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln("2 1")//
                .appendln(2)//
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("1 grenais")//
                .appendln("Inter:1")//
                .appendln("Gremio:0")//
                .appendln("Empates:0")//
                .appendln("Inter venceu mais").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleGremioWin() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln("1 2")//
                .appendln(2)//
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("1 grenais")//
                .appendln("Inter:0")//
                .appendln("Gremio:1")//
                .appendln("Empates:0")//
                .appendln("Gremio venceu mais").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldValidateSample() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln("3 2")//
                .appendln(1)//
                .appendln("2 3")//
                .appendln(1)//
                .appendln("3 1")//
                .append(2)//
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("3 grenais")//
                .appendln("Inter:2")//
                .appendln("Gremio:1")//
                .appendln("Empates:0")//
                .appendln("Inter venceu mais").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln("3 2")//
                .appendln(1)//
                .appendln("2 3")//
                .appendln(1)//
                .appendln("3 1")//
                .append(2)//
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("Novo grenal (1-sim 2-nao)")//
                .appendln("3 grenais")//
                .appendln("Inter:2")//
                .appendln("Gremio:1")//
                .appendln("Empates:0")//
                .appendln("Inter venceu mais").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
