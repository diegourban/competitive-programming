package urban.uri_online_judge.beginner._1014;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Consumption
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1014
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
		int X = reader.nextInt();
		double Y = reader.nextDouble();
		reader.close();

		return formatter.format(X / Y) + " km/l" + System.lineSeparator();
	}

}
