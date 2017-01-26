package urban.uri_online_judge.beginner._1827;

import urban.common.Reader;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Square Array IV
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1827
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        StringBuilder sb = new StringBuilder();
        while(true) {
            try {
                int n = reader.nextInt();
                int innerRange = n / 3;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i >= innerRange && j >= innerRange && i < n - innerRange && j < n - innerRange) {
                            if(n / 2 == i && i == j) {
                                if(n % 2 == 0) {
                                    sb.append(1);
                                } else {
                                    sb.append(4);
                                }
                            } else {
                                sb.append(1);
                            }
                        } else {
                            if (j + i == n - 1) {
                                sb.append(3);
                            } else if (j - i == 0) {
                                sb.append(2);
                            } else {
                                sb.append(0);
                            }
                        }
                    }
                    sb.append(System.lineSeparator());
                }

                sb.append(System.lineSeparator());
            } catch(EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

    public static class Reader {

        private final int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private final byte[] buffer;
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

        private boolean isEOF() {
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


}
