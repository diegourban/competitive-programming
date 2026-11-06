package io.github.diegourban.algorithms.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class SampleLoaderTest {

    private final SampleLoader loader = new SampleLoader("testing/sample-loader");

    @Test
    void shouldLoadInputAsString() {
        assertThat(loader.loadAsString("sample.in")).isEqualTo("""
                some content
                1
                5.55
                8712367891236
                y""");
    }

    @Test
    void shouldLoadOutputAsString() {
        assertThat(loader.loadAsString("sample.out")).isEqualTo("""
                1
                o
                3.14
                pi
                """);
    }

    @Test
    void shouldLoadAsInputStream() throws Exception {
        try (var in = loader.loadAsInputStream("sample.in")) {
            assertThat(in).hasContent(loader.loadAsString("sample.in"));
        }
    }

    @Test
    void shouldAcceptTrailingSlash() {
        assertThat(new SampleLoader("testing/sample-loader/").loadAsString("sample.out"))
                .startsWith("1");
    }

    @Test
    void shouldFailClearlyForMissingSample() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> loader.loadAsString("missing.in"))
                .withMessageContaining("testing/sample-loader/missing.in");
    }
}
