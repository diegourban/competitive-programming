package urban.uri_online_judge.beginner._1961;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.uri_online_judge.beginner._1961.Main;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = new SampleBuilder().appendln("1 2").appendln("2 2").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YOU WIN").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = new SampleBuilder().appendln("1 2").appendln("1 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("GAME OVER").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample3() throws IOException {
        InputStream input = new SampleBuilder().appendln("5 10").appendln("1 3 6 9 7 2 4 5 8 3").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YOU WIN").build();
        assertEquals(expectedOutput, output);
    }
}