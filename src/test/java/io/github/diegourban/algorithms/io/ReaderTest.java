package io.github.diegourban.algorithms.io;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.within;

import io.github.diegourban.algorithms.testing.SampleBuilder;
import java.io.EOFException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class ReaderTest {

    @Test
    void shouldCreateInstance() {
        assertThat(new Reader(null)).isNotNull();
    }

    @Test
    void shouldHandleEmptyInput() throws Exception {
        final InputStream input = new SampleBuilder().buildAsInputStream();

        final Reader reader = new Reader(input);
        final String empty = reader.readLine();
        reader.close();

        assertThat(empty).isEmpty();
    }

    @Test
    void shouldHandleEOF() throws Exception {
        final InputStream input = new SampleBuilder().append(1).buildAsInputStream();
        final Reader reader = new Reader(input);
        reader.nextInt();

        assertThatExceptionOfType(EOFException.class).isThrownBy(reader::nextInt);
    }

    @Test
    void shouldReadUntilEOF() throws Exception {
        final String[] inputs = {"first line", "second line", "last line"};
        final InputStream input = new SampleBuilder()
                .appendln(inputs[0])
                .appendln(inputs[1])
                .append(inputs[2])
                .buildAsInputStream();

        final Reader reader = new Reader(input);
        int i = 0;
        while (true) {
            try {
                final String line = reader.readLine();
                assertThat(line).isEqualTo(inputs[i]);
                i++;
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();
    }

    @Test
    void shouldHandleCloseAlreadyClosedReader() throws Exception {
        final InputStream input = new SampleBuilder().buildAsInputStream();

        final Reader reader = new Reader(input);
        assertThat(reader.isClosed()).isFalse();
        reader.close();
        assertThat(reader.isClosed()).isTrue();
        reader.close();
        assertThat(reader.isClosed()).isTrue();
    }

    @Test
    void shouldReadOneLine() throws Exception {
        final InputStream input = new SampleBuilder().appendln("this is a line").buildAsInputStream();

        final Reader reader = new Reader(input);
        final String line = reader.readLine();
        reader.close();

        assertThat(line).isEqualTo("this is a line");
    }

    @Test
    void shouldReadTwoLines() throws Exception {
        final InputStream input = new SampleBuilder()
                .appendln("this is a line")
                .appendln("this is another line")
                .buildAsInputStream();

        final Reader reader = new Reader(input);
        final String firstLine = reader.readLine();
        final String secondLine = reader.readLine();
        reader.close();

        assertThat(firstLine).isEqualTo("this is a line");
        assertThat(secondLine).isEqualTo("this is another line");
    }

    @Test
    void shouldJumpEmptyLines() throws Exception {
        final InputStream input =
                new SampleBuilder().appendln("").appendln("this is a line").buildAsInputStream();

        final Reader reader = new Reader(input);
        final String line = reader.readLine();
        reader.close();

        assertThat(line).isEqualTo("this is a line");
    }

    @Test
    void shouldReadPositiveIntegerUnit() throws Exception {
        final InputStream input = new SampleBuilder().appendln("5").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(5);
    }

    @Test
    void shouldReadIntegerAfterSpace() throws Exception {
        final InputStream input = new SampleBuilder().appendln(" 2").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(2);
    }

    @Test
    void shouldReadNegativeIntegerUnit() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-4").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(-4);
    }

    @Test
    void shouldReadPositiveIntegerDozen() throws Exception {
        final InputStream input = new SampleBuilder().appendln("16").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(16);
    }

    @Test
    void shouldReadNegativeIntegerDozen() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-20").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(-20);
    }

    @Test
    void shouldReadPositiveIntegerHundred() throws Exception {
        final InputStream input = new SampleBuilder().appendln("123").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(123);
    }

    @Test
    void shouldReadNegativeIntegerHundred() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-321").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(-321);
    }

    @Test
    void shouldReadChainOfPositiveAndNegativeIntegers() throws Exception {
        final InputStream input =
                new SampleBuilder().appendln("-123 987 -88 74 -9 7").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int first = reader.nextInt();
        final int second = reader.nextInt();
        final int third = reader.nextInt();
        final int fourth = reader.nextInt();
        final int fifth = reader.nextInt();
        final int sixth = reader.nextInt();
        reader.close();

        assertThat(first).isEqualTo(-123);
        assertThat(second).isEqualTo(987);
        assertThat(third).isEqualTo(-88);
        assertThat(fourth).isEqualTo(74);
        assertThat(fifth).isEqualTo(-9);
        assertThat(sixth).isEqualTo(7);
    }

    @Test
    void shouldReadPositiveDoubleUnit() throws Exception {
        final InputStream input = new SampleBuilder().appendln("1.1").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(1.1, within(0.1));
    }

    @Test
    void shouldReadDoubleAfterSpace() throws Exception {
        final InputStream input = new SampleBuilder().appendln(" 5.6").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double d = reader.nextDouble();
        reader.close();

        assertThat(d).isCloseTo(5.6, within(0.1));
    }

    @Test
    void shouldReadNegativeDoubleUnit() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-2.3").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(-2.3, within(0.1));
    }

    @Test
    void shouldReadPositiveDoubleDozen() throws Exception {
        final InputStream input = new SampleBuilder().appendln("12.7").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(12.7, within(0.1));
    }

    @Test
    void shouldReadNegativeDoubleDozen() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-99.9").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(-99.9, within(0.1));
    }

    @Test
    void shouldReadPositiveDoubleHundred() throws Exception {
        final InputStream input = new SampleBuilder().appendln("612.9").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(612.9, within(0.1));
    }

    @Test
    void shouldReadNegativeDoubleHundred() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-193.6").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(-193.6, within(0.1));
    }

    @Test
    void shouldDoubleWithTwoDecimalPlaces() throws Exception {
        final InputStream input = new SampleBuilder().appendln("5.68").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(5.68, within(0.1));
    }

    @Test
    void shouldDoubleWithThreeDecimalPlaces() throws Exception {
        final InputStream input = new SampleBuilder().appendln("45.771").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(45.771, within(0.1));
    }

    @Test
    void shouldDoubleWithNineDecimalPlaces() throws Exception {
        final InputStream input = new SampleBuilder().appendln("0.123456789").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(0.123456789, within(0.1));
    }

    @Test
    void shouldReadChainOfPositiveAndNegativeDoubles() throws Exception {
        final InputStream input =
                new SampleBuilder().appendln("-1.23 98.7 -8.8 7.4 -9 7").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double first = reader.nextDouble();
        final double second = reader.nextDouble();
        final double third = reader.nextDouble();
        final double fourth = reader.nextDouble();
        final double fifth = reader.nextDouble();
        final double sixth = reader.nextDouble();
        reader.close();

        assertThat(first).isCloseTo(-1.23, within(0.1));
        assertThat(second).isCloseTo(98.7, within(0.1));
        assertThat(third).isCloseTo(-8.8, within(0.1));
        assertThat(fourth).isCloseTo(7.4, within(0.1));
        assertThat(fifth).isCloseTo(-9, within(0.1));
        assertThat(sixth).isCloseTo(7, within(0.1));
    }

    @Test
    void shouldReadPositiveLong() throws Exception {
        final InputStream input = new SampleBuilder().appendln("8172368367890").buildAsInputStream();

        final Reader reader = new Reader(input);
        final long nextLong = reader.nextLong();
        reader.close();

        assertThat(nextLong).isEqualTo(8172368367890L);
    }

    @Test
    void shouldReadNegativeLong() throws Exception {
        final InputStream input = new SampleBuilder().appendln("-123578918902").buildAsInputStream();

        final Reader reader = new Reader(input);
        final long nextLong = reader.nextLong();
        reader.close();

        assertThat(nextLong).isEqualTo(-123578918902L);
    }

    @Test
    void shouldReadChainOfPositiveAndNegativeLongs() throws Exception {
        final InputStream input = new SampleBuilder()
                .appendln("8172368367890 -1789236812893 891723689713 -31723581237 59787712587 -123123123123")
                .buildAsInputStream();

        final Reader reader = new Reader(input);
        final long first = reader.nextLong();
        final long second = reader.nextLong();
        final long third = reader.nextLong();
        final long fourth = reader.nextLong();
        final long fifth = reader.nextLong();
        final long sixth = reader.nextLong();
        reader.close();

        assertThat(first).isEqualTo(8172368367890L);
        assertThat(second).isEqualTo(-1789236812893L);
        assertThat(third).isEqualTo(891723689713L);
        assertThat(fourth).isEqualTo(-31723581237L);
        assertThat(fifth).isEqualTo(59787712587L);
        assertThat(sixth).isEqualTo(-123123123123L);
    }

    @Test
    void shouldReadLongsWithSpacesAndLineBreaks() throws Exception {
        final InputStream input = new SampleBuilder()
                .appendln("6546546565    -4326757896")
                .appendln("786676767")
                .buildAsInputStream();

        final Reader reader = new Reader(input);
        final long first = reader.nextLong();
        final long second = reader.nextLong();
        final long third = reader.nextLong();
        reader.close();

        assertThat(first).isEqualTo(6546546565L);
        assertThat(second).isEqualTo(-4326757896L);
        assertThat(third).isEqualTo(786676767);
    }

    @Test
    void shouldReadChar() throws Exception {
        final InputStream input = new SampleBuilder().appendln("a").buildAsInputStream();

        final Reader reader = new Reader(input);
        final char nextChar = reader.nextChar();
        reader.close();

        assertThat(nextChar).isEqualTo('a');
    }

    @Test
    void shouldReadMultipleChars() throws Exception {
        final InputStream input = new SampleBuilder().appendln("a 1 /").buildAsInputStream();

        final Reader reader = new Reader(input);
        final char a = reader.nextChar();
        final char one = reader.nextChar();
        final char slash = reader.nextChar();
        reader.close();

        assertThat(a).isEqualTo('a');
        assertThat(one).isEqualTo('1');
        assertThat(slash).isEqualTo('/');
    }

    @Test
    void shouldReadIntegersWithOtherCharactersInBetween() throws Exception {
        final InputStream input = new SampleBuilder().appendln("12a34Z56&78/9").buildAsInputStream();

        final Reader reader = new Reader(input);
        final int firstInt = reader.nextInt();
        final int secondInt = reader.nextInt();
        final int thirdInt = reader.nextInt();
        final int fourthInt = reader.nextInt();
        final int fifthInt = reader.nextInt();
        reader.close();

        assertThat(firstInt).isEqualTo(12);
        assertThat(secondInt).isEqualTo(34);
        assertThat(thirdInt).isEqualTo(56);
        assertThat(fourthInt).isEqualTo(78);
        assertThat(fifthInt).isEqualTo(9);
    }

    @Test
    void shouldReadLongsWithOtherCharactersInBetween() throws Exception {
        final InputStream input = new SampleBuilder().appendln("12a34Z56&78/9").buildAsInputStream();

        final Reader reader = new Reader(input);
        final long firstLong = reader.nextLong();
        final long secondLong = reader.nextLong();
        final long thirdLong = reader.nextLong();
        final long fourthLong = reader.nextLong();
        final long fifthLong = reader.nextLong();
        reader.close();

        assertThat(firstLong).isEqualTo(12);
        assertThat(secondLong).isEqualTo(34);
        assertThat(thirdLong).isEqualTo(56);
        assertThat(fourthLong).isEqualTo(78);
        assertThat(fifthLong).isEqualTo(9);
    }

    @Test
    void shouldReadDoublesWithOtherCharactersInBetween() throws Exception {
        final InputStream input =
                new SampleBuilder().appendln("12a3.4Z56&7.88/9").buildAsInputStream();

        final Reader reader = new Reader(input);
        final double firstDouble = reader.nextDouble();
        final double secondDouble = reader.nextDouble();
        final double thirdDouble = reader.nextDouble();
        final double fourthDouble = reader.nextDouble();
        final double fifthDouble = reader.nextDouble();
        reader.close();

        assertThat(firstDouble).isCloseTo(12, within(0.1));
        assertThat(secondDouble).isCloseTo(3.4, within(0.1));
        assertThat(thirdDouble).isCloseTo(56, within(0.1));
        assertThat(fourthDouble).isCloseTo(7.88, within(0.1));
        assertThat(fifthDouble).isCloseTo(9, within(0.1));
    }

    @Test
    void shouldSkipNChars() throws Exception {
        final InputStream input = new SampleBuilder().appendln("Dia 5").buildAsInputStream();

        final Reader reader = new Reader(input);
        reader.skip(4);
        final int day = reader.nextInt();
        reader.close();

        assertThat(day).isEqualTo(5);
    }
}
