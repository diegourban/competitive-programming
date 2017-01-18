package urban.common;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Solution extracted from
 * http://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
 */
public class Reader {

    private final int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader(InputStream input) {
        din = new DataInputStream(input);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
        byte[] buf = new byte[10000]; // line length
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

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        boolean neg = (c == '-');
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

    public char nextChar() throws IOException {
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        return (char) c;
    }

    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        boolean neg = (c == '-');
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

    public double nextDouble() throws IOException {
        double ret = 0;
        double div = 1;
        byte c = read();

        while (c <= ' ') {
            c = read();
        }

        boolean neg = (c == '-');
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

    public void skip(int n) throws IOException {
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
        if(isEOF()) {
            throw new EOFException();
        }
        if (bufferPointer == bytesRead) {
            fillBuffer();
        }

        return buffer[bufferPointer++];
    }

    public boolean isEOF() {
        return bytesRead == -1;
    }

    public void close() throws IOException {
        if (din != null) {
            din.close();
            din = null;
        }
    }

    public boolean isClosed() {
        return din == null;
    }

}
