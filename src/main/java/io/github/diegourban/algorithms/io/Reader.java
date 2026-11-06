package io.github.diegourban.algorithms.io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Fast, buffered reader of ASCII tokens and lines from an {@link InputStream}, for competitive programming.
 * <p>
 * Input is read in 64 KiB chunks and decoded byte by byte, so only single-byte (ASCII) input is handled correctly.
 * The token methods do no validation: any non-digit byte ends a number, and nothing checks for overflow.
 * <p>
 * End of input: the first read past the end yields an end marker; any read after that throws {@link EOFException}.
 * In practice the token methods throw {@code EOFException} when no further token remains, while {@link #readLine()}
 * first returns whatever is left (possibly an empty string) and only throws on the following call.
 * <p>
 * Solution extracted from
 * http://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
 */
public class Reader {

    private static final int BUFFER_SIZE = 1 << 16;
    private static final int INITIAL_LINE_CAPACITY = 64;
    private DataInputStream input;
    private final byte[] buffer;
    private int bufferPointer;
    private int bytesRead;

    /**
     * Creates a reader over the given stream. Nothing is read until the first read method is called.
     *
     * @param input the stream to read from; it is closed by {@link #close()}
     */
    public Reader(final InputStream input) {
        this.input = new DataInputStream(input);
        buffer = new byte[BUFFER_SIZE];
    }

    /**
     * Reads the next non-empty line.
     * <p>
     * Leading {@code '\n'} and {@code '\r'} bytes are skipped, so blank lines are never returned; the line ends at
     * the next {@code '\n'} or {@code '\r'}, which is consumed but not included.
     *
     * @return the line without its terminator; the remaining text, or an empty string, if the input ends first
     * @throws EOFException if a previous read already reached the end of the input
     * @throws IOException if the underlying stream fails
     */
    public String readLine() throws IOException {
        byte[] line = new byte[INITIAL_LINE_CAPACITY];
        int length = 0;
        int nextByte = 0;

        while ((nextByte = read()) != -1) {
            if (nextByte == '\n' || nextByte == '\r') {
                if (length == 0) {
                    continue;
                }
                break;
            }
            if (length == line.length) {
                line = Arrays.copyOf(line, line.length * 2);
            }
            line[length++] = (byte) nextByte;
        }
        return new String(line, 0, length);
    }

    /**
     * Reads the next whitespace-separated integer, with an optional leading {@code '-'}.
     * <p>
     * Bytes up to and including {@code ' '} are skipped first. Digits are read until the first non-digit byte,
     * which is consumed. Values outside the {@code int} range overflow silently.
     *
     * @return the integer read
     * @throws EOFException if the input ends before a token is found
     * @throws IOException if the underlying stream fails
     */
    public int nextInt() throws IOException {
        int result = 0;
        byte nextByte = skipWhitespace();

        final boolean negative = (nextByte == '-');
        if (negative) {
            nextByte = read();
        }

        do {
            result = result * 10 + nextByte - '0';
        } while ((nextByte = read()) >= '0' && nextByte <= '9');

        if (negative) {
            return -result;
        }

        return result;
    }

    /**
     * Reads the next character that is not whitespace (any byte above {@code ' '}).
     *
     * @return the character read
     * @throws EOFException if the input ends before such a character is found
     * @throws IOException if the underlying stream fails
     */
    public char nextChar() throws IOException {
        final byte nextByte = skipWhitespace();

        return (char) nextByte;
    }

    /**
     * Reads the next whitespace-separated long, with an optional leading {@code '-'}.
     * <p>
     * Parses like {@link #nextInt()}; values outside the {@code long} range overflow silently.
     *
     * @return the long read
     * @throws EOFException if the input ends before a token is found
     * @throws IOException if the underlying stream fails
     */
    public long nextLong() throws IOException {
        long result = 0;
        byte nextByte = skipWhitespace();

        final boolean negative = (nextByte == '-');
        if (negative) {
            nextByte = read();
        }

        do {
            result = result * 10 + nextByte - '0';
        } while ((nextByte = read()) >= '0' && nextByte <= '9');

        if (negative) {
            return -result;
        }

        return result;
    }

    /**
     * Reads the next whitespace-separated decimal number, such as {@code -12.5}.
     * <p>
     * Accepts an optional leading {@code '-'}, digits and an optional {@code '.'} followed by digits. Exponent
     * notation is not supported. The byte that ends the number is consumed.
     *
     * @return the number read
     * @throws EOFException if the input ends before a token is found
     * @throws IOException if the underlying stream fails
     */
    public double nextDouble() throws IOException {
        double result = 0;
        double div = 1;
        byte nextByte = skipWhitespace();

        final boolean negative = (nextByte == '-');
        if (negative) {
            nextByte = read();
        }

        do {
            result = result * 10 + nextByte - '0';
        } while ((nextByte = read()) >= '0' && nextByte <= '9');

        if (nextByte == '.') {
            while ((nextByte = read()) >= '0' && nextByte <= '9') {
                result += (nextByte - '0') / (div *= 10);
            }
        }

        if (negative) {
            return -result;
        }

        return result;
    }

    /**
     * Discards the next {@code n} bytes.
     *
     * @param n the number of bytes to discard; nothing happens if it is zero or negative
     * @throws EOFException if a read is attempted after the end of the input was already reached
     * @throws IOException if the underlying stream fails
     */
    public void skip(final int n) throws IOException {
        for (int i = 0; i < n; i++) {
            read();
        }
    }

    private void fillBuffer() throws IOException {
        bufferPointer = 0;
        bytesRead = input.read(buffer, 0, BUFFER_SIZE);
        if (isEOF()) {
            buffer[0] = -1;
        }
    }

    private byte skipWhitespace() throws IOException {
        byte nextByte = read();
        while (nextByte <= ' ') {
            nextByte = read();
        }
        return nextByte;
    }

    private byte read() throws IOException {
        if (isEOF()) {
            throw new EOFException();
        }
        if (bufferPointer == bytesRead) {
            fillBuffer();
        }

        return buffer[bufferPointer++];
    }

    private boolean isEOF() {
        return bytesRead == -1;
    }

    /**
     * Closes the underlying stream. Calling it again has no effect.
     *
     * @throws IOException if closing the underlying stream fails
     */
    public void close() throws IOException {
        if (input != null) {
            input.close();
            input = null;
        }
    }

    /**
     * Tells whether {@link #close()} has been called.
     *
     * @return {@code true} if this reader is closed, {@code false} otherwise
     */
    public boolean isClosed() {
        return input == null;
    }
}
