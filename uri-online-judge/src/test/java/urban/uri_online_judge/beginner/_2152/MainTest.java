package urban.uri_online_judge.beginner._2152;

import org.junit.Test;
import urban.common.SampleBuilder;
import urban.uri_online_judge.beginner._2152.Main;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleLimits() throws IOException {
        InputStream input = new SampleBuilder().appendln(6).appendln("11 59 0").appendln("12 0 1").appendln("12 1 0").appendln("23 59 1").appendln("0 0 0").appendln("0 1 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("11:59 - A porta fechou!").appendln("12:00 - A porta abriu!").appendln("12:01 - A porta fechou!").appendln("23:59 - A porta abriu!").appendln("00:00 - A porta fechou!").appendln("00:01 - A porta abriu!").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(3).appendln("15 30 1").appendln("23 50 0").append("0 5 1").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("15:30 - A porta abriu!").appendln("23:50 - A porta fechou!").appendln("00:05 - A porta abriu!").build();
        assertEquals(expectedOutput, output);
    }

}