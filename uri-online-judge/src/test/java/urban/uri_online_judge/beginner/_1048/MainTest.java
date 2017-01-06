package urban.uri_online_judge.beginner._1048;

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
    public void shouldCalculateRange1LowerLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(0.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 0.00").appendln("Reajuste ganho: 0.00")
                .appendln("Em percentual: 15 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange1SomeSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(299.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 343.86").appendln("Reajuste ganho: 44.85")
                .appendln("Em percentual: 15 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange1UpperLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(400.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 460.00").appendln("Reajuste ganho: 60.00")
                .appendln("Em percentual: 15 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange2LowerLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(400.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 448.01").appendln("Reajuste ganho: 48.00")
                .appendln("Em percentual: 12 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange2SomeSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(634.56).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 710.71").appendln("Reajuste ganho: 76.15")
                .appendln("Em percentual: 12 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange2UpperLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(800.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 896.00").appendln("Reajuste ganho: 96.00")
                .appendln("Em percentual: 12 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange3LowerLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(800.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 880.01").appendln("Reajuste ganho: 80.00")
                .appendln("Em percentual: 10 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange3SomeSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(956.78).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 1052.46").appendln("Reajuste ganho: 95.68")
                .appendln("Em percentual: 10 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange3UpperLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(1200.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 1320.00").appendln("Reajuste ganho: 120.00")
                .appendln("Em percentual: 10 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange4LowerLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(1200.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 1284.01").appendln("Reajuste ganho: 84.00")
                .appendln("Em percentual: 7 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange4SomeSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(1567.89).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 1677.64").appendln("Reajuste ganho: 109.75")
                .appendln("Em percentual: 7 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange4UpperLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(2000.00).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 2140.00").appendln("Reajuste ganho: 140.00")
                .appendln("Em percentual: 7 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange5LowerLimitSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(2000.01).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 2080.01").appendln("Reajuste ganho: 80.00")
                .appendln("Em percentual: 4 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateRange5SomeSalaryIncrease() throws IOException {
        InputStream input = new SampleBuilder().append(5123.45).buildAsInputStream();

        String output = Main.main(input);

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 5328.39").appendln("Reajuste ganho: 204.94")
                .appendln("Em percentual: 4 %").build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(5123.45).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("Novo salario: 5328.39").appendln("Reajuste ganho: 204.94")
                .appendln("Em percentual: 4 %").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
