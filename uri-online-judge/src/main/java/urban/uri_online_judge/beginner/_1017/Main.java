package urban.uri_online_judge.beginner._1017;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Fuel Spent
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1017
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("##0.000", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int timeSpentInHours = reader.nextInt();
		int averageSpeed = reader.nextInt();
		reader.close();

		double liters = (timeSpentInHours * averageSpeed) / 12.0; // 12km/L

		return formatter.format(liters) + System.lineSeparator();
	}

}