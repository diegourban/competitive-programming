package urban.uri_online_judge.beginner._1045;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import urban.common.Reader;

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
		double[] array = new double[3];
		array[0] = reader.nextDouble();
		array[1] = reader.nextDouble();
		array[2] = reader.nextDouble();
		reader.close();
		
		Arrays.sort(array);

		double min = array[0];
		double med = array[1];
		double max = array[2];
		
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
			} else {
				if(max == med || med == min) {
					sb.append("TRIANGULO ISOSCELES").append(LS);
				}
			}
		}
		
		return sb.toString();
	}

}
