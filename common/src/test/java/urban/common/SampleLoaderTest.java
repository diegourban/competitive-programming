package urban.common;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

public class SampleLoaderTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new SampleLoader(null, null));
    }

    @Test
    public void shouldLoadAsInputStream() throws IOException {
        SampleLoader sl = new SampleLoader("samples", "test");
        InputStream inputStream = sl.loadAsInputStream("sample.in");
        assertNotNull(inputStream);
    }

    @Test
    public void shouldLoadAsString() throws IOException {
        SampleLoader sl = new SampleLoader("samples", "test");
        String content = sl.loadAsString("sample.in");
        assertNotNull(content);
    }
}
