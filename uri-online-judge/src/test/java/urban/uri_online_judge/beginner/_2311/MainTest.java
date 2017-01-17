package urban.uri_online_judge.beginner._2311;

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
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(3)//
                .appendln("Gabriela").appendln(2.0).appendln("6.0 5.0 5.0 5.0 5.0 5.0 4.0")//
                .appendln("Marina").appendln(1.5).appendln("8.5 7.0 8.0 8.0 8.4 7.5 7.7")//
                .appendln("Mafalda").appendln(3.0).appendln("6.0 7.0 6.5 6.8 7.9 6.2 6.6")//
                .buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("Gabriela 50.00").appendln("Marina 59.40").appendln("Mafalda 99.30").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1)//
                .appendln("Gabriela").appendln(2.0).appendln("6.0 5.0 5.0 5.0 5.0 5.0 4.0")//
                .buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Gabriela 50.00").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
