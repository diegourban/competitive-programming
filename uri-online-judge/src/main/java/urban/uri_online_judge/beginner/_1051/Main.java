package urban.uri_online_judge.beginner._1051;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.uri_online_judge.Reader;

/**
 * Taxes
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1051
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("#0.00", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double salary = reader.nextDouble();
		reader.close();

		double taxes = 0;

		if (salary <= 2000) {
			return "Isento" + System.lineSeparator();
		} else {
			salary = salary - 2000;
			if (salary >= 1000) {
				taxes += 80; // 1000 * 0.08
				salary -= 1000;
				if (salary >= 1500) {
					taxes += 270; // 1500 * 0.18
					salary -= 1500;
					taxes += salary * 0.28;
				} else {
					taxes += salary * 0.18;
				}
			} else {
				taxes += salary * 0.08;
			}
		}

		return "R$ " + formatter.format(taxes) + System.lineSeparator();
	}

}
