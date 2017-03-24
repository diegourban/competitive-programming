package urban.uri_online_judge.beginner._1921;

import urban.common.Reader;
import urban.common.math.Geometry;

import java.io.IOException;
import java.io.InputStream;

/**
 * Guilherme and His Kites
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1921
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        long n = reader.nextLong();
        reader.close();

        long result = Geometry.diagonalsOfPolygonWithSides(n);
        return result + System.lineSeparator();
    }

}
