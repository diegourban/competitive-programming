package urban.uri_online_judge.beginner._1009;

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
    public void shouldCalculateSalaryWithoutSales() throws IOException {
        InputStream input = new SampleBuilder().appendln("PEDRO").appendln("700.00").appendln("0.00")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "TOTAL = R$ 700.00" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSalaryWithSales() throws IOException {
        InputStream input = new SampleBuilder().appendln("MANGOJATA").appendln("1700.00").appendln("1230.50")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "TOTAL = R$ 1884.58" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateSalaryWithMoreSalesThanSalary() throws IOException {
        InputStream input = new SampleBuilder().appendln("JOAO").appendln("500.00").appendln("1230.30")
                .buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = "TOTAL = R$ 684.54" + System.lineSeparator();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        System.setIn(new SampleBuilder().appendln("JOAO").appendln("500.00").appendln("1230.30")
                .buildAsInputStream());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "TOTAL = R$ 684.54" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
