package urban.common;

import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ReaderTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Reader(null));
    }

    @Test
    public void shouldHandleEmptyInput() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();

        Reader reader = new Reader(input);
        String empty = reader.readLine();
        reader.close();

        assertEquals("", empty);
    }

    @Test(expected = EOFException.class)
    public void shouldHandleEOF() throws IOException {
        InputStream input = new SampleBuilder().append(1).buildAsInputStream();

        Reader reader = new Reader(input);
        int i = reader.nextInt();
        int j = reader.nextInt();
        reader.close();
    }

    @Test
    public void shouldReadUntilEOF() throws IOException {
        String[] inputs = {"first line", "second line", "last line"};
        InputStream input = new SampleBuilder().appendln(inputs[0]).appendln(inputs[1]).append(inputs[2]).buildAsInputStream();

        Reader reader = new Reader(input);
        int i = 0;
        while(!reader.isEOF()) {
            String line = reader.readLine();
            assertEquals(inputs[i], line);
            i++;
        }
        reader.close();
    }

    @Test
    public void shouldHandleCloseAlreadyClosedReader() throws IOException {
        InputStream input = new SampleBuilder().buildAsInputStream();

        Reader reader = new Reader(input);
        assertFalse(reader.isClosed());
        reader.close();
        assertTrue(reader.isClosed());
        reader.close();
        assertTrue(reader.isClosed());
    }

    @Test
    public void shouldReadOneLine() throws IOException {
        InputStream input = new SampleBuilder().appendln("this is a line").buildAsInputStream();

        Reader reader = new Reader(input);
        String line = reader.readLine();
        reader.close();

        assertEquals("this is a line", line);
    }

    @Test
    public void shouldReadTwoLines() throws IOException {
        InputStream input = new SampleBuilder().appendln("this is a line").appendln("this is another line")
                .buildAsInputStream();

        Reader reader = new Reader(input);
        String firstLine = reader.readLine();
        String secondLine = reader.readLine();
        reader.close();

        assertEquals("this is a line", firstLine);
        assertEquals("this is another line", secondLine);
    }

    @Test
    public void shouldJumpEmptyLines() throws IOException {
        InputStream input = new SampleBuilder().appendln("").appendln("this is a line").buildAsInputStream();

        Reader reader = new Reader(input);
        String line = reader.readLine();
        reader.close();

        assertEquals("this is a line", line);
    }

    @Test
    public void shouldReadPositiveIntegerUnit() throws IOException {
        InputStream input = new SampleBuilder().appendln("5").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(5, nextInt);
    }

    @Test
    public void shouldReadIntegerAfterSpace() throws IOException {
        InputStream input = new SampleBuilder().appendln(" 2").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(2, nextInt);
    }

    @Test
    public void shouldReadNegativeIntegerUnit() throws IOException {
        InputStream input = new SampleBuilder().appendln("-4").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(-4, nextInt);
    }

    @Test
    public void shouldReadPositiveIntegerDozen() throws IOException {
        InputStream input = new SampleBuilder().appendln("16").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(16, nextInt);
    }

    @Test
    public void shouldReadNegativeIntegerDozen() throws IOException {
        InputStream input = new SampleBuilder().appendln("-20").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(-20, nextInt);
    }

    @Test
    public void shouldReadPositiveIntegerHundred() throws IOException {
        InputStream input = new SampleBuilder().appendln("123").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(123, nextInt);
    }

    @Test
    public void shouldReadNegativeIntegerHundred() throws IOException {
        InputStream input = new SampleBuilder().appendln("-321").buildAsInputStream();

        Reader reader = new Reader(input);
        int nextInt = reader.nextInt();
        reader.close();

        assertEquals(-321, nextInt);
    }

    @Test
    public void shouldReadChainOfPositiveAndNegativeIntegers() throws IOException {
        InputStream input = new SampleBuilder().appendln("-123 987 -88 74 -9 7").buildAsInputStream();

        Reader reader = new Reader(input);
        int first = reader.nextInt();
        int second = reader.nextInt();
        int third = reader.nextInt();
        int fourth = reader.nextInt();
        int fifth = reader.nextInt();
        int sixth = reader.nextInt();
        reader.close();

        assertEquals(-123, first);
        assertEquals(987, second);
        assertEquals(-88, third);
        assertEquals(74, fourth);
        assertEquals(-9, fifth);
        assertEquals(7, sixth);
    }

    @Test
    public void shouldReadPositiveDoubleUnit() throws IOException {
        InputStream input = new SampleBuilder().appendln("1.1").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(1.1, nextDouble, 0.1);
    }

    @Test
    public void shouldReadDoubleAfterSpace() throws IOException {
        InputStream input = new SampleBuilder().appendln(" 5.6").buildAsInputStream();

        Reader reader = new Reader(input);
        double d = reader.nextDouble();
        reader.close();

        assertEquals(5.6, d, 0.1);
    }

    @Test
    public void shouldReadNegativeDoubleUnit() throws IOException {
        InputStream input = new SampleBuilder().appendln("-2.3").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(-2.3, nextDouble, 0.1);
    }

    @Test
    public void shouldReadPositiveDoubleDozen() throws IOException {
        InputStream input = new SampleBuilder().appendln("12.7").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(12.7, nextDouble, 0.1);
    }

    @Test
    public void shouldReadNegativeDoubleDozen() throws IOException {
        InputStream input = new SampleBuilder().appendln("-99.9").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(-99.9, nextDouble, 0.1);
    }

    @Test
    public void shouldReadPositiveDoubleHundred() throws IOException {
        InputStream input = new SampleBuilder().appendln("612.9").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(612.9, nextDouble, 0.1);
    }

    @Test
    public void shouldReadNegativeDoubleHundred() throws IOException {
        InputStream input = new SampleBuilder().appendln("-193.6").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(-193.6, nextDouble, 0.1);
    }

    @Test
    public void shouldDoubleWithTwoDecimalPlaces() throws IOException {
        InputStream input = new SampleBuilder().appendln("5.68").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(5.68, nextDouble, 0.1);
    }

    @Test
    public void shouldDoubleWithThreeDecimalPlaces() throws IOException {
        InputStream input = new SampleBuilder().appendln("45.771").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(45.771, nextDouble, 0.1);
    }

    @Test
    public void shouldDoubleWithNineDecimalPlaces() throws IOException {
        InputStream input = new SampleBuilder().appendln("0.123456789").buildAsInputStream();

        Reader reader = new Reader(input);
        double nextDouble = reader.nextDouble();
        reader.close();

        assertEquals(0.123456789, nextDouble, 0.1);
    }

    @Test
    public void shouldReadChainOfPositiveAndNegativeDoubles() throws IOException {
        InputStream input = new SampleBuilder().appendln("-1.23 98.7 -8.8 7.4 -9 7").buildAsInputStream();

        Reader reader = new Reader(input);
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        double third = reader.nextDouble();
        double fourth = reader.nextDouble();
        double fifth = reader.nextDouble();
        double sixth = reader.nextDouble();
        reader.close();

        assertEquals(-1.23, first, 0.1);
        assertEquals(98.7, second, 0.1);
        assertEquals(-8.8, third, 0.1);
        assertEquals(7.4, fourth, 0.1);
        assertEquals(-9, fifth, 0.1);
        assertEquals(7, sixth, 0.1);
    }

    @Test
    public void shouldReadPositiveLong() throws IOException {
        InputStream input = new SampleBuilder().appendln("8172368367890").buildAsInputStream();

        Reader reader = new Reader(input);
        long nextLong = reader.nextLong();
        reader.close();

        assertEquals(8172368367890l, nextLong);
    }

    @Test
    public void shouldReadNegativeLong() throws IOException {
        InputStream input = new SampleBuilder().appendln("-123578918902").buildAsInputStream();

        Reader reader = new Reader(input);
        long nextLong = reader.nextLong();
        reader.close();

        assertEquals(-123578918902l, nextLong);
    }

    @Test
    public void shouldReadChainOfPositiveAndNegativeLongs() throws IOException {
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

        assertEquals(8172368367890l, first);
        assertEquals(-1789236812893l, second);
        assertEquals(891723689713l, third);
        assertEquals(-31723581237l, fourth);
        assertEquals(59787712587l, fifth);
        assertEquals(-123123123123l, sixth);
    }

    @Test
    public void shouldReadLongsWithSpacesAndLineBreaks() throws IOException {
        InputStream input = new SampleBuilder().appendln("6546546565    -4326757896").appendln("786676767")
                .buildAsInputStream();

        Reader reader = new Reader(input);
        long first = reader.nextLong();
        long second = reader.nextLong();
        long third = reader.nextLong();
        reader.close();

        assertEquals(6546546565l, first);
        assertEquals(-4326757896l, second);
        assertEquals(786676767, third);
    }

    @Test
    public void shouldReadChar() throws IOException {
        InputStream input = new SampleBuilder().appendln("a").buildAsInputStream();

        Reader reader = new Reader(input);
        char nextChar = reader.nextChar();
        reader.close();

        assertEquals('a', nextChar);
    }

    @Test
    public void shouldReadMultipleChars() throws IOException {
        InputStream input = new SampleBuilder().appendln("a 1 /").buildAsInputStream();

        Reader reader = new Reader(input);
        char a = reader.nextChar();
        char one = reader.nextChar();
        char slash = reader.nextChar();
        reader.close();

        assertEquals('a', a);
        assertEquals('1', one);
        assertEquals('/', slash);
    }

    @Test
    public void shouldReadIntegersWithOtherCharactersInBetween() throws IOException {
        InputStream input = new SampleBuilder().appendln("12a34Z56&78/9").buildAsInputStream();

        Reader reader = new Reader(input);
        int firstInt = reader.nextInt();
        int secondInt = reader.nextInt();
        int thirdInt = reader.nextInt();
        int fourthInt = reader.nextInt();
        int fifthInt = reader.nextInt();
        reader.close();

        assertEquals(12, firstInt);
        assertEquals(34, secondInt);
        assertEquals(56, thirdInt);
        assertEquals(78, fourthInt);
        assertEquals(9, fifthInt);
    }

    @Test
    public void shouldReadLongsWithOtherCharactersInBetween() throws IOException {
        InputStream input = new SampleBuilder().appendln("12a34Z56&78/9").buildAsInputStream();

        Reader reader = new Reader(input);
        long firstLong = reader.nextLong();
        long secondLong = reader.nextLong();
        long thirdLong = reader.nextLong();
        long fourthLong = reader.nextLong();
        long fifthLong = reader.nextLong();
        reader.close();

        assertEquals(12, firstLong);
        assertEquals(34, secondLong);
        assertEquals(56, thirdLong);
        assertEquals(78, fourthLong);
        assertEquals(9, fifthLong);
    }

    @Test
    public void shouldReadDoublesWithOtherCharactersInBetween() throws IOException {
        InputStream input = new SampleBuilder().appendln("12a3.4Z56&7.88/9").buildAsInputStream();

        Reader reader = new Reader(input);
        double firstDouble = reader.nextDouble();
        double secondDouble = reader.nextDouble();
        double thirdDouble = reader.nextDouble();
        double fourthDouble = reader.nextDouble();
        double fifthDouble = reader.nextDouble();
        reader.close();

        assertEquals(12, firstDouble, 0.1);
        assertEquals(3.4, secondDouble, 0.1);
        assertEquals(56, thirdDouble, 0.1);
        assertEquals(7.88, fourthDouble, 0.1);
        assertEquals(9, fifthDouble, 0.1);
    }

    @Test
    public void shouldSkipNChars() throws IOException {
        InputStream input = new SampleBuilder().appendln("Dia 5").buildAsInputStream();

        Reader reader = new Reader(input);
        reader.skip(4);
        int day = reader.nextInt();
        reader.close();

        assertEquals(5, day);
    }

}
