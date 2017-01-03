package urban.sphere_online_judge.classical.TEST;

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

    //@Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().appendln(1).appendln(2).appendln(88 ).appendln(42).appendln(99).buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(88).build();
        assertEquals(expectedOutput, output);
    }
}
