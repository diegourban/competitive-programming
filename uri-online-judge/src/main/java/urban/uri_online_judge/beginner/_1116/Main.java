package urban.uri_online_judge.beginner._1116;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Dividing X by Y
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1116
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("#0.0", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int n = reader.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();

			if (y == 0) {
				sb.append("divisao impossivel");
			} else {
				sb.append(formatter.format(x / (y * 1.0)));
			}

			sb.append(System.lineSeparator());
		}
		reader.close();

		return sb.toString();
	}

}
