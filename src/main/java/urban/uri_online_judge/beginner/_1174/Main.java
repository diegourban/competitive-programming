package urban.uri_online_judge.beginner._1174;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.uri_online_judge.Reader;

/**
 * Array Selection I
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1174
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat numberFormat;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		numberFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			double x = reader.nextDouble();
			if (x <= 10) {
				sb.append("A[").append(i).append("] = ").append(numberFormat.format(x)).append(System.lineSeparator());
			}
		}

		reader.close();

		return sb.toString();
	}

}
