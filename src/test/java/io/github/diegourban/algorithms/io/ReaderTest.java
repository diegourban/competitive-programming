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
        InputStream input = new SampleBuilder().buildAsInputStream();

        Reader reader = new Reader(input);
        String empty = reader.readLine();
        reader.close();

        assertThat(empty).isEmpty();
    }

    @Test
    void shouldHandleEOF() throws Exception {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();
        Reader reader = new Reader(input);
        reader.nextInt();

        assertThatExceptionOfType(EOFException.class).isThrownBy(reader::nextInt);
    }

    @Test
    void shouldReadUntilEOF() throws Exception {
        String[] inputs = {"first line", "second line", "last line"};
        InputStream input = new SampleBuilder()
                .appendln(inputs[0])
                .appendln(inputs[1])
                .append(inputs[2])
                .buildAsInputStream();

        Reader reader = new Reader(input);
        int i = 0;
        while (true) {
            try {
                String line = reader.readLine();
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
        InputStream input = new SampleBuilder().buildAsInputStream();

        Reader reader = new Reader(input);
        assertThat(reader.isClosed()).isFalse();
        reader.close();
        assertThat(reader.isClosed()).isTrue();
        reader.close();
        assertThat(reader.isClosed()).isTrue();
    }

    @Test
    void shouldReadOneLine() throws Exception {
        InputStream input = new SampleBuilder().appendln("this is a line").buildAsInputStream();

        Reader reader = new Reader(input);
        String line = reader.readLine();
        reader.close();

        assertThat(line).isEqualTo("this is a line");
    }

    @Test
    void shouldReadTwoLines() throws Exception {
        InputStream input = new SampleBuilder()
                .appendln("this is a line")
                .appendln("this is another line")
                .buildAsInputStream();

        Reader reader = new Reader(input);
        String firstLine = reader.readLine();
        String secondLine = reader.readLine();
        reader.close();

        assertThat(firstLine).isEqualTo("this is a line");
        assertThat(secondLine).isEqualTo("this is another line");
    }

    @Test
    void shouldJumpEmptyLines() throws Exception {
        InputStream input =
                new SampleBuilder().appendln("").appendln("this is a line").buildAsInputStream();

        Reader reader = new Reader(input);
        String line = reader.readLine();
        reader.close();

        assertThat(line).isEqualTo("this is a line");
    }

    @Test
    void shouldReadPositiveIntegerUnit() throws Exception {
        InputStream input = new SampleBuilder().appendln("5").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(5);
    }

    @Test
    void shouldReadIntegerAfterSpace() throws Exception {
        InputStream input = new SampleBuilder().appendln(" 2").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(2);
    }

    @Test
    void shouldReadNegativeIntegerUnit() throws Exception {
        InputStream input = new SampleBuilder().appendln("-4").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(-4);
    }

    @Test
    void shouldReadPositiveIntegerDozen() throws Exception {
        InputStream input = new SampleBuilder().appendln("16").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(16);
    }

    @Test
    void shouldReadNegativeIntegerDozen() throws Exception {
        InputStream input = new SampleBuilder().appendln("-20").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(-20);
    }

    @Test
    void shouldReadPositiveIntegerHundred() throws Exception {
        InputStream input = new SampleBuilder().appendln("123").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(123);
    }

    @Test
    void shouldReadNegativeIntegerHundred() throws Exception {
        InputStream input = new SampleBuilder().appendln("-321").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertThat(nextInt).isEqualTo(-321);
    }

    @Test
    void shouldReadChainOfPositiveAndNegativeIntegers() throws Exception {
        InputStream input = new SampleBuilder().appendln("-123 987 -88 74 -9 7").buildAsInputStream();

        Reader reader = new Reader(input);
        int first = reader.nextInt();
        int second = reader.nextInt();
        int third = reader.nextInt();
        int fourth = reader.nextInt();
        int fifth = reader.nextInt();
        int sixth = reader.nextInt();
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
        InputStream input = new SampleBuilder().appendln("1.1").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(1.1, within(0.1));
    }

    @Test
    void shouldReadDoubleAfterSpace() throws Exception {
        InputStream input = new SampleBuilder().appendln(" 5.6").buildAsInputStream();

        Reader reader = new Reader(input);
        double d = reader.nextDouble();
        reader.close();

        assertThat(d).isCloseTo(5.6, within(0.1));
    }

    @Test
    void shouldReadNegativeDoubleUnit() throws Exception {
        InputStream input = new SampleBuilder().appendln("-2.3").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(-2.3, within(0.1));
    }

    @Test
    void shouldReadPositiveDoubleDozen() throws Exception {
        InputStream input = new SampleBuilder().appendln("12.7").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(12.7, within(0.1));
    }

    @Test
    void shouldReadNegativeDoubleDozen() throws Exception {
        InputStream input = new SampleBuilder().appendln("-99.9").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(-99.9, within(0.1));
    }

    @Test
    void shouldReadPositiveDoubleHundred() throws Exception {
        InputStream input = new SampleBuilder().appendln("612.9").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(612.9, within(0.1));
    }

    @Test
    void shouldReadNegativeDoubleHundred() throws Exception {
        InputStream input = new SampleBuilder().appendln("-193.6").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(-193.6, within(0.1));
    }

    @Test
    void shouldDoubleWithTwoDecimalPlaces() throws Exception {
        InputStream input = new SampleBuilder().appendln("5.68").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(5.68, within(0.1));
    }

    @Test
    void shouldDoubleWithThreeDecimalPlaces() throws Exception {
        InputStream input = new SampleBuilder().appendln("45.771").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(45.771, within(0.1));
    }

    @Test
    void shouldDoubleWithNineDecimalPlaces() throws Exception {
        InputStream input = new SampleBuilder().appendln("0.123456789").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertThat(nextDouble).isCloseTo(0.123456789, within(0.1));
    }

    @Test
    void shouldReadChainOfPositiveAndNegativeDoubles() throws Exception {
        InputStream input =
                new SampleBuilder().appendln("-1.23 98.7 -8.8 7.4 -9 7").buildAsInputStream();

        Reader reader = new Reader(input);
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        double third = reader.nextDouble();
        double fourth = reader.nextDouble();
        double fifth = reader.nextDouble();
        double sixth = reader.nextDouble();
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
        InputStream input = new SampleBuilder().appendln("8172368367890").buildAsInputStream();

        Reader reader = new Reader(input);
        long nextLong = reader.nextLong();
        reader.close();

        assertThat(nextLong).isEqualTo(8172368367890L);
    }

    @Test
    void shouldReadNegativeLong() throws Exception {
        InputStream input = new SampleBuilder().appendln("-123578918902").buildAsInputStream();

        Reader reader = new Reader(input);
        long nextLong = reader.nextLong();
        reader.close();

        assertThat(nextLong).isEqualTo(-123578918902L);
    }

    @Test
    void shouldReadChainOfPositiveAndNegativeLongs() throws Exception {
        InputStream input = new SampleBuilder()
                .appendln("8172368367890 -1789236812893 891723689713 -31723581237 59787712587 -123123123123")
                .buildAsInputStream();

        Reader reader = new Reader(input);
        long first = reader.nextLong();
        long second = reader.nextLong();
        long third = reader.nextLong();
        long fourth = reader.nextLong();
        long fifth = reader.nextLong();
        long sixth = reader.nextLong();
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
        InputStream input = new SampleBuilder()
                .appendln("6546546565    -4326757896")
                .appendln("786676767")
                .buildAsInputStream();

        Reader reader = new Reader(input);
        long first = reader.nextLong();
        long second = reader.nextLong();
        long third = reader.nextLong();
        reader.close();

        assertThat(first).isEqualTo(6546546565L);
        assertThat(second).isEqualTo(-4326757896L);
        assertThat(third).isEqualTo(786676767);
    }

    @Test
    void shouldReadChar() throws Exception {
        InputStream input = new SampleBuilder().appendln("a").buildAsInputStream();

        Reader reader = new Reader(input);
        char nextChar = reader.nextChar();
        reader.close();

        assertThat(nextChar).isEqualTo('a');
    }

    @Test
    void shouldReadMultipleChars() throws Exception {
        InputStream input = new SampleBuilder().appendln("a 1 /").buildAsInputStream();

        Reader reader = new Reader(input);
        char a = reader.nextChar();
        char one = reader.nextChar();
        char slash = reader.nextChar();
        reader.close();

        assertThat(a).isEqualTo('a');
        assertThat(one).isEqualTo('1');
        assertThat(slash).isEqualTo('/');
    }

    @Test
    void shouldReadIntegersWithOtherCharactersInBetween() throws Exception {
        InputStream input = new SampleBuilder().appendln("12a34Z56&78/9").buildAsInputStream();

        Reader reader = new Reader(input);
        int firstInt = reader.nextInt();
        int secondInt = reader.nextInt();
        int thirdInt = reader.nextInt();
        int fourthInt = reader.nextInt();
        int fifthInt = reader.nextInt();
        reader.close();

        assertThat(firstInt).isEqualTo(12);
        assertThat(secondInt).isEqualTo(34);
        assertThat(thirdInt).isEqualTo(56);
        assertThat(fourthInt).isEqualTo(78);
        assertThat(fifthInt).isEqualTo(9);
    }

    @Test
    void shouldReadLongsWithOtherCharactersInBetween() throws Exception {
        InputStream input = new SampleBuilder().appendln("12a34Z56&78/9").buildAsInputStream();

        Reader reader = new Reader(input);
        long firstLong = reader.nextLong();
        long secondLong = reader.nextLong();
        long thirdLong = reader.nextLong();
        long fourthLong = reader.nextLong();
        long fifthLong = reader.nextLong();
        reader.close();

        assertThat(firstLong).isEqualTo(12);
        assertThat(secondLong).isEqualTo(34);
        assertThat(thirdLong).isEqualTo(56);
        assertThat(fourthLong).isEqualTo(78);
        assertThat(fifthLong).isEqualTo(9);
    }

    @Test
    void shouldReadDoublesWithOtherCharactersInBetween() throws Exception {
        InputStream input = new SampleBuilder().appendln("12a3.4Z56&7.88/9").buildAsInputStream();

        Reader reader = new Reader(input);
        double firstDouble = reader.nextDouble();
        double secondDouble = reader.nextDouble();
        double thirdDouble = reader.nextDouble();
        double fourthDouble = reader.nextDouble();
        double fifthDouble = reader.nextDouble();
        reader.close();

        assertThat(firstDouble).isCloseTo(12, within(0.1));
        assertThat(secondDouble).isCloseTo(3.4, within(0.1));
        assertThat(thirdDouble).isCloseTo(56, within(0.1));
        assertThat(fourthDouble).isCloseTo(7.88, within(0.1));
        assertThat(fifthDouble).isCloseTo(9, within(0.1));
    }

    @Test
    void shouldSkipNChars() throws Exception {
        InputStream input = new SampleBuilder().appendln("Dia 5").buildAsInputStream();

        Reader reader = new Reader(input);
        reader.skip(4);
        int day = reader.nextInt();
        reader.close();

        assertThat(day).isEqualTo(5);
    }
}
