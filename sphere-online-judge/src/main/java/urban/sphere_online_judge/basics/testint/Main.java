package urban.sphere_online_judge.basics.testint;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Test 1
 * <p>
 * http://www.spoj.com/problems/TESTINT/
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int a = reader.nextInt();
        int b = reader.nextInt();
        reader.close();
        return (a + b) + System.lineSeparator();
    }

}
