package urban.uri_online_judge.beginner._2168;

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
    public void shouldHandleABlockWithNoCamera() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(0).appendln(0).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("U").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleABlockWithOneCamera() throws IOException {
        for (int i = 0; i < 4; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(1);
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("U").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleABlockWithThreeCameras() throws IOException {
        for (int i = 0; i < 4; i++) {
            SampleBuilder sb = new SampleBuilder();
            sb.appendln(1);
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
            }
            InputStream input = sb.buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("S").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleABlockWithFourCameras() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).appendln(1).append(1).append(1).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("S").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleFourBlocks() throws IOException {
        InputStream input = new SampleBuilder().appendln(2)//
                .append(1).append(1).appendln(0)//
                .append(0).append(0).appendln(0)//
                .append(0).append(1).appendln(1)//
                .buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("SU").appendln("US").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample1() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(1).appendln(0).append(0).append(0).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("U").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample2() throws IOException {
        InputStream input = new SampleBuilder().appendln(2)//
                .append(1).append(0).appendln(0)//
                .append(1).append(1).appendln(0)//
                .append(0).append(0).appendln(1)//
                .buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("SU").appendln("SS").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISample3() throws IOException {
        InputStream input = new SampleBuilder().appendln(3)//
                .append(1).append(1).append(0).appendln(1)//
                .append(1).append(0).append(1).appendln(0)//
                .append(1).append(0).append(0).appendln(1)//
                .append(0).append(1).append(1).appendln(0)//
                .buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("SSS").appendln("SUS").appendln("SSS").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).append(0).appendln(0).append(0).append(0).buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("U").build();

        assertEquals(expectedOutput, outContent.toString());
    }

}
