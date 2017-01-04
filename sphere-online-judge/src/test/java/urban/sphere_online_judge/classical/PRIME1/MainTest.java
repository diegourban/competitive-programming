package urban.sphere_online_judge.classical.PRIME1;

import org.junit.Test;
import urban.common.SampleBuilder;

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
    public void shouldHandleOneTestCase() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln("1 100").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(5).appendln(7)
                .appendln(11).appendln(13).appendln(17).appendln(19)
                .appendln(23).appendln(29)
                .appendln(31).appendln(37)
                .appendln(41).appendln(43).appendln(47)
                .appendln(53).appendln(59)
                .appendln(61).appendln(67)
                .appendln(71).appendln(73).appendln(79)
                .appendln(83).appendln(89)
                .appendln(97)
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleTenTestCases() throws IOException {
        InputStream input = new SampleBuilder().appendln(10)
                .appendln("1 2")
                .appendln("2 3")
                .appendln("3 4")
                .appendln("4 5")
                .appendln("5 6")
                .appendln("6 7")
                .appendln("7 8")
                .appendln("8 9")
                .appendln("9 10")
                .appendln("10 11").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()
                .appendln(2).appendln("")
                .appendln(2).appendln(3).appendln("")
                .appendln(3).appendln("")
                .appendln(5).appendln("")
                .appendln(5).appendln("")
                .appendln(7).appendln("")
                .appendln(7).appendln("")
                .appendln("")
                .appendln("")
                .appendln(11)
                .build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(2).appendln("1 10").appendln("3 5").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(5).appendln(7).appendln("").appendln(3).appendln(5).build();
        assertEquals(expectedOutput, output);
    }

    //@Test
    public void shouldHandleHigherLimit() throws IOException {
        // FIXME: da ruim quando é acima de 100M, pesquisar segmented sieve of eratosthenes
        InputStream input = new SampleBuilder().appendln(1).appendln("1 1000000000").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(5).appendln(7).appendln("").appendln(3).appendln(5).build();
        assertEquals(expectedOutput, output);
    }
}
