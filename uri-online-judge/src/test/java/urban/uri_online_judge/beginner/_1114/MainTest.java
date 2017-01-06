package urban.uri_online_judge.beginner._1114;

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
    public void shouldHandleFirstPasswordValid() throws IOException {
        InputStream input = new SampleBuilder().append(2002).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Acesso Permitido").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleSample() throws IOException {
        InputStream input = new SampleBuilder().appendln(2200).appendln(1020).appendln(2022).appendln(2002)
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Senha Invalida").appendln("Senha Invalida")
                .appendln("Senha Invalida").appendln("Acesso Permitido").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(2200).appendln(1020).appendln(2022).appendln(2002)
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Senha Invalida").appendln("Senha Invalida")
                .appendln("Senha Invalida").appendln("Acesso Permitido").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
