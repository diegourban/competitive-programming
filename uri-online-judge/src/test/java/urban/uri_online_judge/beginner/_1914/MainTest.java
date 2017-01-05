package urban.uri_online_judge.beginner._1914;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.common.SampleLoader;

public class MainTest {

    private SampleLoader scl = new SampleLoader("beginner", "1914");

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleSample() throws IOException {
        InputStream input1 = scl.loadAsInputStream("sampleURI.in");

        String output1 = Main.main(input1);

        String expectedOutput = new SampleBuilder().appendln("Quico").appendln("Marcus").appendln("Conrado").appendln("Chaves").build();

        assertEquals(expectedOutput, output1);
    }

}
