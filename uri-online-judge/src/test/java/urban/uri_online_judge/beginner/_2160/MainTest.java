package urban.uri_online_judge.beginner._2160;

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
    public void shouldHandle1Character() throws IOException {
        InputStream input = new SampleBuilder().append("a").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YES").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle79Characters() throws IOException {
        InputStream input = new SampleBuilder().append("Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafaela").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YES").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle80Characters() throws IOException {
        InputStream input = new SampleBuilder().append("Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafaelaa").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("YES").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle81Characters() throws IOException {
        InputStream input = new SampleBuilder().append("Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafaelaaa").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("NO").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandle500Characters() throws IOException {
        InputStream input = new SampleBuilder().append("52zb 3yqe wl4gvqxli1qr 99xyfytibh1j6hp mre8vmlrwd0ckktamzvwufuuvfszh1b9544f5cnbbkfqvw1azwkvuqkn2dc1y12r1x4pkvdimyl8rs1se sngnf5w5wruny234 qw4 r8eukbaag9vp4i2hln9rk892glpyrsc9cy4af2xr6rdmk tdhjx35r3d1u0o17qc14m3t8dhx8kfkv i7qqm4nd53cldwf87qcga56o5yjptrxu2rvy95vueswv4l5pboilozf0ozdx8qm4sfzcuvdlpiuwj6ys7htdsmag5er02e4eczpf4566yugkzkdrwa4486jljgdzzgh7yx2ebjg861c7l6f3ul4r7023ytsmzvvs1eer9yg3cw1h6fl6p4hcdvncq0m4zje p54  ku4lgpm283m4a7u186q36gt4cvc731oqvqcpe1e52ookck79x uvrwp17pv3gdodu vl889p4f0cmb8dzc").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("NO").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldHandleURISamples() throws IOException {
        String[] inputs = {"Fulano de Tal", "Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose Gonzaga Pascoal Cipriano Serafim"};
        String[] outputs = {"YES", "NO"};

        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append("abc").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("YES").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
