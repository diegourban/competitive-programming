package urban.uri_online_judge.beginner._1174;

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

    private static final NumberFormat numberFormat;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        numberFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
    }

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample() throws IOException {
        double[] in = {-91.5, 10.5, 0.5, 60, 98, -24, -73, 51, -70, 44, 65, -47, 55, -56, 2, -4, 18, 50, 74, 46, -87,
                18, 8, -53, 46, 30, 4, 54, 23, 96, 89, 85, -48, -80, 83, -26, -30, 25, -50, -59, 73, -88, -90, 53, -3,
                -62, 62, 30, 8, -79, -7, -2, -3, 10, -30, -28, -88, -90, 98, 73, 4, 48, -96, -88, -3, 64, -65, 2, -95,
                50, 67, 60, 53, -1, 32, 37, -48, -7, 99, -6, 32, 50, -49, 8, 86, 98, 76, 51, -79, 29, -66, -70, -53,
                -69, 33, 67, 56, -35, -7, 83};
        SampleBuilder sbin = new SampleBuilder();
        for (int i = 0; i < in.length; i++) {
            sbin.appendln(in[i]);
        }
        InputStream input = sbin.buildAsInputStream();

        String output = Main.main(input);

        StringBuilder sbout = new StringBuilder();
        for (int i = 0; i < in.length; i++) {
            if (in[i] <= 10) {
                sbout.append("A[").append(i).append("] = ").append(numberFormat.format(in[i]))
                        .append(System.lineSeparator());
            }
        }
        String expectedOutput = sbout.toString();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        double[] in = {-91.5, 10.5, 0.5, 60, 98, -24, -73, 51, -70, 44, 65, -47, 55, -56, 2, -4, 18, 50, 74, 46, -87,
                18, 8, -53, 46, 30, 4, 54, 23, 96, 89, 85, -48, -80, 83, -26, -30, 25, -50, -59, 73, -88, -90, 53, -3,
                -62, 62, 30, 8, -79, -7, -2, -3, 10, -30, -28, -88, -90, 98, 73, 4, 48, -96, -88, -3, 64, -65, 2, -95,
                50, 67, 60, 53, -1, 32, 37, -48, -7, 99, -6, 32, 50, -49, 8, 86, 98, 76, 51, -79, 29, -66, -70, -53,
                -69, 33, 67, 56, -35, -7, 83};
        SampleBuilder sbin = new SampleBuilder();
        for (int i = 0; i < in.length; i++) {
            sbin.appendln(in[i]);
        }
        InputStream input = sbin.buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        StringBuilder sbout = new StringBuilder();
        for (int i = 0; i < in.length; i++) {
            if (in[i] <= 10) {
                sbout.append("A[").append(i).append("] = ").append(numberFormat.format(in[i]))
                        .append(System.lineSeparator());
            }
        }
        String expectedOutput = sbout.toString();
        assertEquals(expectedOutput, outContent.toString());
    }

}
