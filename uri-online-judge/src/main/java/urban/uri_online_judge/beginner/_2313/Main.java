package urban.uri_online_judge.beginner._2313;

import urban.common.Reader;
import urban.common.math.Geometry;
import urban.common.math.TriangleType;

import java.io.IOException;
import java.io.InputStream;

/**
 * Which Triangle
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2313
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        final int a = reader.nextInt();
        final int b = reader.nextInt();
        final int c = reader.nextInt();
        reader.close();

        StringBuilder sb = new StringBuilder();
        if (Geometry.isValidTriangle(a, b, c)) {
            sb.append("Valido-");
            TriangleType triangleType = Geometry.checkTriangleType(a, b, c);
            sb.append(triangleType.getName());
            sb.append(System.lineSeparator());
            sb.append("Retangulo: ");
            sb.append(Geometry.isRectangleTriangle(a, b, c) ? "S" : "N");
        } else {
            sb.append("Invalido");
        }
        sb.append(System.lineSeparator());

        return sb.toString();
    }

}