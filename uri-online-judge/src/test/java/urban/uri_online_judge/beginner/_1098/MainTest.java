package urban.uri_online_judge.beginner._1098;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    private static final NumberFormat formatter;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        formatter = new DecimalFormat("#0.#", decimalFormatSymbols);
    }

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldCalculateSequenceIJ4() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sb = new StringBuilder();
        for (double i = 0, j = 1; i <= 2; i += 0.2, j += 0.2) {
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j))
                    .append(System.lineSeparator());
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j + 1))
                    .append(System.lineSeparator());
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j + 2))
                    .append(System.lineSeparator());
        }

        assertEquals(sb.toString(), output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        StringBuilder sb = new StringBuilder();
        for (double i = 0, j = 1; i <= 2; i += 0.2, j += 0.2) {
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j))
                    .append(System.lineSeparator());
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j + 1))
                    .append(System.lineSeparator());
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j + 2))
                    .append(System.lineSeparator());
        }
        String expectedOutput = sb.toString();
        assertEquals(expectedOutput, outContent.toString());
    }

}
