package urban.uri_online_judge.beginner._1041;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Coordinates of a Point
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1041
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double x = reader.nextDouble();
		double y = reader.nextDouble();
		reader.close();

		// origin
		if (x == 0 && y == 0) {
			return "Origem" + System.lineSeparator();
		}

		// x or y axes
		if (x == 0) {
			return "Eixo Y" + System.lineSeparator();
		}
		if (y == 0) {
			return "Eixo X" + System.lineSeparator();
		}

		// quadrants
		if (x > 0) {
			if(y > 0) {
				return "Q1" + System.lineSeparator();
			} else {
				return "Q4" + System.lineSeparator();
			}
		} else {
			if(y > 0) {
				return "Q2" + System.lineSeparator();
			} else {
				return "Q3" + System.lineSeparator();
			}
		}
	}

}
