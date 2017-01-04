package urban.common;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
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
    public void shouldLoadInputAsString() throws IOException {
        SampleLoader sl = new SampleLoader("samples", "test");
        String content = sl.loadAsString("sample.in");
        assertNotNull(content);

        StringBuilder sb = new StringBuilder();
        sb.append("some content").append(System.lineSeparator());
        sb.append(1).append(System.lineSeparator());
        sb.append(5.55).append(System.lineSeparator());
        sb.append(8712367891236l).append(System.lineSeparator());
        sb.append("y");
        String expectedContent = sb.toString();

        assertEquals(expectedContent, content);
    }

    @Test
    public void shouldLoadOutputAsString() throws IOException {
        SampleLoader sl = new SampleLoader("samples", "test");
        String content = sl.loadAsString("sample.out");
        assertNotNull(content);

        StringBuilder sb = new StringBuilder();
        sb.append(1).append(System.lineSeparator());
        sb.append("o").append(System.lineSeparator());
        sb.append(3.14).append(System.lineSeparator());
        sb.append("pi").append(System.lineSeparator());
        String expectedContent = sb.toString();

        assertEquals(expectedContent, content);
    }
}
