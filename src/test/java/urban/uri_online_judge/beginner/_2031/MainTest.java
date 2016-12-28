package urban.uri_online_judge.beginner._2031;

import org.junit.Test;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private SampleContentLoader scl = new SampleContentLoader("beginner", "2031");

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
    public void shouldHandleMaxInput() throws IOException {
        InputStream input = scl.loadAsInputStream("sample.in");
        String output = Main.main(input);
        String expectedOutput = scl.loadAsStringFrom("sample.out");
        assertEquals(expectedOutput, output);
    }

}