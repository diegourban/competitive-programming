package urban.uri_online_judge.beginner._1045;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Triangle Types
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1045
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final String LS = System.lineSeparator();

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double A = reader.nextDouble();
		double B = reader.nextDouble();
		double C = reader.nextDouble();
		reader.close();

		double min = 0;
		double max = 0;
		double med = 0;

		if (A > B) {
			if (A > C) {
				max = A;
				if (B > C) {
					med = B;
					min = C;
				} else {
					med = C;
					min = B;
				}
			} else {
				med = A;
				max = C;
				min = B;
			}
		} else {
			if (B > C) {
				max = B;
				if (A > C) {
					med = A;
					min = C;
				} else {
					med = C;
					min = A;
				}
			} else {
				med = B;
				max = C;
				min = A;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		if (max >= med + min) {
			sb.append("NAO FORMA TRIANGULO").append(LS);
		} else {
			double maxSquared = max * max;
			double medSquared = med * med;
			double minSquared = min * min;

			if (maxSquared > medSquared + minSquared) {
				sb.append("TRIANGULO OBTUSANGULO").append(LS);
			} else if (maxSquared < medSquared + minSquared) {
				sb.append("TRIANGULO ACUTANGULO").append(LS);
			} else {
				sb.append("TRIANGULO RETANGULO").append(LS);
			}
			
			if (max == med && med == min) {
				sb.append("TRIANGULO EQUILATERO").append(LS);
			}

			if((max == med && med != min) || (med == min && min != max) || (max == min && min != med)) {
				sb.append("TRIANGULO ISOSCELES").append(LS);
			}
		}
		
		return sb.toString();
	}

}
