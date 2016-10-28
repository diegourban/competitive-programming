package urban.uri_online_judge.beginner._1012;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.uri_online_judge.Reader;

/**
 * Area
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1012
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		decimalFormatSymbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("##0.000", decimalFormatSymbols);

		Reader reader = new Reader(input);
		double A = reader.nextDouble();
		double B = reader.nextDouble();
		double C = reader.nextDouble();
		reader.close();

		StringBuilder output = new StringBuilder();
		output = output.append("TRIANGULO: ").append(formatter.format(.5 * A * C)).append(System.lineSeparator());
		output = output.append("CIRCULO: ").append(formatter.format(3.14159 * C * C)).append(System.lineSeparator());
		output = output.append("TRAPEZIO: ").append(formatter.format(.5 * (A + B) * C)).append(System.lineSeparator());
		output = output.append("QUADRADO: ").append(formatter.format(B * B)).append(System.lineSeparator());
		output = output.append("RETANGULO: ").append(formatter.format(A * B)).append(System.lineSeparator());
		return output.toString();
	}

}
