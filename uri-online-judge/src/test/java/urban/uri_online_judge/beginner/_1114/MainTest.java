package urban.uri_online_judge.beginner._1114;

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

}
