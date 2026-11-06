package io.github.diegourban.algorithms.testing;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

/**
 * Loads sample files from a folder on the test classpath, e.g.
 * {@code new SampleLoader("problems/math/prime1").loadAsString("sample.in")}
 * reads {@code src/test/resources/problems/math/prime1/sample.in}.
 */
public final class SampleLoader {

    private final String resourceDir;

    public SampleLoader(String resourceDir) {
        this.resourceDir = resourceDir.endsWith("/") ? resourceDir : resourceDir + "/";
    }

    public String loadAsString(String fileName) {
        var path = resourceDir + fileName;
        try (var in = SampleLoader.class.getClassLoader().getResourceAsStream(path)) {
            if (in == null) {
                throw new IllegalArgumentException("Sample not found on classpath: " + path);
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public InputStream loadAsInputStream(String fileName) {
        return new ByteArrayInputStream(loadAsString(fileName).getBytes(StandardCharsets.UTF_8));
    }
}
