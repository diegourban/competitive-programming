package io.github.diegourban.algorithms.io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

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
    private DataInputStream din;
    private final byte[] buffer;
    private int bufferPointer, bytesRead;

    /**
     * Creates a reader over the given stream. Nothing is read until the first read method is called.
     *
     * @param input the stream to read from; it is closed by {@link #close()}
     */
    public Reader(final InputStream input) {
        din = new DataInputStream(input);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    /**
     * Reads the next non-empty line.
     * <p>
     * Leading {@code '\n'} and {@code '\r'} bytes are skipped, so blank lines are never returned; the line ends at
     * the next {@code '\n'} or {@code '\r'}, which is consumed but not included. Lines longer than 10,000 bytes are
     * not supported.
     *
     * @return the line without its terminator; the remaining text, or an empty string, if the input ends first
     * @throws EOFException if a previous read already reached the end of the input
     * @throws ArrayIndexOutOfBoundsException if the line is longer than 10,000 bytes
     * @throws IOException if the underlying stream fails
     */
    public String readLine() throws IOException {
        final byte[] buf = new byte[10000]; // line length
        int cnt = 0;
        int c = 0;

        while ((c = read()) != -1) {
            if (c == '\n' || c == '\r') {
                if (cnt == 0) {
                    continue;
                }
                break;
            }
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
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
        int ret = 0;
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        final boolean neg = (c == '-');
        if (neg) {
            c = read();
        }

        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg) {
            return -ret;
        }

        return ret;
    }

    /**
     * Reads the next character that is not whitespace (any byte above {@code ' '}).
     *
     * @return the character read
     * @throws EOFException if the input ends before such a character is found
     * @throws IOException if the underlying stream fails
     */
    public char nextChar() throws IOException {
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        return (char) c;
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
        long ret = 0;
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        final boolean neg = (c == '-');
        if (neg) {
            c = read();
        }

        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg) {
            return -ret;
        }

        return ret;
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
        double ret = 0;
        double div = 1;
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        final boolean neg = (c == '-');
        if (neg) {
            c = read();
        }

        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg) {
            return -ret;
        }

        return ret;
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
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (isEOF()) {
            buffer[0] = -1;
        }
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
        if (din != null) {
            din.close();
            din = null;
        }
    }

    /**
     * Tells whether {@link #close()} has been called.
     *
     * @return {@code true} if this reader is closed, {@code false} otherwise
     */
    public boolean isClosed() {
        return din == null;
    }
}
