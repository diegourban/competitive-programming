package urban.uri_online_judge.beginner._2031;

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
    public void shouldHandleMutualAnnihilation() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("ataque").appendln("ataque").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Aniquilacao mutua").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleNoWinner() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("pedra").appendln("pedra").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Sem ganhador").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleBothWin() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("papel").appendln("papel").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Ambos venceram").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePlayer1Wins() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln("ataque").appendln("pedra").appendln("ataque").appendln("papel").appendln("pedra").appendln("papel").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Jogador 1 venceu").appendln("Jogador 1 venceu").appendln("Jogador 1 venceu").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandlePlayer2Wins() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln("pedra").appendln("ataque").appendln("papel").appendln("ataque").appendln("papel").appendln("pedra").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Jogador 2 venceu").appendln("Jogador 2 venceu").appendln("Jogador 2 venceu").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("pedra").appendln("pedra").appendln("ataque").appendln("papel").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Sem ganhador").appendln("Jogador 1 venceu").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("pedra").appendln("pedra").appendln("ataque").appendln("papel").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Sem ganhador").appendln("Jogador 1 venceu").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
