package urban.uri_online_judge.beginner._1078;

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
    public void shouldHandleLowestInput() throws IOException {
        InputStream input = new SampleBuilder().append(2).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .appendln("1 x 2 = 2")//
                .appendln("2 x 2 = 4")//
                .appendln("3 x 2 = 6")//
                .appendln("4 x 2 = 8")//
                .appendln("5 x 2 = 10")//
                .appendln("6 x 2 = 12")//
                .appendln("7 x 2 = 14")//
                .appendln("8 x 2 = 16")//
                .appendln("9 x 2 = 18")//
                .appendln("10 x 2 = 20")//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleHighestInput() throws IOException {
        InputStream input = new SampleBuilder().append(999).buildAsInputStream();

        String output = Main.main(input);
        String expectedOutput = new SampleBuilder()//
                .append("1 x 999 =").appendln(999)//
                .append("2 x 999 =").appendln(2 * 999)//
                .append("3 x 999 =").appendln(3 * 999)//
                .append("4 x 999 =").appendln(4 * 999)//
                .append("5 x 999 =").appendln(5 * 999)//
                .append("6 x 999 =").appendln(6 * 999)//
                .append("7 x 999 =").appendln(7 * 999)//
                .append("8 x 999 =").appendln(8 * 999)//
                .append("9 x 999 =").appendln(9 * 999)//
                .append("10 x 999 =").appendln(10 * 999)//
                .build();

        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldCalculateMultiplicationTableSample() throws IOException {
        int n = 140;
        InputStream input = new SampleBuilder().append(n).buildAsInputStream();

        String output = Main.main(input);
        SampleBuilder sb = new SampleBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
            sb.append("x");
            sb.append(n);
            sb.append("=");
            sb.appendln(i * n);
        }

        assertEquals(sb.build(), output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append(2).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder()//
                .appendln("1 x 2 = 2")//
                .appendln("2 x 2 = 4")//
                .appendln("3 x 2 = 6")//
                .appendln("4 x 2 = 8")//
                .appendln("5 x 2 = 10")//
                .appendln("6 x 2 = 12")//
                .appendln("7 x 2 = 14")//
                .appendln("8 x 2 = 16")//
                .appendln("9 x 2 = 18")//
                .appendln("10 x 2 = 20")//
                .build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
