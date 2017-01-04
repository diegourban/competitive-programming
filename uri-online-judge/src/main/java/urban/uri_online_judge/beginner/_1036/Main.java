package urban.uri_online_judge.beginner._1036;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Bhaskara's Formula
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1036
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("##0.00000", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double A = reader.nextDouble();
		double B = reader.nextDouble();
		double C = reader.nextDouble();
		reader.close();

		if (A == 0) {
			return "Impossivel calcular" + System.lineSeparator();
		}

		double delta = B * B - 4 * A * C;

		if (delta < 0) {
			return "Impossivel calcular" + System.lineSeparator();
		}

		double R1 = (-B + Math.sqrt(delta)) / (2 * A);
		double R2 = (-B - Math.sqrt(delta)) / (2 * A);

		StringBuilder sb = new StringBuilder();
		sb.append("R1 = ").append(formatter.format(R1)).append(System.lineSeparator());
		sb.append("R2 = ").append(formatter.format(R2)).append(System.lineSeparator());

		return sb.toString();
	}

}