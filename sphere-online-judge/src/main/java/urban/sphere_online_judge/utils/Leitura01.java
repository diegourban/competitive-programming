package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

public class Leitura01 {

    public static void main(String[] args) throws Exception {

        init();
        //init("G:/Java/eclipse-workspace/obi/calcula/in.txt");
        PrintWriter out = new PrintWriter(System.out);

        int count = 1;

        int qtd = readInt();
        int soma;

        while (qtd > 0) {
            nextLine();
            soma = 0;
            while (qtd-- > 0) {
                soma += readIntSinal(10);
            }
            nextLine();
            out.print("Teste ");
            out.println(count++);
            out.println(soma);
            out.println();

            qtd = readInt();
        }

        out.close();

    }

    static private int posIn;
    static private int ready;
    static private byte[] bytes;
    static private InputStream in;

    static final private int strLength = 30;

    static void init(InputStream input) throws Exception {
        in = input;
        getBytes(in.available());
    }

    static void init(String path) throws Exception {
        init(new FileInputStream(path));
    }

    static void init() throws Exception {
        init(System.in);
    }

    static void getBytes(int count) throws Exception {
        bytes = new byte[count];
        posIn = 0;
        ready = in.read(bytes, 0, bytes.length);
    }

    static final void skip(int n) {
        posIn += n;
    }

    static final void skipSpace() throws Exception {
        while (bt() == 32 || bt() == 13) {
            posIn++;
        }
    }

    static final void nextLine() throws Exception {
        skipSpace();
        if (bt() == 10) {
            posIn++;
        }
    }

    static final String nextString() throws Exception {
        byte[] stringBytes = new byte[strLength];

        int length = 0;
        byte bt = bt();
        while (bt > 47 && bt < 123) {
            posIn++;
            stringBytes[length++] = bt;
            length++;
            bt = bt();

        }
        return new String(stringBytes, 0, length);
    }

    static final String nextStringSB() throws Exception {
        StringBuilder sb = new StringBuilder();

        int length = 0;
        byte bt = bt();
        while (bt > 47 && bt < 123) {
            posIn++;
            sb.append((char) bt);
            length++;
            bt = bt();

        }
        return sb.toString();
    }

    static final int readInt() throws Exception {
        return readInt(10);
    }

    static final int readInt(int radix) throws Exception {
        int n = 0;
        byte b;
        while ((b = bt()) > 47) {
            n *= radix;
            n += (b - 48);
            posIn++;
        }
        skipSpace();
        return n;
    }

    static final int readIntSinal(int radix) throws Exception {
        int n = 0;
        byte b = bt();

        boolean negativo = false;

        if (b == '-') {
            negativo = true;
            posIn++;
        }
        if (b == '+') posIn++;

        while ((b = bt()) > 47) {
            n *= radix;
            n += (b - 48);
            posIn++;
        }
        if (negativo) return n * -1;
        return n;
    }

    static byte bt() throws Exception {
        if (posIn == ready) {
            getBytes(8192);
        }
        return bytes[posIn];
    }

    static final boolean hasNext() throws Exception {
        if (posIn < ready) {
            return true;
        }
        getBytes(8192);
        return ready > 0;

    }

}
