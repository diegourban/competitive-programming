package io.github.diegourban.algorithms.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleBuilderTest {

    private SampleBuilder sampleBuilder;

    @BeforeEach
    void beforeTest() {
        this.sampleBuilder = new SampleBuilder();
    }

    @AfterEach
    void afterTest() {
        this.sampleBuilder = null;
    }

    @Test
    void shouldCreateInstance() {
        assertThat(this.sampleBuilder).isNotNull();
    }

    @Test
    void shouldBuildEmptyString() {
        String sample = this.sampleBuilder.build();
        assertThat(sample).isEmpty();
    }

    @Test
    void shouldAppendInteger() {
        String sample = this.sampleBuilder.append(7).build();
        assertThat(sample).isEqualTo("7");
    }

    @Test
    void shouldAppendDouble() {
        String sample = this.sampleBuilder.append(1.2).build();
        assertThat(sample).isEqualTo("1.2");
    }

    @Test
    void shouldAppendLong() {
        String sample = this.sampleBuilder.append(123456789L).build();
        assertThat(sample).isEqualTo("123456789");
    }

    @Test
    void shouldAppendString() {
        String sample = this.sampleBuilder.append("uyag s67a sdt1").build();
        assertThat(sample).isEqualTo("uyag s67a sdt1");
    }

    @Test
    void shouldAppendAllTypes() {
        String sample = this.sampleBuilder
                .append(123)
                .append(9.9)
                .append(9876543210L)
                .append("bla bla")
                .build();
        assertThat(sample).isEqualTo("123 9.9 9876543210 bla bla");
    }

    @Test
    void shouldAppendTwoIntegerLines() {
        String sample = this.sampleBuilder.appendln(786).append(1).build();

        String expected = "786" + System.lineSeparator() + "1";
        assertThat(sample).isEqualTo(expected);
    }

    @Test
    void shouldAppendTwoDoubleLines() {
        String sample = this.sampleBuilder.appendln(2.34).append(.1).build();

        String expected = "2.34" + System.lineSeparator() + "0.1";
        assertThat(sample).isEqualTo(expected);
    }

    @Test
    void shouldAppendTwoLongLines() {
        String sample =
                this.sampleBuilder.appendln(123987123987L).append(1122334455L).build();

        String expected = "123987123987" + System.lineSeparator() + "1122334455";
        assertThat(sample).isEqualTo(expected);
    }

    @Test
    void shouldAppendTwoStringLines() {
        String sample = this.sampleBuilder.appendln("abc").append("zz1").build();

        String expected = "abc" + System.lineSeparator() + "zz1";
        assertThat(sample).isEqualTo(expected);
    }

    @Test
    void shouldAppendTwoLines() {
        String sample = this.sampleBuilder.appendln(786).append("chihuahua").build();

        String expected = "786" + System.lineSeparator() + "chihuahua";
        assertThat(sample).isEqualTo(expected);
    }

    @Test
    void shouldAppendTwoLinesWithNewLineAtTheEnd() {
        String sample = this.sampleBuilder.appendln(1.2).appendln("muchacho").build();

        String expected = "1.2" + System.lineSeparator() + "muchacho" + System.lineSeparator();
        assertThat(sample).isEqualTo(expected);
    }

    @Test
    void shouldAppendFourLinesOneTypeEach() {
        String sample = this.sampleBuilder
                .appendln(123)
                .appendln(987654321L)
                .appendln(99.99)
                .appendln("end")
                .build();

        String expected = "123" + System.lineSeparator() + "987654321" + System.lineSeparator() + "99.99"
                + System.lineSeparator() + "end" + System.lineSeparator();
        assertThat(sample).isEqualTo(expected);
    }
}
