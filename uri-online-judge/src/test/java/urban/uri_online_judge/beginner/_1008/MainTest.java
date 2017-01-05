package urban.uri_online_judge.beginner._1008;

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
    public void shouldCalculateSalary1() throws IOException {
        InputStream input = new SampleBuilder().appendln("25").appendln("100").appendln("5.50").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "NUMBER = 25" + System.lineSeparator() + "SALARY = U$ 550.00" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSalary2() throws IOException {
        InputStream input = new SampleBuilder().appendln("1").appendln("200").appendln("20.50").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "NUMBER = 1" + System.lineSeparator() + "SALARY = U$ 4100.00" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSalary3() throws IOException {
        InputStream input = new SampleBuilder().appendln("6").appendln("145").appendln("15.55").buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "NUMBER = 6" + System.lineSeparator() + "SALARY = U$ 2254.75" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("25").appendln("100").appendln("5.50").buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "NUMBER = 25" + System.lineSeparator() + "SALARY = U$ 550.00" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
