package urban.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SampleBuilderTest {

    private SampleBuilder sampleBuilder;

    @Before
    public void beforeTest() {
        this.sampleBuilder = new SampleBuilder();
    }

    @After
    public void afterTest() {
        this.sampleBuilder = null;
    }

    @Test
    public void shouldCreateInstance() {
        assertNotNull(this.sampleBuilder);
    }

    @Test
    public void shouldBuildEmptyString() {
        String sample = this.sampleBuilder.build();
        assertEquals("", sample);
    }

    @Test
    public void shouldAppendInteger() {
        String sample = this.sampleBuilder.append(7).build();
        assertEquals("7", sample);
    }

    @Test
    public void shouldAppendDouble() {
        String sample = this.sampleBuilder.append(1.2).build();
        assertEquals("1.2", sample);
    }

    @Test
    public void shouldAppendLong() {
        String sample = this.sampleBuilder.append(123456789l).build();
        assertEquals("123456789", sample);
    }

    @Test
    public void shouldAppendString() {
        String sample = this.sampleBuilder.append("uyag s67a sdt1").build();
        assertEquals("uyag s67a sdt1", sample);
    }

    @Test
    public void shouldAppendAllTypes() {
        String sample = this.sampleBuilder.append(123).append(9.9).append(9876543210l).append("bla bla").build();
        assertEquals("123 9.9 9876543210 bla bla", sample);
    }

    @Test
    public void shouldAppendTwoIntegerLines() {
        String sample = this.sampleBuilder.appendln(786).append(1).build();

        String expected = "786" + System.lineSeparator() + "1";
        assertEquals(expected, sample);
    }

    @Test
    public void shouldAppendTwoDoubleLines() {
        String sample = this.sampleBuilder.appendln(2.34).append(.1).build();

        String expected = "2.34" + System.lineSeparator() + "0.1";
        assertEquals(expected, sample);
    }

    @Test
    public void shouldAppendTwoLongLines() {
        String sample = this.sampleBuilder.appendln(123987123987l).append(1122334455l).build();

        String expected = "123987123987" + System.lineSeparator() + "1122334455";
        assertEquals(expected, sample);
    }

    @Test
    public void shouldAppendTwoStringLines() {
        String sample = this.sampleBuilder.appendln("abc").append("zz1").build();

        String expected = "abc" + System.lineSeparator() + "zz1";
        assertEquals(expected, sample);
    }

    @Test
    public void shouldAppendTwoLines() {
        String sample = this.sampleBuilder.appendln(786).append("chihuahua").build();

        String expected = "786" + System.lineSeparator() + "chihuahua";
        assertEquals(expected, sample);
    }

    @Test
    public void shouldAppendTwoLinesWithNewLineAtTheEnd() {
        String sample = this.sampleBuilder.appendln(1.2).appendln("muchacho").build();

        String expected = "1.2" + System.lineSeparator() + "muchacho" + System.lineSeparator();
        assertEquals(expected, sample);
    }

    @Test
    public void shouldAppendFourLinesOneTypeEach() {
        String sample = this.sampleBuilder.appendln(123).appendln(987654321l).appendln(99.99).appendln("end").build();

        String expected = "123" + System.lineSeparator() + "987654321" + System.lineSeparator() + "99.99" + System.lineSeparator() + "end" + System.lineSeparator();
        assertEquals(expected, sample);
    }

}
