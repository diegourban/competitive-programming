package urban.uri_online_judge.beginner._2029;

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
        assertNotNull(new urban.uri_online_judge.beginner._2028.Main());
    }

    @Test
    public void shouldHandleLowestInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(1.0).append(1.0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("ALTURA = 1.27").appendln("AREA = 0.79").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestInput() throws IOException {
        InputStream input = new SampleBuilder().appendln(10000.00).append(100.0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("ALTURA = 1.27").appendln("AREA = 7850.00").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder()//
                .appendln(1450.00)//
                .appendln(25.00)//
                .appendln(760.00)//
                .appendln(40.00)//
                .appendln(7500.00)//
                .append(15.00)//
                .buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("ALTURA = 2.96")//
                .appendln("AREA = 490.62")//
                .appendln("ALTURA = 0.61")//
                .appendln("AREA = 1256.00")//
                .appendln("ALTURA = 42.46")//
                .appendln("AREA = 176.62")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1.0).append(1.0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("ALTURA = 1.27").appendln("AREA = 0.79").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
